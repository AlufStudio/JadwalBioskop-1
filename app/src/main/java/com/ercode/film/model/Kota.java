package com.ercode.film.model;

/**
 * Created by riyadi rb on 1/21/17.
 * email : riyadi.rb@gmail.com
 * web   : ercode.id
 */


public class Kota {
    private String idKota, kotaNama;

    public Kota() {
    }

    public Kota(String idKota, String kotaNama) {
        this.idKota = idKota;
        this.kotaNama = kotaNama;
    }

    public String getIdKota() {
        return idKota;
    }

    public void setIdKota(String idKota) {
        this.idKota = idKota;
    }

    public String getKotaNama() {
        return kotaNama;
    }

    public void setKotaNama(String kotaNama) {
        this.kotaNama = kotaNama;
    }
}
