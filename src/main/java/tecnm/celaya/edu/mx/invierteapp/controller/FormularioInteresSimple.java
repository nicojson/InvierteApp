package tecnm.celaya.edu.mx.invierteapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    public Button btnCalcularInteres;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCalcularInteres.setOnAction(event -> {calcularTasaInteres();});

    }

    private void calcularTasaInteres() {
        try {
            // Obtiene los valores de los campos de texto
            double capitalInicial = Double.parseDouble(txtCapitalInicial.getText());
            double tiempo = Double.parseDouble(txtTiempo.getText());
            double tasaInteres = Double.parseDouble(txtTasaInteres.getText());

            // Realiza los cálculos solo si los valores son válidos
            double interesGenerado = (capitalInicial * tasaInteres * tiempo) / 100;
            txtInteresGenerado.setText(String.format("%.2f", interesGenerado));

            double montoTotal = capitalInicial + interesGenerado;
            txtMontoTotal.setText(String.format("%.2f", montoTotal));

        } catch (NumberFormatException e) {
            // Esto se ejecuta si algún campo está vacío o no es un número válido
            System.out.println("Error: Asegúrese de llenar todos los campos con números válidos.");
            // Opcional: Puedes mostrar una alerta al usuario
            txtTasaInteres.setText("Error");
            txtMontoTotal.setText("Error");
        }
    }






}
