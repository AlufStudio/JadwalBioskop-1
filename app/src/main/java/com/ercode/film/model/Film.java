package com.ercode.film.model;

import java.util.ArrayList;

/**
 * Created by riyadi rb on 1/21/17.
 * email : riyadi.rb@gmail.com
 * web   : ercode.id
 */


public class Film extends Kota {
    private String filmNama, filmPoster, filmGenre, filmDurasi;
    private ArrayList<Jadwal> dataJadwal;

    public String getFilmNama() {
        return filmNama;
    }

    public void setFilmNama(String filmNama) {
        this.filmNama = filmNama;
    }

    public String getFilmPoster() {
        return filmPoster;
    }

    public void setFilmPoster(String filmPoster) {
        this.filmPoster = filmPoster;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getFilmDurasi() {
        return filmDurasi;
    }

    public void setFilmDurasi(String filmDurasi) {
        this.filmDurasi = filmDurasi;
    }

    public ArrayList<Jadwal> getDataJadwal() {
        return dataJadwal;
    }

    public void setDataJadwal(ArrayList<Jadwal> dataJadwal) {
        this.dataJadwal = dataJadwal;
    }
}
