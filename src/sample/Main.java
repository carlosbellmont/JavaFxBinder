package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        GridPane root = loader.load();
        primaryStage.setTitle("Ejemplo Binder");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Controller c = loader.getController();
        c.initData(new TipoDeDato("Button1", "Texto1"), new TipoDeDato("Button2", "Texto2"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
