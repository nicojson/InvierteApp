package tecnm.celaya.edu.mx.invierteapp.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class FormularioPeriodoTiempo implements Initializable {

    public GridPane gridPane;
    public TextField txtMontoFinal;
    public TextField txtCapitalInicial;
    public TextField txtTasaInteres;
    public TextField txtPeriodoTiempo;
    public Button btnCalcularPeriodoTiempo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCalcularPeriodoTiempo.setOnAction(event -> {calcularPeriodoTiempo();});
    }

    public void calcularPeriodoTiempo(){
        double montoFinal = Double.parseDouble(txtMontoFinal.getText());
        double capitalInicial = Double.parseDouble(txtCapitalInicial.getText());
        double tasaInteres = Double.parseDouble(txtTasaInteres.getText()) / 100;
        double periodoTiempo = (Math.log(montoFinal / capitalInicial)) / (Math.log(1 + tasaInteres));
        txtPeriodoTiempo.setText(String.format("%.2f", periodoTiempo));
    }

}
