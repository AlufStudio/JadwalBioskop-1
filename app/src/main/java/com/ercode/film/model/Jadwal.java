package com.ercode.film.model;

import java.util.ArrayList;

/**
 * Created by riyadi rb on 1/21/17.
 * email : riyadi.rb@gmail.com
 * web   : ercode.id
 */


public class Jadwal {
    private String namaBioskop, harga;

    private ArrayList<String> dataJam;

    public String getNamaBioskop() {
        return namaBioskop;
    }

    public void setNamaBioskop(String namaBioskop) {
        this.namaBioskop = namaBioskop;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public ArrayList<String> getDataJam() {
        return dataJam;
    }

    public void setDataJam(ArrayList<String> dataJam) {
        this.dataJam = dataJam;
    }
}
