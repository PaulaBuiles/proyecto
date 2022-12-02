package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.services.ClothingMenService;
import cue.clothingshopfinal.services.ClothingService;
import cue.clothingshopfinal.services.LoginService;
import cue.clothingshopfinal.services.SellService;

public class ClothingImpl {
    private final LoginService loginService;
    private final ClothingService clothingService;
    private final ClothingMenService clothingMenService;
    private final SellService sellService;

    public ClothingImpl() {
        loginService = (LoginService) new LoginServiceImpl();
        clothingService = (ClothingService) new ClothingServiceImpl();
        clothingMenService = (ClothingMenService) new ClothingMenServiceImpl();
        sellService = (SellService) new SellServiceImpl();
    }

    public LoginService getLoginService() {return loginService;}
    public ClothingService getClothingService() {return clothingService;}
    public ClothingMenService getClothingMenService() {return clothingMenService;}
    public SellService getSellService() {return sellService;}
}