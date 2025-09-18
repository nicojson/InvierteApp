module tecnm.celaya.edu.mx.invierteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens tecnm.celaya.edu.mx.invierteapp to javafx.fxml;
    exports tecnm.celaya.edu.mx.invierteapp;
    opens tecnm.celaya.edu.mx.invierteapp.controller to javafx.fxml;
    exports tecnm.celaya.edu.mx.invierteapp.controller;
}