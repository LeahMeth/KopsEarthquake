package kops.earthquake;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class EarthquakeViewHolder extends RecyclerView.ViewHolder{
    private TextView mag;
    private TextView place;


    public EarthquakeViewHolder (View itemView) {
        super(itemView);
        mag = (TextView) itemView.findViewById(R.id.mag);
        place = (TextView) itemView.findViewById(R.id.place);
    }

    public void bind(Earthquake earthquake, int position) {
        mag.setText(position+1  + ". Magnitude: " + String.valueOf(earthquake.getMag()));
        place.setText("Place: " + earthquake.getPlace());
    }
}
