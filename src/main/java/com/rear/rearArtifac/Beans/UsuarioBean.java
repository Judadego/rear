package com.rear.rearArtifac.Beans;


public class UsuarioBean{
    
    
    private static Integer Id_user;
    private static String Fname ;
    private static String Lname;
    private static String TypeDni;
    private static Integer Phone;
    private static String Email;
    private static String Password;

    private boolean savedCorrectly = false;

    //relacion de PK con Review
    /*@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List < Review > review;*/
    
    //Relacion Pk con Property
    /*@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List < Property > property;*/

    public boolean isSavedCorrectly() {
        return savedCorrectly;
    }


    public void setSavedCorrectly(boolean savedCorrectly) {
        this.savedCorrectly = savedCorrectly;
    }


    public UsuarioBean (){}
    
       
    public static Integer getId_user() {
        return Id_user;
    }

    public static String getFname() {
        return Fname;
    }

    public static String getLname() {
        return Lname;
    }

    public static String getTypeDni() {
        return TypeDni;
    }

    public static Integer getPhone() {
        return Phone;
    }

    public static String getEmail() {
        return Email;
    }

    public static String getPassword() {
        return Password;
    }

    public void setId_user(Integer id_user) {
        Id_user = id_user;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setTypeDni(String typeDni) {
        TypeDni = typeDni;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }
   //Constructor
   public UsuarioBean(Integer id_user, String fname, String lname, String typeDni,int phone , String email,
   String password) {
        //this.Id_user = Id_user;
        this.setId_user(id_user);
        //Fname = fname;
        this.setFname(fname);
        //Lname = lname;
        this.setLname(lname);
        //TypeDni = typeDni;
        this.setTypeDni(typeDni);
        //Phone = phone;
        this.setPhone(phone);
        //Email = email;
        this.setEmail(email);
        //Password = password;
        this.setPassword(password);
}


}
 