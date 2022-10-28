package com.rear.rearArtifac.controllers.dto;

import com.rear.rearArtifac.entities.Usuario;

public class PropertyRegistroDto {
    
   private Integer id;
   private String address;
   private String city;
   private String departament;
   private Usuario usuario;
   
public PropertyRegistroDto() {
}
public PropertyRegistroDto(Integer id, String address, String city, String departament, Usuario usuario) {
    
    super();
    this.id = id;
    this.address = address;
    this.city = city;
    this.departament = departament;
    this.usuario = usuario;
}
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public String getDepartament() {
    return departament;
}
public void setDepartament(String departament) {
    this.departament = departament;
}
public Usuario getUsuario() {
    return usuario;
}
public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}

   

}
