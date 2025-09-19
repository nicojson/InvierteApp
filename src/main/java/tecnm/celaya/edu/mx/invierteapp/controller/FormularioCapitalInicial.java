package tecnm.celaya.edu.mx.invierteapp.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class FormularioCapitalInicial implements Initializable {
    public GridPane gridPane;
    public TextField txtMontoFinal;
    public TextField txtTasaInteres;
    public TextField txtNumeroPeriodos;
    public TextField txtCapitalInicial;
    public Button btnCalcular;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCalcular.setOnAction(event -> {calcularCapitalInicial();});
    }

    public void calcularCapitalInicial(){
        double montoFinal = Double.parseDouble(txtMontoFinal.getText());
        double tasaInteres = Double.parseDouble(txtTasaInteres.getText()) / 100;
        double numeroPeriodos = Double.parseDouble(txtNumeroPeriodos.getText());
        double capitalInicial = montoFinal / Math.pow((1 + tasaInteres), numeroPeriodos);
        txtCapitalInicial.setText(String.format("%.2f", capitalInicial));
    }



}
