package com.example.recyclerviewcardview.models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewcardview.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Usuario {
    private String nombres;
    private String email;
    private String website;
    private String urlavatar;

    public String getNombre() {
        return nombres;}
    public String getEmail() {
        return email;}
    public String getWebsite() {
        return website;}
    public String getUrlavatar() {
        return urlavatar;}
    public void setNombre(String nombre) {
        this.nombres = nombre;}
    public void setEmail(String email) {
        this.email = email;}
    public void setWebsite(String website) {
        this.website = website;}
    public void setUrlavatar(String urlavatar) {
        this.urlavatar = urlavatar;}

    public Usuario(JSONObject a) throws JSONException {
        JSONObject countrycodes=a.getJSONObject("CountryCodes");
        nombres =  a.getString("Name").toString();
        email =  a.getString("email").toString() ;
        website =  a.getString("avatar").toString() ;
        urlavatar =  a.getString("iso2").toString() ;
        //urlavatar = "http://www.geognos.com/api/en/countries/flag/" + a.getString("iso2").toString() + ".png";

    }

    public static ArrayList<Usuario> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            usuarios.add(new Usuario(datos.getJSONObject(i)));
        }
        return usuarios;
    }
}
