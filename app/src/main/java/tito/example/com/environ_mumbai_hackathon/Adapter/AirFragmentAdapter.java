package tito.example.com.environ_mumbai_hackathon.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import tito.example.com.environ_mumbai_hackathon.Helper.Common;
import tito.example.com.environ_mumbai_hackathon.Interface.ItemClickListener;
import tito.example.com.environ_mumbai_hackathon.Model.Records;
import tito.example.com.environ_mumbai_hackathon.R;

/**
 * Created by tito on 10/3/18.
 */

class AirSourceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    ItemClickListener itemClickListener;
    TextView airname,air_index;
    TextView breezometer_description;
    TextView dpn_value;
    TextView effects;
    TextView causes;



    public AirSourceViewHolder(View itemView) {
        super(itemView);
        air_index=(TextView)itemView.findViewById(R.id.wqi);
        airname= itemView.findViewById(R.id.rivername);
        breezometer_description=itemView.findViewById(R.id.breezometer_description);
        dpn_value=itemView.findViewById(R.id.dpn_value);
        effects=itemView.findViewById(R.id.effects);
        causes=itemView.findViewById(R.id.causes);
        itemView.setOnClickListener(this);
    }
    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false );
    }
}
public class AirFragmentAdapter extends RecyclerView.Adapter<AirSourceViewHolder>{
    private Context context;
  private int aqi;
  private String country,breezometer_description,pollutant_name,dominant_pollutant_text_effects,dominant_pollutant_text_causes, random_recommendation_children, random_recommendation_sport, random_recommendation_health, random_recommendation_inside, random_recommendation_outside;

    public AirFragmentAdapter(Context context, int aqi, String country, String breezometer_description, String pollutant_name, String dominant_pollutant_text_effects, String dominant_pollutant_text_causes, String random_recommendation_children, String random_recommendation_sport, String random_recommendation_health, String random_recommendation_inside, String random_recommendation_outside) {
        this.context = context;
        this.aqi = aqi;
        this.country = country;
        this.breezometer_description = breezometer_description;
        this.pollutant_name = pollutant_name;
        this.dominant_pollutant_text_effects = dominant_pollutant_text_effects;
        this.dominant_pollutant_text_causes = dominant_pollutant_text_causes;
        this.random_recommendation_children = random_recommendation_children;
        this.random_recommendation_sport = random_recommendation_sport;
        this.random_recommendation_health = random_recommendation_health;
        this.random_recommendation_inside = random_recommendation_inside;
        this.random_recommendation_outside = random_recommendation_outside;
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public AirSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.list_air_item,parent,false);
        return new AirSourceViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final AirSourceViewHolder holder,  final int position) {
     holder.airname.setText(country);
     holder.air_index.setText(aqi+"");
     holder.breezometer_description.setText(breezometer_description);
     holder.dpn_value.setText(pollutant_name);
     holder.effects.setText(dominant_pollutant_text_effects);
     holder.causes.setText(dominant_pollutant_text_causes);
     holder.setItemClickListener(new ItemClickListener() {
         @Override
         public void onClick(View view, int position, boolean isLongClick) {

         }
     });
    }
}
