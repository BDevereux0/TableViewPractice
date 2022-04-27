module com.example.tableviewpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.tableviewpractice to javafx.fxml;
    exports com.example.tableviewpractice;
}