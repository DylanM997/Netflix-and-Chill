package com.example.android.netflixandchill;


import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {


        private Context Context;

        public ImageAdapter(Context c) {
            Context = c;
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);
            jsonArray();
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
            //    imageView.setLayoutParams(new GridView.LayoutParams(100,100));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(0, 0, 0, 0);
            } else {
                imageView = (ImageView) convertView;
            }

            //Pull URL from array
            try {
                if(position<posterPaths.size()) {
                    Uri posterPath = buildPosterUri("w185", position);

                    // posterPath =" http://image.tmdb.org/t/p/w185/"+ data.getJSONObject(position).getString("poster_path");
                    Picasso.with(Context)
                            .load(posterPath)

                            .into(imageView);
                }
            }
            catch(NullPointerException | JSONException e){
                Log.i("poster path" , "Item does not exist");
            }

            return imageView;
        }
        JSONArray data;
        ArrayList<String> posterPaths = new ArrayList<String>();
        private void jsonArray()
        {
            try {

                JSONObject json = readJson("http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=" + "b337a0d349789bbe372fea2913c5a6cd");

                JSONArray array = json.getJSONArray("results");

                data = array;
                for (int i = 0; i < array.length(); i++){
                    JSONObject movie = array.getJSONObject(i);
                    posterPaths.add(movie.getString("poster_path"));
                    System.out.println(posterPaths);

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
        public Uri buildPosterUri(String size,int position) throws JSONException {
            final String BASE_URL = "http://image.tmdb.org/t/p/";
            Uri builtUri = Uri.parse(BASE_URL).buildUpon()
                    .appendPath(size)
                    .appendEncodedPath(posterPaths.get(position))
                    .build();

            return builtUri;
        }
    }


