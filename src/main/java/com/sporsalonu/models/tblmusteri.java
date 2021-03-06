/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sporsalonu.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author vektorel
 */
@Entity
@Table()
public class tblmusteri implements Serializable {
    @Id
    @SequenceGenerator(name = "ali",sequenceName = "sqtblmusteriid",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "ali")
    private int id;
    @Column(name = "tckimlik",length = 11,nullable = true)
    private String tckimlik;
    @Column(name = "ad",length = 50)
    private String ad;
    @Column(name = "soyad",length = 50)
    private String soyad;
    @Column(name = "cinsiyet",length = 10)
    private String cinsiyet;
    @Column(name = "dogumtarihi")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dogumtarihi;
    @Column(name = "ceptel",length = 50)
    private String ceptel;
    @Column(name = "yakintel",length = 50)
    private String yakintel;
    @Column(name = "resim",length = 50)
    private String resim;
    @Column(name = "saglikdurumu",length = 50)
    private String saglikdurumu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getCeptel() {
        return ceptel;
    }

    public void setCeptel(String ceptel) {
        this.ceptel = ceptel;
    }

    public String getYakintel() {
        return yakintel;
    }

    public void setYakintel(String yakintel) {
        this.yakintel = yakintel;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getSaglikdurumu() {
        return saglikdurumu;
    }

    public void setSaglikdurumu(String saglikdurumu) {
        this.saglikdurumu = saglikdurumu;
    }


    
}
