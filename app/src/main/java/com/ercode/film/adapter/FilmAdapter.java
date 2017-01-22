package com.ercode.film.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ercode.film.R;
import com.ercode.film.helpers.RbHelper;
import com.ercode.film.model.Film;

import java.util.ArrayList;

/**
 * Created by riyadi rb on 12/9/16.
 * email : riyadi.rb@gmail.com
 * web   : ercode.id
 */


public class FilmAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context c;
    private ArrayList<Film> data;
    private AlphaAnimation btnAnimasi = new AlphaAnimation(1.0F, 0.5F);


    public FilmAdapter(Context c, ArrayList<Film> data) {
        this.c = c;
        this.data = data;


    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(c).inflate(R.layout.item_film, parent, false);
        return new UserViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final Film x = data.get(position);
        UserViewHolder mHolder = (UserViewHolder) holder;

        String nama = x.getFilmNama();
        String urlImage  = "http://udar-ider.ercodestudio.com/bioskop/poster/" + nama;
        urlImage = urlImage.replaceAll(" ", "%20");

        RbHelper.pre(urlImage);
        Glide.with(c)
                .load(urlImage)
                .centerCrop()
                .placeholder(R.drawable.poster)
                .crossFade()
                .into(mHolder.ivCover);


        mHolder.tvItemJudul.setText(nama);
        mHolder.tvItemDurasi.setText("Durasi " + x.getFilmDurasi());
        mHolder.tvItemGenre.setText("Genre " + x.getFilmGenre());

        mHolder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(btnAnimasi);


                //c.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }


    class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView tvItemJudul, tvItemDurasi, tvItemGenre;
        public LinearLayout container;
        public ImageView ivCover;


        public UserViewHolder(View v) {
            super(v);

            tvItemJudul = (TextView) v.findViewById(R.id.tvItemJudul);
            ivCover = (ImageView) v.findViewById(R.id.ivItemCover);
            container = (LinearLayout) v.findViewById(R.id.container);
            tvItemDurasi = (TextView) v.findViewById(R.id.tvItemDurasi);
            tvItemGenre = (TextView) v.findViewById(R.id.tvItemGenre);


        }
    }

}