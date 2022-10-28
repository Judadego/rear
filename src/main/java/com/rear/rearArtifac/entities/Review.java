package com.rear.rearArtifac.entities;
import java.sql.Date;

import javax.persistence.*;



@Entity
@Table(name = "reviews")
public class Review {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_review", nullable = false, unique=true)
    private Integer Id_review;

    @Column(name = "Punctuation",length = 1, nullable = false, unique= false)
    private Integer Punctuation;
    @Column(name = "Dstar")
    private Date Dstar;
    @Column(name="Dend")
    private Date Dend;

    //Relacion con la tabla Usuario
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_user", referencedColumnName = "Id_user", nullable = false)
    private Usuario Usr;

    //Relacion con la tabla Lessor
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_lessor", referencedColumnName = "Id_lessor", nullable = false)
    private Lessor Lessr;

    //Relacion con la tabla property
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_property", referencedColumnName = "Id_property", nullable = false)
    private Property Propert;

    //Constructor para pruebas mientras aprendo manejo de fechas
    public Review(Integer punctuation, Usuario usr, Lessor lessr, Property propert) {
        super();
        this.Punctuation = punctuation;
        this.Usr = usr;
        this.Lessr = lessr;
        this.Propert = propert;
    }
    public Review() {
    }
    //Constructor sin id ya que se genera auto
    public Review(Integer punctuation, Date dstar, Date dend, Usuario usr, Lessor lessr, Property propert) {
        super();
        this.Punctuation = punctuation;
        this.Dstar = dstar;
        this.Dend = dend;
        this.Usr = usr;
        this.Lessr = lessr;
        this.Propert = propert;
    }
    public Integer getId_review() {
        return Id_review;
    }
    public void setId_review(Integer id_review) {
        Id_review = id_review;
    }
    public Integer getPunctuation() {
        return Punctuation;
    }
    public void setPunctuation(Integer punctuation) {
        Punctuation = punctuation;
    }
    public Date getDstar() {
        return Dstar;
    }
    public void setDstar(Date dstar) {
        Dstar = dstar;
    }
    public Date getDend() {
        return Dend;
    }
    public void setDend(Date dend) {
        Dend = dend;
    }
    public Usuario getUser(){
        return Usr;
    }
    public void setUser(Usuario user){
        Usr = user;
    }
    public Lessor getLessor(){
        return Lessr;
    }
    public void setLessor(Lessor lessor){
        Lessr = lessor;
    }
    public Property getProperty(){
        return Propert;
    }
    public void setProperty(Property property){
        Propert = property;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id_review == null) ? 0 : Id_review.hashCode());
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
        Review other = (Review) obj;
        if (Id_review == null) {
            if (other.Id_review != null)
                return false;
        } else if (!Id_review.equals(other.Id_review))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Review [Dend=" + Dend + ", Dstar=" + Dstar + ", Id_review=" + Id_review + ", Lessr=" + Lessr
                + ", Propert=" + Propert + ", Punctuation=" + Punctuation + ", Usr=" + Usr + "]";
    }

    
}
