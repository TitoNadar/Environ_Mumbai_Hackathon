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
import tito.example.com.environ_mumbai_hackathon.Adapter.WaterFragmentAdapter;
import tito.example.com.environ_mumbai_hackathon.Helper.Common;
import tito.example.com.environ_mumbai_hackathon.Interface.WaterService;
import tito.example.com.environ_mumbai_hackathon.MainActivity;
import tito.example.com.environ_mumbai_hackathon.Model.Data;
import tito.example.com.environ_mumbai_hackathon.Model.Records;
import tito.example.com.environ_mumbai_hackathon.R;

/**
 * Created by tito on 10/3/18.
 */

public class WaterFragment extends Fragment {
    List<Records> recorditems=new ArrayList<>();
   WaterService waterService;
   RecyclerView recyclerView;
   RecyclerView.LayoutManager layoutManager;
    public WaterFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      Log.d("dovuam","reached");

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
     layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
       waterService= Common.getWaterService();
        waterService.getData().enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Response<Data> response, Retrofit retrofit) {
                recorditems=response.body().getRecords();
                Log.d("tito_respone",recorditems.size()+"");
                WaterFragmentAdapter waterFragmentAdapter=new WaterFragmentAdapter(getActivity(),recorditems);
                recyclerView.setAdapter(waterFragmentAdapter);
            }

            @Override
            public void onFailure(Throwable t) {
           Log.d("fail",t.getMessage());
            }
        });


        Log.d("tito_water_frag",recorditems.size()+"");


//        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if(position==0)
//                {
//                    openWall();
//                }
//                else{
//                    Intent intent=new Intent(getActivity(), Webview.class);
//                    intent.putExtra("webURL", Constants.urlShops[position]);
//                    startActivity(intent);
//                }
//            }
//        });
        return view;
    }
}
