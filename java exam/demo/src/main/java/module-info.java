module com.donrenil.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.donrenil.demo to javafx.fxml;
    exports com.donrenil.demo;
}