package com.rear.rearArtifac.controllers.dto;



import java.sql.Date;

import com.rear.rearArtifac.entities.*;

public class ReviewRegistroDto {
    
    private Integer id;
    private Date dEnd;
    private Date dStart;
    private Integer puntuaction;
    private Lessor id_lessor;
    private Property id_property;
    private Usuario id_user;
    
    public ReviewRegistroDto() {
    }
    public ReviewRegistroDto(Integer id, Date dEnd, Date dStart, Integer puntuaction, Lessor id_lessor,
            Property id_property, Usuario id_user) {
        this.id = id;
        this.dEnd = dEnd;
        this.dStart = dStart;
        this.puntuaction = puntuaction;
        this.id_lessor = id_lessor;
        this.id_property = id_property;
        this.id_user = id_user;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getdEnd() {
        return dEnd;
    }
    public void setdEnd(Date dEnd) {
        this.dEnd = dEnd;
    }
    public Date getdStart() {
        return dStart;
    }
    public void setdStart(Date dStart) {
        this.dStart = dStart;
    }
    public Integer getPuntuaction() {
        return puntuaction;
    }
    public void setPuntuaction(Integer puntuaction) {
        this.puntuaction = puntuaction;
    }
    public Lessor getId_lessor() {
        return id_lessor;
    }
    public void setId_lessor(Lessor id_lessor) {
        this.id_lessor = id_lessor;
    }
    public Property getId_property() {
        return id_property;
    }
    public void setId_property(Property id_property) {
        this.id_property = id_property;
    }
    public Usuario getId_user() {
        return id_user;
    }
    public void setId_user(Usuario id_user) {
        this.id_user = id_user;
    }
}
