package com.rear.rearArtifac.entities;

import javax.persistence.*;


@Entity
@Table(name = "roles")
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_rol;
    private String nombre;

    
    public Long getId_rol() {
        return Id_rol;
    }
    public void setId_rol(Long id_rol) {
        this.Id_rol = id_rol;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol(Long id_rol, String nombre) {
        super();
        this.Id_rol = id_rol;
        this.nombre = nombre;
    }

    public Rol(){
    }

    public Rol(String nombre){
        super();
        this.nombre = nombre;
    }

}
