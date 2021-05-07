package com.kodlamaio.daos.concretes;

import com.kodlamaio.daos.abstracts.UserDao;
import com.kodlamaio.entities.concretes.User;

import java.util.LinkedList;
import java.util.List;

public class ConcreteUserDao implements UserDao {

    private List<User> users;

    @Override
    public void add(User user) {
        if(users == null){
            users =  new LinkedList<User>();
        }
        if(exists(user)){
            System.out.println("Kullanici zaten mevcut");
            return;
        }
        users.add(user);
    }

    @Override
    public void update(User user){
        if(!exists(user))
        {
            System.out.println("Kullanici mevcut degil");
            return;
        }
        for(User u:users){
            if(u.equals(user)){
                System.out.println(user.getFirstName()+" yenilendi.");
                return;
            }
        }
        System.out.println(user.getFirstName()+"mevcut degil");

    }

    @Override
    public void delete(User user) {
        if(!exists(user))
            System.out.println("Kullanici mevcut degil.");
        users.remove(user);
    }

    @Override
    public List<User> getAllUsers() {
        if(users == null)
            return new LinkedList<User>();
        return users;
    }

    @Override
    public boolean exists(User user) {
        if(users == null)
            return false;
        for(User u:users){
            if(u.equals(user))
                return true;
        }
        return false;
    }


}
