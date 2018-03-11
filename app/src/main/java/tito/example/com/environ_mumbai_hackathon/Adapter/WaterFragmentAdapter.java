package tito.example.com.environ_mumbai_hackathon.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
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

import tito.example.com.environ_mumbai_hackathon.Interface.ItemClickListener;
import tito.example.com.environ_mumbai_hackathon.MainActivity;
import tito.example.com.environ_mumbai_hackathon.Model.Records;
import tito.example.com.environ_mumbai_hackathon.R;
import tito.example.com.environ_mumbai_hackathon.River_Details;

/**
 * Created by tito on 10/3/18.
 */


class WaterSourceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    ItemClickListener itemClickListener;
    TextView water_index,river_name;


    public WaterSourceViewHolder(View itemView) {
        super(itemView);
        water_index=(TextView)itemView.findViewById(R.id.wqi);
        river_name=itemView.findViewById(R.id.rivername);
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
public class WaterFragmentAdapter extends RecyclerView.Adapter<WaterSourceViewHolder>{
    private Context context;
    private List<Records> records;


    public WaterFragmentAdapter(Context context,List<Records> records) {
        this.context = context;
        this.records=records;
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    @Override
    public WaterSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.list_water_item,parent,false);
        return new WaterSourceViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final WaterSourceViewHolder holder,  final int position) {
       holder.river_name.setText(records.get(position).getLocations());
       int x=Integer.parseInt(records.get(position).getPh_6_5_8_5___mean());
       switch(x)
       {
           case 1:holder.water_index.setText("0");
                  holder.water_index.setBackgroundColor();
                  break;
           case 2:holder.water_index.setText("2");
               holder.water_index.setBackgroundColor();
               break;
           case 3:holder.water_index.setText("4");
               holder.water_index.setBackgroundColor();
               break;
           case 4:holder.water_index.setText("8");
               holder.water_index.setBackgroundColor();
               break;
           case 5:holder.water_index.setText("24");
               holder.water_index.setBackgroundColor();
               break;
           case 6:holder.water_index.setText("55");
               holder.water_index.setBackgroundColor();
               break;
           case 7:holder.water_index.setText("91");
               holder.water_index.setBackgroundColor();
               break;
           case 8:holder.water_index.setText("82");
               holder.water_index.setBackgroundColor();
               break;
           case 9:holder.water_index.setText("47");
               holder.water_index.setBackgroundColor();
               break;
           case 10:holder.water_index.setText("19");
               holder.water_index.setBackgroundColor();
               break;
           case 11:holder.water_index.setText("7");
               holder.water_index.setBackgroundColor();
               break;
           case 12:holder.water_index.setText("2");
               holder.water_index.setBackgroundColor();
               break;
           case 13:holder.water_index.setText("0");
               holder.water_index.setBackgroundColor();
               break;

       }
       holder.setItemClickListener(new ItemClickListener() {
           @Override
           public void onClick(View view, int position, boolean isLongClick) {
             Intent intent=new Intent(context, River_Details.class);
             intent.putExtra("temp",records.get(position).getTemperature_in_degree_centigrade___mean());
             intent.putExtra("phlevel",records.get(position).getPh_6_5_8_5___mean());
             intent.putExtra("oxygen",records.get(position).getD_o_mg_l_4_mg_l___mean());
             intent.putExtra("nitrate",records.get(position).getNitrate__n_nitrite_n_mg_l___mean());
             intent.putExtra("fecal",records.get(position).getFecal_coliform_mpn_100ml_2500_mpn_100ml___mean());
               context.startActivity(intent);
           }
       });

    }
}
