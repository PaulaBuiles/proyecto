package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.exceptions.InputException;
import cue.clothingshopfinal.exceptions.InputValidations;
import cue.clothingshopfinal.model.Client;
import cue.clothingshopfinal.model.ClientDTO;
import cue.clothingshopfinal.services.RegisterService;
import java.io.IOException;

public class RegisterServiceImpl implements RegisterService {

    private final InputValidations inputValidations= new InputValidations();

    private final ClothingImpl clothingImpl;

    public RegisterServiceImpl(ClothingImpl clothingImpl) {this.clothingImpl = clothingImpl;}

    @Override
    public Boolean addUser(String username, String password, String gmail, String id) throws IOException, InputException {
        inputValidations.mailInput(gmail);
        inputValidations.emptyInput(username, password, gmail,id);
        if (username.equals("")||password.equals("")||gmail.equals("")||id.equals("")){
            return false;
        }else{
            clothingImpl.getClientService().addClient(new Client(username, password, gmail, id,false),new ClientDTO(username, gmail, password));
            return true;
        }
    }
}
