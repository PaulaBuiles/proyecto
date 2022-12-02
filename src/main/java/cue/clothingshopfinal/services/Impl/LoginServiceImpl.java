package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.services.LoginService;

import java.util.Objects;

public class LoginServiceImpl implements LoginService {
    String user= "paula";
    String password= "12345";

    @Override
    public Boolean login(String username, String pass) {
        System.out.println(username+pass);
        boolean passwordLogin = checkPass(pass);
        boolean us = checkUser(username);
        if(passwordLogin == true && us == true){
            return true;
        }else return false;
    }
    public Boolean checkPass(String passwordRegis){
        if (Objects.equals(password, passwordRegis)){
            return true;
        }else return false;
    }
    public Boolean checkUser(String username){
        if (Objects.equals(user, username)) {
            return true;
        }else return false;
    }
}
