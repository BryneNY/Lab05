module com.mycompany.lab05 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab05 to javafx.fxml;
    exports com.mycompany.lab05;
}
