package com.example.ejercicio6_sb_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.HashSet;

public class HelloController {
    public TextArea area;
    public Button analizar;
    public Button limpiar;
    public TextField result;

    public void onanalizar(ActionEvent actionEvent) {
        HashSet<Integer> hs= new HashSet<>();
        boolean boo=true;
        int[] a= new int[10];
        try {
            for (int i = 0; i < area.getText().length(); i++) {
                int n=Integer.parseInt(String.valueOf(area.getText().charAt(i)));
                a[n]=a[n]+1;
                hs.add(n);
            }
            if (hs.size()==10){
                for (int i = 0; i < a.length; i++) {
                    if (a[i]!=a[0]){
                        boo=false;
                    }
                }
            }else {
                boo=false;
            }
            if (boo==false){
                result.setText("La secuencia es incorrecta");
            }else {
                result.setText("La secuencia es correcta");
            }
        }catch (NumberFormatException nfe){
            result.setText("La secuencia es incorrecta");
        }

    }

    public void onlimpiar(ActionEvent actionEvent) {
        area.clear();
        result.clear();
    }
}
