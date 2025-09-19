package tecnm.celaya.edu.mx.invierteapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class FormularioInteresSimple implements Initializable {
    public GridPane gridFormInteresSimple;
    public TextField txtCapitalInicial;
    public TextField txtTasaInteres;
    public TextField txtTiempo;
    public TextField txtInteresGenerado;
    public TextField txtMontoTotal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    public void calcularInteresSimple(ActionEvent actionEvent) {

    }

    public void regresarAlMenuPrincipal(ActionEvent actionEvent) {

    }
}
