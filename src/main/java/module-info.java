module com.example.dwmatioapodrasis {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.dwmatioapodrasis to javafx.fxml;
    exports com.example.dwmatioapodrasis;
}