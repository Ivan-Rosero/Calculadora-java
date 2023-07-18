package org.example;

import javax.swing.*;

public class ClassThree {
    public static void main(String[] args) {

        Main objMainClass = new Main();
        String option = objMainClass.menu();
        int op = objMainClass.convertInt(option);
        while(op<=0){
            option = objMainClass.menu();
            op= objMainClass.convertInt(option);
        }
        String num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        int num_int1 = objMainClass.convertInt(num1);

        String num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        int num_int2 = objMainClass.convertInt(num2);

        double result = 0.0;

        switch (op){
            case 1:
                result = num_int1 + num_int2;
                break;
            case 2:
                result = num_int1 - num_int2;
                break;
            case 3:
                result = num_int1 * num_int2;
                break;
            case 4:
                result = num_int1 / num_int2;
                break;
            case 5:
                result = result;
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + op);
        }
        if (op == 5){
            JOptionPane.showMessageDialog(null, "No se realizó ninguna operación, gracias por usar la calculadora.");
        }else {
            JOptionPane.showMessageDialog(null, "Resultado operación: " + result);
        }
    }
}
