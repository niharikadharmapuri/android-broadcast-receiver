package com.example.niharika.application22;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by niharika on 10/26/17.
 */

public class GalleryAdapter extends BaseAdapter {

    Context mContext;
    int ImageIds[]={R.drawable.fieldmuseum, R.drawable.lincolnpark, R.drawable.milleniumpark,
            R.drawable.navypier, R.drawable.willistowers, R.drawable.wrigleystadium};

   GalleryAdapter(Context c){
       mContext=c;
   }


    @Override
    public int getCount() {
        return ImageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return ImageIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = (ImageView) convertView;

        if (imageView == null) {
            imageView = new ImageView(mContext);
        }
        imageView.setImageResource(ImageIds[position]);
        return imageView;

    }
}
