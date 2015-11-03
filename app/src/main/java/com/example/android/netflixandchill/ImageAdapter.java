package com.example.android.netflixandchill;


import android.content.Context;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


    public class ImageAdapter extends BaseAdapter {


        private Context mContext;

        public ImageAdapter(Context c){
            mContext = c;
        }

        public int getCount() {
            return images.length;
        }

        public Object getItem(int position){
            return null;
        }

        public long getItemId(int position){
            return 0;
        }

        //creates a new ImageView for each item reference by the Adapter
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageView;
            if (convertView == null){
                //if it's not recycled, initialize some attributes
                imageView = new ImageView(mContext);
                //imageView.setLayoutParams(new GridView.LayoutParams(300,300));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(0,0,0,0);
            }
            else{
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(images[position]);
            return imageView;
        }
   private static Integer[] images = new Integer[]
            {
                    R.drawable.bridge_of_spies,
                    R.drawable.crim,
                    R.drawable.goosebumps,

            };


    }
