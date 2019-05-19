package ru.raiffeisen.annotations;

import javax.validation.constraints.NotNull;

public class User {
    @NotNull(message = "Name attribute must not be null")
    private String name;
    private String sirname;
    private int age;
    private String email;
    @Inn
    private String inn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
