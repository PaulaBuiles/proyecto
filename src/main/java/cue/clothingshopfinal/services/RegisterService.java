package cue.clothingshopfinal.services;

import cue.clothingshopfinal.exceptions.InputException;

import java.io.IOException;

public interface RegisterService {
    Boolean addUser(String username, String password, String gmail, String id) throws IOException, InputException;
}
