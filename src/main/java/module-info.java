module com.example.ejercicio6_sb_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio6_sb_2 to javafx.fxml;
    exports com.example.ejercicio6_sb_2;
}