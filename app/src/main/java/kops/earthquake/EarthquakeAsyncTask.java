package kops.earthquake;

import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EarthquakeAsyncTask {

    private RecyclerView recyclerView;

    public EarthquakeAsyncTask(){

    }

    // done in background
    @Override
    protected String doInBackground(Long... params) {

        recyclerView = (RecyclerView) findViewById(R.id.list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

    }


    //gets done on UI thread
    @Override
    protected void onPostExecute() {
        super.onPostExecute();

    }

}
