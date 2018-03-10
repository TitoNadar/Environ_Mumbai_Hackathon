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

import tito.example.com.environ_mumbai_hackathon.Interface.ItemClickListener;
import tito.example.com.environ_mumbai_hackathon.Model.Records;
import tito.example.com.environ_mumbai_hackathon.R;

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
          Log.d("tito_water_adapter",records.size()+"");
       holder.river_name.setText(records.get(position).getLocations());
       holder.setItemClickListener(new ItemClickListener() {
           @Override
           public void onClick(View view, int position, boolean isLongClick) {

           }
       });

    }
}
