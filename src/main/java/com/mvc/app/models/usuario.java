package com.mvc.app.models;

public class usuario {
     
    private String nombre;
    private String apellido;
    private String email;

    public usuario(){
    }

    public usuario(String nombre,String apellido, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
}
