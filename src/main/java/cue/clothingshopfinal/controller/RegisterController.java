package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import cue.clothingshopfinal.HelloApplication;
import cue.clothingshopfinal.exceptions.InputException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegisterController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField registerContrasena;

    @FXML
    private TextField registerGmail;

    @FXML
    private TextField registerId;

    @FXML
    private TextField registerUsuario;

    @FXML
    void loginView(MouseEvent event) throws IOException {
        HelloApplication.loginView(event);

    }

    @FXML
    void sellView(MouseEvent event) {
        try {
            if (mfc.clothing.getRegisterService().addUser(registerUsuario.getText(), registerContrasena.getText(), registerGmail.getText(), registerId.getText())){
                mfc.getClothing().getClientService().printClients();

                HelloApplication.sellView(event);
                registerUsuario.setText("");
                registerContrasena.setText("");
                registerId.setText("");
                registerGmail.setText("");
            }else{
                alertError();
            }
        }catch (IOException | InputException e){
            throw new RuntimeException(e);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    void alertError(){
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setHeaderText("Espacios incompletos");
        alert.setTitle("Error");
        alert.setContentText("Debe completar todos los campos");
        alert.showAndWait();

    }
}

