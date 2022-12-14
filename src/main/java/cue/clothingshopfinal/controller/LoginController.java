package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;
import cue.clothingshopfinal.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginContrasena;

    @FXML
    private TextField loginUsuario;

    @FXML
    void sellView(MouseEvent event) {
        try {
            if(mfc.getClothing().getLoginService().login(loginUsuario.getText(), loginContrasena.getText())){
                HelloApplication.sellView(event);
                System.out.println("hola");
                mfc.clothing.getClientService().condition(loginContrasena.getText());
            }else {
                loginUsuario.setText("");
                loginContrasena.setText("");
                alertError();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void registerView(MouseEvent event) throws IOException {
         HelloApplication.registerView(event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CompletableFuture.runAsync(()->{
            System.out.println("Llamamos persistencia");
            mfc.clothing.getClientService().createUserList();

        });
    }
    void alertError(){
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("Usuario no encontrado");
        alert.showAndWait();

    }
}

