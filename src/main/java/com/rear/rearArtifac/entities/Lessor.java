package com.rear.rearArtifac.entities;

import java.util.List;

//import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "lessors")
public class Lessor {
          
    //generatedValue sirve para generar automaticamente el id, en este caso id=documentodni
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id_lessor")
    private Long Id_lessor;

    @Column(name="Fname"/*, nullable = false*/,unique=false)
    private String Fname;
    @Column(name = "Lname"/*, nullable = false */,unique=false)
    private String Lname;
    @Column(name="Nationality"/*, nullable = false*/, unique=false)
    private String Nationality;
    @Column(name="TypeDni", length = 2/*, nullable = false  */, unique=false)
    private String TypeDni;

    //Relacion con Review
    /*@OneToMany(mappedBy = "Id_lessor", cascade = CascadeType.ALL)*/
    //private List < Review > review;

    //Constructor...
    public Lessor (){
        
    }
    public Lessor( String fname, String lname, String nationality, String typeDni) {
        super();
        this.Fname = fname;
        this.Lname = lname;
        this.Nationality = nationality;
        this.TypeDni = typeDni;
    }
    
    public Lessor(Long id_lessor, String fname, String lname, String nationality, String typeDni) {
        super();
        this.Id_lessor = id_lessor;
        this.Fname = fname;
        this.Lname = lname;
        this.Nationality = nationality;
        this.TypeDni = typeDni;
    }

    public Long getId_lessor() {
        return Id_lessor;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getNationality() {
        return Nationality;
    }

    public String getTypeDni() {
        return TypeDni;
    }

    public void setId_lessor(Long id_lessor) {
        Id_lessor = id_lessor;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public void setTypeDni(String typeDni) {
        TypeDni = typeDni;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Fname == null) ? 0 : Fname.hashCode());
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
        Lessor other = (Lessor) obj;
        if (Fname == null) {
            if (other.Fname != null)
                return false;
        } else if (!Fname.equals(other.Fname))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Lessor [Fname=" + Fname + ", Id_lessor=" + Id_lessor + ", Lname=" + Lname + ", Nationality="
                + Nationality + ", TypeDni=" + TypeDni + "]";
    }    
}
