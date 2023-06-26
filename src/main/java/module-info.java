module com.senac.senacjunit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senac.senacjunit to javafx.fxml;
    exports com.senac.senacjunit;
}