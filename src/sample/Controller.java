package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    public Label label1;

    @FXML
    public Label label2;

    @FXML
    public Button button1;

    @FXML
    public Button button2;



    public void initData(TipoDeDato t1, TipoDeDato t2) {
        Binder.bind(t1, button1, label1);
        Binder.bind(t2, button2, label2);
    }

}
