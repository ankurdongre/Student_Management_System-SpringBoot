package org.example.model;

public class Student {
    int id;
    String name,email;

    public void setId(int id){
        this.id= id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

}
