package social.com.socialapp.activities;

import android.app.Application;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import social.com.socialapp.R;
import social.com.socialapp.adapters.CustomAdapter;
import social.com.socialapp.models.SampleJson;
import social.com.socialapp.models.SocialData;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView mRecyclerView;
    SocialData socialData;
    TextView friend_name;
    ImageView friend_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Gson gson = new Gson();
        socialData = gson.fromJson(SampleJson.jsonString, SocialData.class);

        friend_name = (TextView) findViewById(R.id.friend_name);
        friend_img = (ImageView) findViewById(R.id.friend_img);

        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        CustomAdapter adapter = new CustomAdapter(this,socialData.getOurStory());

        mRecyclerView.setAdapter(adapter);

        friend_name.setText(socialData.getName());

        Glide.with(this)
                .load(socialData.getPhoto())
                .placeholder(R.drawable.placeholder)
                .into(friend_img);
    }


}
