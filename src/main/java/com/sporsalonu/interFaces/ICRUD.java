/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sporsalonu.interFaces;

import java.util.List;

/**
 *
 * @author vektorel
 * @param <V>
 */
public interface ICRUD<V> {
    
    public void Kaydet(V o);
    public void Duzenle(V o);
    public void Sil(V o);
    public List Listele();
    public V Bul(int id);
        
}
