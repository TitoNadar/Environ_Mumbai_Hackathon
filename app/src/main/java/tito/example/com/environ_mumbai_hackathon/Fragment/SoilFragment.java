package tito.example.com.environ_mumbai_hackathon.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import tito.example.com.environ_mumbai_hackathon.Adapter.SoilFragmentAdapter;
import tito.example.com.environ_mumbai_hackathon.MainActivity;
import tito.example.com.environ_mumbai_hackathon.Model.Records;
import tito.example.com.environ_mumbai_hackathon.R;

/**
 * Created by tito on 10/3/18.
 */

public class SoilFragment extends Fragment {
    List<Records> recordItems=new ArrayList<>();

    public SoilFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        MainActivity mainActivity=new MainActivity();
        recordItems=mainActivity.record_list;
        SoilFragmentAdapter soilFragmentAdapter=new SoilFragmentAdapter(getActivity(),recordItems);
        recyclerView.setAdapter(soilFragmentAdapter);


        return view;
    }
}
