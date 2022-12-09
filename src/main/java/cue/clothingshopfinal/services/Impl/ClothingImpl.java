package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.services.*;

public class ClothingImpl {
    private final LoginService loginService;
    private final ClothingService clothingService;
    private final ClothingMenService clothingMenService;
    private final SellService sellService;
    private final ClientService clientService;

    private final RegisterService registerService;

    public ClothingImpl() {
        loginService = new LoginServiceImpl(this);
        clothingService =  new ClothingServiceImpl();
        clothingMenService =  new ClothingMenServiceImpl();
        sellService =  new SellServiceImpl();
        clientService =  new ClientServiceImpl(this);
        registerService = new RegisterServiceImpl(this);
    }

    public LoginService getLoginService() {return loginService;}
    public ClothingService getClothingService() {return clothingService;}
    public ClothingMenService getClothingMenService() {return clothingMenService;}
    public SellService getSellService() {return sellService;}
    public ClientService getClientService() {return clientService;}
    public RegisterService getRegisterService() {return registerService;}
}