package social.com.socialapp.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import social.com.socialapp.R;
import social.com.socialapp.models.OurStory;

/**
 * Created by techniche on 18/8/15.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    List<OurStory> storyItems;
    Context mContext;

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView simple_story_title,checkin_story_title,simple_story_content,checkin_story_more_photos;
        ImageView location,checkin_story_image;
        CardView simple_card_view,checkin_card_view;
        Context mContext;

        public CustomViewHolder(View itemView, int ViewType) {
            super(itemView);

            simple_story_title = (TextView) itemView.findViewById(R.id.simple_story_title);
            checkin_story_title = (TextView) itemView.findViewById(R.id.checkin_story_title);
            simple_story_content = (TextView) itemView.findViewById(R.id.simple_story_content);
            location = (ImageView) itemView.findViewById(R.id.location);
            checkin_story_image = (ImageView) itemView.findViewById(R.id.checkin_story_image);
            checkin_story_more_photos = (TextView) itemView.findViewById(R.id.checkin_story_more_photos);
            simple_card_view = (CardView) itemView.findViewById(R.id.simple_card_view);
            checkin_card_view = (CardView) itemView.findViewById(R.id.checkin_card_view);

        }
    }

    public CustomAdapter(Context mContext,List<OurStory> storyItems){

        this.storyItems = storyItems;
        this.mContext = mContext;
    }

    @Override
    public CustomAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_row_content,parent,false);
        CustomViewHolder customHolder = new CustomViewHolder(v,viewType);
        return customHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.CustomViewHolder holder, int position) {

        //holder.menuName.setText(menuTitles.get(position).getMenuName());
        if("simple_card".equalsIgnoreCase(storyItems.get(position).getType())){

            holder.simple_card_view.setVisibility(View.VISIBLE);
            holder.checkin_card_view.setVisibility(View.GONE);
            holder.simple_story_title.setText(storyItems.get(position).getTitle());
            holder.simple_story_content.setText(storyItems.get(position).getContent());

        }else{

            holder.checkin_card_view.setVisibility(View.VISIBLE);
            holder.simple_card_view.setVisibility(View.GONE);
            holder.checkin_story_title.setText(storyItems.get(position).getTitle());

            Glide.with(mContext)
                    .load(storyItems.get(position).getImageUrl())
                    .placeholder(R.drawable.placeholder)
                    .into(holder.checkin_story_image);
        }

    }

    @Override
    public int getItemCount() {
        return storyItems.size();
    }


}
