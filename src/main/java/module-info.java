module cue.clothingshopfinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens cue.clothingshopfinal to javafx.fxml;
    exports cue.clothingshopfinal;
}