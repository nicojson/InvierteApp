package tecnm.celaya.edu.mx.invierteapp;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import tecnm.celaya.edu.mx.invierteapp.controller.ButtonsMain;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {


    public ImageView logoImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        showButtonsMain();
    }

    public VBox mainContainer;

    public void showButtonsMain() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("views/buttons-main.fxml"));
        VBox vBox = null;
        try {
            vBox = fxmlLoader.load();
            mainContainer.getChildren().setAll(vBox);

            ButtonsMain buttonsMainController = fxmlLoader.getController();

            buttonsMainController.calInteresSimple.setOnAction(event ->
            {
                showInteresSimpleForm();
            });

            buttonsMainController.calInteresCompuesto.setOnAction(event ->
            {
                showInteresCompuestoForm();
            });

            buttonsMainController.calCapitalInicialInvertir.setOnAction(event ->
            {
                showCapitalInicialForm();
            });

            buttonsMainController.calPeriodoTiempo.setOnAction(event ->
            {
                showPeriodoTiempoForm();
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showInteresSimpleForm() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("views/formulario-interes-simple.fxml"));
        try {
            VBox vBox = fxmlLoader.load();
            //agregar boton de regresar
            vBox.getChildren().add(createButton());
            mainContainer.getChildren().setAll(vBox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showInteresCompuestoForm() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("views/formulario-interes-compuesto.fxml"));
        try {
            VBox vBox = fxmlLoader.load();
            //agregar boton de regresar
            vBox.getChildren().add(createButton());
            mainContainer.getChildren().setAll(vBox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showCapitalInicialForm() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("views/formulario-capital-inicial.fxml"));
        try {
            VBox vBox = fxmlLoader.load();
            //agregar boton de regresar
            vBox.getChildren().add(createButton());
            mainContainer.getChildren().setAll(vBox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showPeriodoTiempoForm() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("views/formulario-periodo-tiempo.fxml"));
        try {
            VBox vBox = fxmlLoader.load();
            //agregar boton de regresar
            vBox.getChildren().add(createButton());
            mainContainer.getChildren().setAll(vBox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Button createButton()
    {
        Button backButton = new Button("Volver al menú principal");
        backButton.setOnAction(event -> showButtonsMain());
        backButton.setAlignment(Pos.CENTER);
        return backButton;
    }

}