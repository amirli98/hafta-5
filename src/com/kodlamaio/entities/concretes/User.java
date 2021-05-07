package com.kodlamaio.entities.concretes;
import com.kodlamaio.entities.abstracts.Entity;
import java.util.regex.Pattern;


public class User implements Entity {
    private String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";


    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(int id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if(email == null || !Pattern.compile(emailRegex).matcher(email).matches()){
            System.err.println("Girdiginiz karakter dizisi bir email adresi belirtmiyor.");
        }else{
            this.email = email;
        }
        this.password = password;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || !Pattern.compile(emailRegex).matcher(email).matches()){
            System.err.println("Girdiginiz karakter dizisi bir email adresi belirtmiyor.");
        }else{
            this.email = email;
        }
    }

    public void setPassword(String password){
        this.password = password;
    }

    private String  getPassword(){
        return password;
    }


    public boolean equals(User other){
        return this.firstName.equals(other.firstName) && this.email.equals(other.email);
    }

}
