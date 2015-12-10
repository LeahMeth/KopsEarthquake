package kops.earthquake;


import android.content.pm.FeatureGroupInfo;
import android.widget.TextView;

public class Earthquake {

    private double mag;
    private String place;

    public Earthquake(Earthquake e){
        this.mag = e.getFeatures().getProperties().getMag() ;
        this.place = e.getFeautures().getProperties().getPlace();
    }

    public Feature

    public double getMag(){
        return this.mag;
    }

    public String getPlace(){
        return this.place;
    }
}
