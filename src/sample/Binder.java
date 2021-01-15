package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Binder {

    public static void bind(TipoDeDato tipoDeDato, Button b, Label l){
        if (b != null)
            b.setText(tipoDeDato.textToButton);
        if (l != null)
            l.setText(tipoDeDato.textToLabel);
    }

}
