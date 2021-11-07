/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author blackstrack
 */
@Entity
public class Foto implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String  mime;
    private String nombre;
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] contenido;

    //Getters
    public String getId() {
        return id;
    }

    public String getMime() {
        return mime;
    }

    public String getNombre() {
        return nombre;
    }

    public byte[] getContenido() {
        return contenido;
    }
   
    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foto)) {
            return false;
        }
        Foto other = (Foto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.albano.ProyectoLibreria.entidades.Foto[ id=" + id + " ]";
    }
    
}
