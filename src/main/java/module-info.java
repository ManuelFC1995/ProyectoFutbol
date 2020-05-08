module com.mycompany.mavenproject7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.mycompany.mavenproject7.Controller to javafx.fxml;
    exports com.mycompany.mavenproject7;
}