package org.example;

import javax.swing.*;

public class Main {

    public String menu(){
        return JOptionPane.showInputDialog("Ingrese número con la opción a realizar: "+
                "\r\n1) Sumar"+
                "\r\n2) Restar"+
                "\r\n3) Mult"+
                "\r\n4) Div"+
                "\r\n5) Salir");
    }

    public int convertInt(String opt){
        int result;
        try {
            result=Integer.parseInt(opt);
        }catch (Exception e) {
            result = 0;
        }
        return result;
    }
}
