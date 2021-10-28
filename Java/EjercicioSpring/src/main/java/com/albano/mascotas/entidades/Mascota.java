/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.mascotas.entidades;

import com.albano.mascotas.enums.Sexo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author blackstrack
 */
@Entity
public class Mascota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nombre;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date alta;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date baja;
    
    @ManyToOne
    private Usuario usuario;
    
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    
    @OneToOne
    private Foto foto;

    //Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getAlta() {
        return alta;
    }

    public Date getBaja() {
        return baja;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Foto getFoto() {
        return foto;
    }
    
    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public void setBaja(Date baja) {
        this.baja = baja;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
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
        if (!(object instanceof Mascota)) {
            return false;
        }
        Mascota other = (Mascota) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.albano.mascotas.entidades.Mascota[ id=" + id + " ]";
    }
    
}
