module cue.clothingshopfinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    /*opens cue.clothingshopfinal to javafx.fxml;*/
    exports cue.clothingshopfinal;
    opens cue.clothingshopfinal.controller to javafx.fxml;
    exports cue.clothingshopfinal.controller;
    opens cue.clothingshopfinal.model to javafx.fxml;
    exports cue.clothingshopfinal.model;
    opens cue.clothingshopfinal to javafx.graphics;

}