package com.eden.youtubesample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.eden.youtubesample.content.YouTubeContent;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;
import com.errec.android.enfermagemdebolso.R;
import com.google.android.youtube.player.YouTubeApiServiceUtil;
import com.google.android.youtube.player.YouTubeInitializationResult;

import io.fabric.sdk.android.Fabric;


public class YouTubeVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_youtube_video);

        //Check for any issues
        final YouTubeInitializationResult result = YouTubeApiServiceUtil.isYouTubeApiServiceAvailable(this);

        if (result != YouTubeInitializationResult.SUCCESS) {
            //If there are any issues we can show an error dialog.
            result.getErrorDialog(this, 0).show();
        }
    }

    private class VideoListAdapter extends BaseAdapter implements YouTubeThumbnailView.OnInitializedListener {

        private Context mContext;
        private Map<View, YouTubeThumbnailLoader> mLoaders;

        public VideoListAdapter(final Context context) {
            mContext = context;
            mLoaders = new HashMap<>();
        }

        @Override
        public int getCount() {
            return YouTubeContent.ITEMS.size();
        }

        @Override
        public Object getItem(int position) {
            return YouTubeContent.ITEMS.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View currentRow = convertView;
            VideoHolder holder;

            //The item at the current position
            final YouTubeContent.YouTubeVideo item = YouTubeContent.ITEMS.get(position);

            if (currentRow == null) {
                //Create the row
                final LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                currentRow = inflater.inflate(R.layout.row_layout, parent, false);

                //Create the video holder
                holder = new VideoHolder();

                //Set the title
                holder.title = (TextView) currentRow.findViewById(R.id.textView_title);
                holder.title.setText(item.title);

                //Initialise the thumbnail
                holder.thumb = (YouTubeThumbnailView) currentRow.findViewById(R.id.imageView_thumbnail);
                holder.thumb.setTag(item.id);
                holder.thumb.initialize(mContext.getString(R.string.DEVELOPER_KEY), this);

                currentRow.setTag(holder);
            } else {
                //Create it again
                holder = (VideoHolder) currentRow.getTag();
                final YouTubeThumbnailLoader loader = mLoaders.get(holder.thumb);

                //Set the title
                if (item != null) {
                    holder.title.setText(item.title);

                    if (loader == null) {
                        //Loader is currently initialising
                        holder.thumb.setTag(item.id);
                    } else {
                        //The loader is already initialised
                        loader.setVideo(item.id);
                    }

                }
            }
            return currentRow;

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



