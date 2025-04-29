package com.example.PROJETO.CRUD;

public class UserRequest {


    // A classe USER ele é utilizada como molde para a criação de usuário

    private long id;

    private String name;

    private String email;



    //Getters and Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)    {
        this.name = name;
    }

    public String getEmail()    {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }


}
