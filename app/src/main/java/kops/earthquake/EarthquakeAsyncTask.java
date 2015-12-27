package kops.earthquake;

import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EarthquakeAsyncTask extends AsyncTask{

    private RecyclerView recyclerView;
    private Earthquake[] earthquakes;

    public EarthquakeAsyncTask(RecyclerView recyclerView){
        this.recyclerView = recyclerView;
    }

    // done in background
    @Override
    protected Earthquake[] doInBackground(Long... params) {


        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        try {
            URL url = new URL("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/significant_month.geojson");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream in = connection.getInputStream();
            earthquakes = gson.fromJson(new InputStreamReader(in), Earthquake[].class);
        }catch (IOException ex){
            ex.getMessage();
        }
        return earthquakes;
    }


    //gets done on UI thread
    @Override
    protected void onPostExecute(Earthquake[] earthquakes) {
        super.onPostExecute(earthquakes);
        EarthquakeRecyclerViewAdapter earthquakeRecyclerViewAdapter = new EarthquakeRecyclerViewAdapter(earthquakes);
        recyclerView.setAdapter(earthquakeRecyclerViewAdapter);
    }

}
