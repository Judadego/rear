package com.rear.rearArtifac.entities;
//import java.util.List;

import javax.persistence.*;
//import java.util.Date;

@Entity
@Table(name = "propertys")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_property", nullable = false)
    private Long Id_property;

    @Column(name = "City", nullable = false, unique=false)
    private String City;
    @Column(name = "Departament", nullable = false, unique=false)
    private String Departament;
    @Column(name = "Address", nullable = false, unique=false)
    private String Address;

    //Relacion con Review
    /*@OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List < Review > review;*/

    //Relacion con Tabla Usuario
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_user", referencedColumnName = "Id_user")
    private Usuario Usr;
    
    public Property(String city, String departament, String address,Usuario user) {
        //City = city;
        this.setCity(city);
        //Departament = departament;
        this.setDepartament(departament);
        //Address = address;
        this.setAddress(address);
        this.setUser(user);
    }
    //getters and setters...
    public Long getId_property() {
        return Id_property;
    }
    public void setId_property(Long id_property) {
        this.Id_property = id_property;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        this.City = city;
    }
    public String getDepartament() {
        return Departament;
    }
    public void setDepartament(String departament) {
        this.Departament = departament;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }

    public Usuario getUser() {
        return Usr;
    }
    public void setUser(Usuario user) {
        this.Usr = user;
    }

    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id_property == null) ? 0 : Id_property.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Property other = (Property) obj;
        if (Id_property == null) {
            if (other.Id_property != null)
                return false;
        } else if (!Id_property.equals(other.Id_property))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Property [Address=" + Address + ", City=" + City + ", Departament=" + Departament + ", Id_property="
                + Id_property + ", Id_user=" + Usr + "]";
    }
    
    
    
}
