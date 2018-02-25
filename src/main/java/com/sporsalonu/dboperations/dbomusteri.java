/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sporsalonu.dboperations;

import com.sporsalonu.interFaces.BaseServices;
import com.sporsalonu.interFaces.ICRUD;
import com.sporsalonu.models.tblmusteri;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class dbomusteri implements ICRUD<tblmusteri>{

    BaseServices<tblmusteri> bs = new BaseServices<>();
    @Override
    public void Kaydet(tblmusteri o) {
    bs.kaydet(o);
    }

    @Override
    public void Duzenle(tblmusteri o) { 
    bs.duzenle(o);
    }

    @Override
    public void Sil(tblmusteri o) {
        bs.sil(o);
    }

    @Override
    public List<tblmusteri> Listele() {
    return bs.listele(tblmusteri.class);
    }

    @Override
    public tblmusteri Bul(int id) {
        Criteria cr = bs.getSession().createCriteria(tblmusteri.class);
        cr.add(Restrictions.eq("id", id));
        return (tblmusteri)cr.uniqueResult();
    }
    
    public tblmusteri Bultckimlikten(String tckimlik){
    Criteria cr = bs.getSession().createCriteria(tblmusteri.class);
    cr.add(Restrictions.eq("tckimlik", tckimlik));
    return (tblmusteri)cr.uniqueResult();
    }

    
    
}
