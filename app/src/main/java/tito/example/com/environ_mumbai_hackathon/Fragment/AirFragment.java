package tito.example.com.environ_mumbai_hackathon.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;


import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import tito.example.com.environ_mumbai_hackathon.Adapter.AirFragmentAdapter;
import tito.example.com.environ_mumbai_hackathon.Helper.Common;
import tito.example.com.environ_mumbai_hackathon.Interface.AirService;
import tito.example.com.environ_mumbai_hackathon.MainActivity;
import tito.example.com.environ_mumbai_hackathon.Model.Data_air;
import tito.example.com.environ_mumbai_hackathon.Model.Dominant_pollutant_text;
import tito.example.com.environ_mumbai_hackathon.Model.Random_Recommendation;
import tito.example.com.environ_mumbai_hackathon.Model.Records;
import tito.example.com.environ_mumbai_hackathon.R;



/**
 * Created by tito on 10/3/18.
 */

public class AirFragment extends Fragment
{    RecyclerView recyclerView;
     RecyclerView.LayoutManager layoutManager;
    AirService airService;
    int aqi;
    String country,breezometer_description,pollutant_name;
    String dominant_pollutant_text_effects,dominant_pollutant_text_causes;
    String random_recommendation_children,random_recommendation_sport,random_recommendation_health,random_recommendation_inside,random_recommendation_outside;
    public AirFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        airService= Common.getAirService();
        airService.getAirData(Common.getApiUrl("40.7324296","-73.9977264",Common.API_KEY_AIR)).enqueue(new Callback<Data_air>() {
            @Override
            public void onResponse(Response<Data_air> response, Retrofit retrofit) {
                aqi=response.body().getCountry_aqi();
                country=response.body().getCountry_name();
                breezometer_description=response.body().getBreezometer_description();
                pollutant_name=response.body().getDominant_pollutant_canonical_name();
                dominant_pollutant_text_effects=response.body().getDominant_pollutant_text().getEffects();
                dominant_pollutant_text_causes=response.body().getDominant_pollutant_text().getCauses();

                random_recommendation_children=response.body().getRandom_recommendations().getChildren();
                random_recommendation_sport=response.body().getRandom_recommendations().getSport();
                random_recommendation_health=response.body().getRandom_recommendations().getHealth();
                random_recommendation_inside=response.body().getRandom_recommendations().getInside();
                random_recommendation_outside=response.body().getRandom_recommendations().getOutside();
             AirFragmentAdapter airFragmentAdapter=new AirFragmentAdapter(getActivity(),aqi,country,breezometer_description,pollutant_name,dominant_pollutant_text_effects,dominant_pollutant_text_causes,random_recommendation_children,random_recommendation_sport,random_recommendation_health,random_recommendation_inside,random_recommendation_outside);
           recyclerView.setAdapter(airFragmentAdapter);
            }

            @Override
            public void onFailure(Throwable t) {
              Log.d("error",t.getMessage());
            }
        });

        return view;
    }
}
