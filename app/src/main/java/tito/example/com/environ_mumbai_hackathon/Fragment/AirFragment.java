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
import tito.example.com.environ_mumbai_hackathon.Model.Records;
import tito.example.com.environ_mumbai_hackathon.R;



/**
 * Created by tito on 10/3/18.
 */

public class AirFragment extends Fragment
{    RecyclerView recyclerView;
     RecyclerView.LayoutManager layoutManager;
    AirService airService;
    List<Records> recordItems=new ArrayList<>();

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
             Log.d("check",Common.getApiUrl("40.7324296","-73.9977264",Common.API_KEY_AIR)+"");
                Log.d("air",response.body().getPollutants()+"");
            }

            @Override
            public void onFailure(Throwable t) {
              Log.d("error",t.getMessage());
            }
        });
      //  AirFragmentAdapter airFragmentAdapter=new AirFragmentAdapter(getActivity(),recordItems);
       // recyclerView.setAdapter(airFragmentAdapter);
        return view;
    }
}
