package com.example.android.netflixandchill;


import android.content.Context;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.squareup.picasso.Picasso;
import android.util.Log;

    public class ImageAdapter extends BaseAdapter {


        private Context Context;

        public ImageAdapter(Context c) {
            Context = c;
        }

        public int getCount() {
            return 2;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }


        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView == null) {
                //if it's not recycled, initialize some attributes
                imageView = new ImageView(Context);
                //imageView.setLayoutParams(new GridView.LayoutParams(300,300));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(0, 0, 0, 0);
            } else {
                imageView = (ImageView) convertView;
            }
            String posterPath = "";
            //Pull URL from array
            try {
                posterPath =" http://image.tmdb.org/t/p/w185/"+ data.getJSONObject(position).getString("poster_path");
                Picasso.with(Context).load(posterPath).into(imageView);
            }
            catch(JSONException ex){
                Log.i("poster path" , "Item does not exist");
            }

            return imageView;
        }
        JSONArray data;
        private void jsonArray()
        {
            try {

                JSONObject json = readJson("http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=" + "b337a0d349789bbe372fea2913c5a6cd");

                JSONArray array = json.getJSONArray("results");
                data = array;
                for (int i = 0; i < array.length(); i++){
                    String s = array.get(i).toString();
                    Log.i("array",s);
                    Log.i(" poster",array.getJSONObject(i).getString("poster_path"));


                }
            }
            catch(IOException | JSONException ex) {
                Log.i("ImageAdapter","Error");
            }
        }
        public JSONObject readJson(String url) throws IOException, JSONException {
            InputStream stream = new URL(url).openStream();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream, Charset.forName("UTF-8")));
                String jsonText = readAll(reader);
                JSONObject json = new JSONObject(jsonText);
                return json;
            }
            finally{
                stream.close();
            }
        }
        private String readAll(Reader rd) throws IOException {
            StringBuilder builder = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1){
                builder.append((char) cp);
            }
            return builder.toString();
        }
    }


