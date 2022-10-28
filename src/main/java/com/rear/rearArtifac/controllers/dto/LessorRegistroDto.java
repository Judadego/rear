package com.rear.rearArtifac.controllers.dto;

public class LessorRegistroDto {
    
    private Long id;
    private String lname;
    private String fname;
    private String nationality;
    private String typeDni;
    
    public LessorRegistroDto() {
    }

    public LessorRegistroDto(Long id, String lname, String fname, String nationality, String typeDni) {
        
        super();
        this.id = id;
        this.lname = lname;
        this.fname = fname;
        this.nationality = nationality;
        this.typeDni = typeDni;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTypeDni() {
        return typeDni;
    }

    public void setTypeDni(String typeDni) {
        this.typeDni = typeDni;
    }

    
}
