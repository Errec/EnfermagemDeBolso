package com.errec.android.enfermagemdebolso;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;
import com.google.android.youtube.player.YouTubeApiServiceUtil;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.fabric.sdk.android.Fabric;


public class YouTubeVideo extends AppCompatActivity {

    public static List<Video> MyVideo = new ArrayList<Video>();
    public static Map<String, Video> Video_Map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube_video);
        Fabric.with(this, new Crashlytics());

        //Check for any issues
        final YouTubeInitializationResult result = YouTubeApiServiceUtil.isYouTubeApiServiceAvailable(this);

        if (result != YouTubeInitializationResult.SUCCESS) {
            //If there are any issues we can show an error dialog.
            result.getErrorDialog(this, 0).show();
        }

        populateVideoList();
        populateListView();
    }

    private void populateVideoList() {
        addItem(new Video("tttG6SdnCd4", "Open in the YouTube App"));
        addItem(new Video("x-hH_Txxzls", "Open in the YouTube App in fullscreen"));
        addItem(new Video("TTh_qYMzSZk", "Open in the Standalone player in fullscreen"));
        addItem(new Video("tttG6SdnCd4", "Open in the Standalone player in \"Light Box\" mode"));
        addItem(new Video("x-hH_Txxzls", "Open in the YouTubeFragment"));
    }

    private static void addItem(final Video currentVideo) {
        MyVideo.add(currentVideo);
        Video_Map.put(currentVideo.getVideoId(), currentVideo);
    }

    private void populateListView() {
        ArrayAdapter<Video> adapter = new VideoListAdapter();
        ListView list = (ListView) findViewById(R.id.videoListView);
        list.setAdapter(adapter);
    }
    //------------------------------------------------------------------------------------------------------------------- 12/05/16
    private class VideoListAdapter extends BaseAdapter implements YouTubeThumbnailView.OnInitializedListener {

        private Context mContext;
        private Map<View, YouTubeThumbnailLoader> mLoaders;

        public VideoListAdapter(final Context context) {
            mContext = context;
            mLoaders = new HashMap<>();
        }

        @Override
        public int getCount() {
            return MyVideo.size();
        }

        @Override
        public Object getItem(int position) {
            return MyVideo.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        //------------------------------------------------------------------------------------------------------------------- 13/05/16
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View videoRow = convertView;

            VideoHolder holder;

            final Video currentVideo = MyVideo.get(position);

            //garantir que nao seja null e que sempre exista uma view para ser inserida
            if (videoRow == null) {
                //Create the row
                final LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                videoRow = inflater.inflate(R.layout.video_view, parent, false);

                //Create the video holder
                holder = new VideoHolder();

                //Set the title
                holder.title = (TextView) videoRow.findViewById(R.id.textView_title);
                holder.title.setText(currentVideo.getVideoTitle());

                //Initialise the thumbnail
                holder.thumb = (YouTubeThumbnailView) videoRow.findViewById(R.id.imageView_thumbnail);
                holder.thumb.setTag(currentVideo.getVideoId());
                holder.thumb.initialize(mContext.getString(R.string.DEVELOPER_KEY), this);

                videoRow.setTag(holder);
            } else {
                //Create it again
                holder = (VideoHolder) videoRow.getTag();
                final YouTubeThumbnailLoader loader = mLoaders.get(holder.thumb);

                //Set the title
                if (currentVideo != null) {
                    holder.title.setText(currentVideo.getVideoTitle());

                    if (loader == null) {
                        //Loader is currently initialising
                        holder.thumb.setTag(currentVideo.getVideoId());
                    } else {
                        //The loader is already initialised
                        loader.setVideo(currentVideo.getVideoId());
                    }
                }
            }
            return videoRow;
        }

        @Override
        public void onInitializationSuccess(YouTubeThumbnailView view, YouTubeThumbnailLoader loader) {
            mLoaders.put(view, loader);
            loader.setVideo((String) view.getTag());
        }

        @Override
        public void onInitializationFailure(YouTubeThumbnailView thumbnailView, YouTubeInitializationResult errorReason) {
            final String errorMessage = errorReason.toString();
            Toast.makeText(mContext, errorMessage, Toast.LENGTH_LONG).show();
        }

        static class VideoHolder {
            YouTubeThumbnailView thumb;
            TextView title;
        }

    }
}

