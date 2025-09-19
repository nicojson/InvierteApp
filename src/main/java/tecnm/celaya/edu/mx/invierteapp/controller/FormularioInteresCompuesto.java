package tecnm.celaya.edu.mx.invierteapp.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class FormularioInteresCompuesto implements Initializable {
    public GridPane gridPane;
    public TextField txtCapitalInicial;
    public TextField txtTasaInteres;
    public TextField txtNumeroPeriodos;
    public TextField txtMontoFinal;
    public Button btnCalcularMontoFinal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCalcularMontoFinal.setOnAction(e -> {calcularInteresCompuesto();});
    }

    public void calcularInteresCompuesto(){
        double capitalInicial = Double.parseDouble(txtCapitalInicial.getText());
        double tasaInteres = Double.parseDouble(txtTasaInteres.getText()) / 100;
        double numeroPeriodos = Double.parseDouble(txtNumeroPeriodos.getText());
        double montoFinal = capitalInicial * Math.pow((1 + tasaInteres), numeroPeriodos);
        txtMontoFinal.setText(String.format("%.2f", montoFinal));
    }

}
