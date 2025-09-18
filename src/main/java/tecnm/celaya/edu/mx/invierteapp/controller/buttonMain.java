package tecnm.celaya.edu.mx.invierteapp.controller;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class buttonMain {

    public GridPane gridButtons;

    public Button calInteresSimple;
    public Button calInteresCompuesto;
    public Button calPeriodoTiempo;
    public Button calCapitalInicialInvertir;

    public void interesSimpleClickButton() {calInteresSimple.setDisable(true);}
    public void interesCompuestoClickButton() {calInteresCompuesto.setDisable(true);}
    public void periodoTiempoClickButton() {calPeriodoTiempo.setDisable(true);}
    public void capitalInicialClickButton() {calCapitalInicialInvertir.setDisable(true);}
}
