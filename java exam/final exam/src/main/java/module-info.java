module com.donrenil.finalexam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.donrenil.finalexam to javafx.fxml;
    exports com.donrenil.finalexam;
}