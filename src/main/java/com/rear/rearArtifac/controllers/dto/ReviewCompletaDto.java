package com.rear.rearArtifac.controllers.dto;

import java.util.Date;

public class ReviewCompletaDto {

    private Long id_Lessor;
    private String pFName;
    private String pLName;
    private String nationality;    
    private String TypeDni;

    private Long id_Property;
    private String city;
    private String adress;
    private String departament;

    private Long id_Review;
    private Integer puntuaction;
    private Date dStart;
    private Date dEnd;
    
    public ReviewCompletaDto(Long id_Lessor, String pFName, String pLName, String nationality, String typeDni,
            String city, String adress, String departament) {
            this.id_Lessor = id_Lessor;
            this.pFName = pFName;
            this.pLName = pLName;
            this.nationality = nationality;
            TypeDni = typeDni;
            this.city = city;
            this.adress = adress;
            this.departament = departament;
    }

    public ReviewCompletaDto(Long id_Lessor, String pFName, String pLName, String nationality, String typeDni,
            Long id_Property, String city, String adress, String departament, Long id_Review, Integer puntuaction,
            Date dStart, Date dEnd) {
        this.id_Lessor = id_Lessor;
        this.pFName = pFName;
        this.pLName = pLName;
        this.nationality = nationality;
        TypeDni = typeDni;
        this.id_Property = id_Property;
        this.city = city;
        this.adress = adress;
        this.departament = departament;
        this.id_Review = id_Review;
        this.puntuaction = puntuaction;
        this.dStart = dStart;
        this.dEnd = dEnd;
    }

    public ReviewCompletaDto() {
    }

    public Long getId_Lessor() {
        return id_Lessor;
    }

    public void setId_Lessor(Long id_Lessor) {
        this.id_Lessor = id_Lessor;
    }

    public String getpFName() {
        return pFName;
    }

    public void setpFName(String pFName) {
        this.pFName = pFName;
    }

    public String getpLName() {
        return pLName;
    }

    public void setpLName(String pLName) {
        this.pLName = pLName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTypeDni() {
        return TypeDni;
    }

    public void setTypeDni(String typeDni) {
        TypeDni = typeDni;
    }

    public Long getId_Property() {
        return id_Property;
    }

    public void setId_Property(Long id_Property) {
        this.id_Property = id_Property;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public Long getId_Review() {
        return id_Review;
    }

    public void setId_Review(Long id_Review) {
        this.id_Review = id_Review;
    }

    public Integer getPuntuaction() {
        return puntuaction;
    }

    public void setPuntuaction(Integer puntuaction) {
        this.puntuaction = puntuaction;
    }

    public Date getdStart() {
        return dStart;
    }

    public void setdStart(Date dStart) {
        this.dStart = dStart;
    }

    public Date getdEnd() {
        return dEnd;
    }

    public void setdEnd(Date dEnd) {
        this.dEnd = dEnd;
    }

  
    
}
