/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Runner;

import com.sporsalonu.dboperations.dbomusteri;
import com.sporsalonu.models.tblmusteri;

/**
 *
 * @author vektorel
 */
public class runner {
 
    public static void main(String[] args) {
        tblmusteri musteri = new tblmusteri();
        dbomusteri DB = new dbomusteri();
         
        System.out.println("Bulunan Kişi....: "+DB.Bul(1).getAd());
        
        System.out.println("Bulunan Kişi....: "+DB.Bultckimlikten("1111111111").getAd());
        
         
         
//        musteri.setAd("Muhammet1");
//        musteri.setSoyad("Hoca1");
//        musteri.setCeptel("05455444855");
//        musteri.setCinsiyet("Erkek");
//        musteri.setTckimlik("47798798798");
       
//        DB.Kaydet(musteri);
        
//        for (tblmusteri object : DB.Listele()) {
//            System.out.println("Müşteri id...:"+object.getId());
//            System.out.println("Müşteri adi...:"+object.getAd());
//            System.out.println("Müşteri soyadı...:"+object.getSoyad());
//            System.out.println("Müşteri cep tel...:"+object.getCeptel());
//            
//        }
//                
        
    }
    
}
