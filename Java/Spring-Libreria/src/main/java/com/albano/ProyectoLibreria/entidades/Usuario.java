/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.albano.ProyectoLibreria.entidades;

import com.albano.ProyectoLibreria.enums.Rol;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author blackstrack
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String clave;
    private String clave2;
    private String mail;
    
    //Para manejar los roles
    @Enumerated(EnumType.STRING)
    private Rol rol;
    
    @OneToOne
    private Foto foto;

    //Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClave2() {
        return clave2;
    }

    public Foto getFoto() {
        return foto;
    }

    public String getMail() {
        return mail;
    }

    public Rol getRol() {
        return rol;
    }
    
    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setClave2(String clave2) {
        this.clave2 = clave2;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.albano.ProyectoLibreria.entidades.Usuario[ id=" + id + " ]";
    }
    
}
