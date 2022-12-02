package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cue.clothingshopfinal.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField loginContraseña;

    @FXML
    private TextField loginUsuario;

    @FXML
    void sellView(MouseEvent event)throws IOException {
        System.out.println(loginContraseña.getText()+loginUsuario.getText());
        boolean x = ModelFactoryController.getInstance().clothing.getLoginService().login(loginUsuario.getText(),loginContraseña.getText());
        if(x){
            HelloApplication.sellView(event);
        }
    }

    @FXML
    void initialize() {

    }

}

