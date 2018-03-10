package tito.example.com.environ_mumbai_hackathon.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import tito.example.com.environ_mumbai_hackathon.R;

/**
 * Created by tito on 10/3/18.
 */

public class SoilFragmentAdapter extends BaseAdapter {
    private Context context;
    private List<Shops> arrayList;
    private LayoutInflater layoutinflater;

    public SoilFragmentAdapter() {
    }

    public SoilFragmentAdapter(Context context, List<Shops> arrayList) {
        this.context = context;
        this.arrayList=arrayList;
        layoutinflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder listViewHolder;

        if(convertView == null){
            listViewHolder = new ViewHolder();
            convertView = layoutinflater.inflate(R.layout.single_item, parent, false);
            listViewHolder.icon= (ImageView)convertView.findViewById(R.id.image);
            listViewHolder.name = (TextView)convertView.findViewById(R.id.shopsname);
            convertView.setTag(listViewHolder);
        }else{
            listViewHolder = (ViewHolder)convertView.getTag();
        }

        Picasso.with(context).load(arrayList.get(position).getIconurl()).into(listViewHolder.icon);
        listViewHolder.name.setText(arrayList.get(position).getShopname());

        return convertView;
    }

    public static class ViewHolder{
        public    ImageView icon;
        public  TextView name;
    }

}


}
