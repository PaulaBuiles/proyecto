package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.model.Client;
import cue.clothingshopfinal.services.LoginService;


public class LoginServiceImpl implements LoginService {

    private final ClothingImpl clothingImpl;

    public LoginServiceImpl(ClothingImpl clothingImpl) {this.clothingImpl = clothingImpl;}


    @Override
    public Boolean login(String username, String pass) {
        for (Client client: clothingImpl.getClientService().getClientList()){
            if (client.getUsername().equals(username)&&client.getPassword().equals(pass)){
                clothingImpl.getClientService().setClientOn(client);
                return true;
            }
            System.out.println(client.getUsername());
        }
        return false;
    }
}
