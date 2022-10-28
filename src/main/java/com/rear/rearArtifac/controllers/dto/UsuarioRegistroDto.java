package com.rear.rearArtifac.controllers.dto;

public class UsuarioRegistroDto {
    
    private Long id;
    private String lname;
    private String fname;
    private String email;
    private String typeDni;
    private Long phone;
    private String passw;
    
    /*public UsuarioRegistroDto(String lname, String fname, String email, String typeDni, Long phone, String passw) {
        super();
        this.lname = lname;
        this.fname = fname;
        this.email = email;
        this.typeDni = typeDni;
        this.phone = phone;
        this.passw = passw;
    }*/

    public UsuarioRegistroDto() {
    }

    public UsuarioRegistroDto(Long id, String lname, String fname, String email, String typeDni, Long phone,
            String passw) {
                super();
        this.id = id;
        this.lname = lname;
        this.fname = fname;
        this.email = email;
        this.typeDni = typeDni;
        this.phone = phone;
        this.passw = passw;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTypeDni() {
        return typeDni;
    }
    public void setTypeDni(String typeDni) {
        this.typeDni = typeDni;
    }
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public String getPassw() {
        return passw;
    }
    public void setPassw(String passw) {
        this.passw = passw;
    }

}

