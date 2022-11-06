package com.rear.rearArtifac.entities;
//import java.util.List;

import java.util.Collection;

//nesecitamos importar persistance de javax ya incluido en spring boot

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;

//nos permite manejo de variables de tipo fecha
//import java.util.Date;

 // estamos calificando la clase usuario con la anotacion @entity una entidad ORM
@Entity       // dento de la base de datos
@Table(name = "users" /*,uniqueConstraints = @UniqueConstraint(columnNames = "email")*/) // damos propiedades a la anotación
public class Usuario {

    @Id
    @Column(name = "Id_user")
    private Long Id_user;

    @Column(name = "Fname", nullable = false, unique = false)
    private String Fname;
    @Column(name = "Lname", nullable = false, unique = false)
    private String Lname;
    @Column(name = "TypeDni", length = 2, nullable = false, unique = false)
    private String TypeDni;
    @Column(name = "Phone", nullable = false, unique = true)
    private Long Phone;

    //@UniqueConstraint
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    // @Column( name = "Passw", nullable = false, unique=true)
    private String Password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "users_rols", 
        joinColumns = @JoinColumn(name = "user_id", 
                        referencedColumnName = "Id_user"), 
        inverseJoinColumns = @JoinColumn(name = "rol_id", 
                                referencedColumnName = "Id_rol"))
    private Collection<Rol> roles;

    // relacion de PK con Review
    /*
     * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
     * private List < Review > review;
     */

    // Relacion Pk con Property
    /*
     * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
     * private List < Property > property;
     */

    public Usuario(Long id_user, String fname, String lname, String typeDni, Long phone, String email) {
        Id_user = id_user;
        Fname = fname;
        Lname = lname;
        TypeDni = typeDni;
        Phone = phone;
        this.email = email;
    }

    public Usuario() {
    }

    // Constructor
    public Usuario(Long id_user, String fname, String lname, String typeDni, Long phone, String email,
            String password, Collection<Rol> roles) {
                super();
                // this.Id_user = Id_user;
                this.setId_user(id_user);
                // Fname = fname;
                this.setFname(fname);
                // Lname = lname;
                this.setLname(lname);
                // TypeDni = typeDni;
                this.setTypeDni(typeDni);
                // Phone = phone;
                this.setPhone(phone);
                // Email = email;
                this.setEmail(email);
                // Password = password;
                this.setPassword(password);
                this.roles = roles;
    }

    public Long getId_user() {
        return Id_user;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getTypeDni() {
        return TypeDni;
    }

    public Long getPhone() {
        return Phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return Password;
    }

    public void setId_user(Long id_user) {
        this.Id_user = id_user;
    }

    public void setFname(String fname) {
        this.Fname = fname;
    }

    public void setLname(String lname) {
        this.Lname = lname;
    }

    public void setTypeDni(String typeDni) {
        this.TypeDni = typeDni;
    }

    public void setPhone(Long phone) {
        this.Phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Usuario [Id_user=" + Id_user + ", Fname=" + Fname + ", Lname=" + Lname + ", TypeDni=" + TypeDni
                + ", Phone=" + Phone + ", Email=" + email + ", Password=" + Password + ", roles=" + roles + "]";
    }

    // Pendiente revisar si hashCode es util al agregar el ID manualmente
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id_user == null) ? 0 : Id_user.hashCode());
        return result;
    }

    // Pendiente revisar si equals es util al agregar el ID manualmente
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (Id_user == null) {
            if (other.Id_user != null)
                return false;
        } else if (!Id_user.equals(other.Id_user))
            return false;
        return true;
    }
}
