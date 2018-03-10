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


    class WaterSourceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ItemClickListener itemClickListener;
        TextView textView;
        ImageView circleImageView;


        public WaterSourceViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.source_name);
            circleImageView = (ImageView) itemView.findViewById(R.id.source_image);
            itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), false);
        }
    }

    public class WaterFragmentAdapter extends RecyclerView.Adapter<WaterSourceViewHolder> implements ItemClickListener{
        private Context context;
        private Website website;
        private IconIdeaService iconIdeaService;


        public WaterFragmentAdapter(Context context, Website website) {
            this.context = context;
            this.website = website;
            iconIdeaService = Common.getIconService();
        }

        @Override
        public int getItemCount() {
            return website.getSources().size();
        }

        @Override
        public WaterSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View itemView = layoutInflater.inflate(R.layout.source_layout, parent, false);
            return new WaterSourceViewHolder(itemView);

        }

        @Override
        public void onBindViewHolder(final WaterSourceViewHolder holder, final int position) {
            iconIdeaService.getIconUrl(website.getSources().get(position).getUrl().toString()).enqueue(new Callback<IconBetterIdea>() {
                @Override
                public void onResponse(Response<IconBetterIdea> response, Retrofit retrofit) {
                    if (response.body() != null && response.body().getIcons() != null && response.body().getIcons().size() > 0 && !TextUtils.isEmpty(response.body().getIcons().get(0).getUrl()))


                        Picasso.with(context).load(response.body().getIcons().get(0).getUrl()).into(holder.circleImageView);
                }

                @Override
                public void onFailure(Throwable t) {
                    Log.e("tito", "failed");
                }
            });

            holder.textView.setText(website.getSources().get(position).getName());

            holder.setItemClickListener(new ItemClickListener() {
                @Override
                public void onClick(View view, int position, boolean isLongClick) {
                    //  Log.d("tito",position+"");
                    Intent intent = new Intent(context, List_News.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);     //Error if not added-when u r calling another activity using context u need to add this line
                    intent.putExtra("source", website.getSources().get(position).getId());
                    Log.d("tito", website.getSources().get(position).getId() + "");
                    intent.putExtra("sortBy", website.getSources().get(position).getSortBysAvailable().get(0));
                    Log.d("tito", website.getSources().get(position).getSortBysAvailable().get(0) + "");
                    context.startActivity(intent);

                }
            });

        }
    }
