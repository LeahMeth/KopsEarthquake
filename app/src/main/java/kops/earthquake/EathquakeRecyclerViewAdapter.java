package kops.earthquake;


import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class EathquakeRecyclerViewAdapter extends RecyclerView.Adapter<EarthquakeViewHolder>{

    private Earthquake[] earthquakes;

    public EathquakeRecyclerViewAdapter(Earthquake[] earthquakes){
        this.earthquakes = earthquakes;
    }

    @Override
    public EarthquakeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(EarthquakeViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
