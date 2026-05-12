module com.example.cursed_borders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cursed_borders to javafx.fxml;
    exports com.example.cursed_borders;
}