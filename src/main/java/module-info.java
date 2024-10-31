module com.example.midqsolveray {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.midqsolveray to javafx.fxml;
    exports com.example.midqsolveray;
}