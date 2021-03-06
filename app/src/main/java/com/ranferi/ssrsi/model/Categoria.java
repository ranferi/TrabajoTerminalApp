
package com.ranferi.ssrsi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.com_ranferi_ssrsi_model_CategoriaRealmProxy;

@RealmClass
@Parcel(implementations = { com_ranferi_ssrsi_model_CategoriaRealmProxy.class },
        value = Parcel.Serialization.BEAN,
        analyze = { Categoria.class })
public class Categoria extends RealmObject {
    @SerializedName("categoria")
    @Expose
    @PrimaryKey
    private String categoria;
    @SerializedName("proviene")
    @Expose
    private String proviene;
    @LinkingObjects("categorias")
    private final RealmResults<Place> categoriasSitio = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Categoria() {
    }

    /**
     * 
     * @param categoria
     * @param proviene
     */
    public Categoria(String categoria, String proviene) {
        super();
        this.categoria = categoria;
        this.proviene = proviene;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProviene() {
        return proviene;
    }

    public void setProviene(String proviene) {
        this.proviene = proviene;
    }

}
