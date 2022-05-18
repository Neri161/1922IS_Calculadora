package com.example.a1922is_calculadora;

import java.util.ArrayList;
import java.util.*;
//import java.util.regex.*;

public class ConvertirCadena {
    private static List<String> validar = new ArrayList<String>();
    private static double total;
    public static boolean operacionValida=false;

    public static String validar(String cadena) {
        String[][] operaciones = {{"\\+", "-", "\\*", "/", "\\(", "\\)", "\\[", "]"},
                {" Suma ", " Resta ", " Multiplicacion ", " Division ", "", "", "", ""}};
        String input = cadena;
        for (int i = 0; i < 8; i++) {
            input = input.replaceAll(operaciones[0][i], operaciones[1][i]);
        }

        String[] aux = input.split(" ");
        for (String s : aux) {
            if (!s.equals("")) {
                validar.add(s);
            }
        }
        continuar:
        for (int i = 0; i < validar.size(); i++) {
            for (int j = 0; j < validar.size(); j++) {
                if (validar.get(j).equals("Multiplicacion") || validar.get(j).equals("Division")) {
                    total = realizarOperaciones(validar.get(j - 1), validar.get(j), validar.get(j + 1));
                    validar.set(j + 1, total + "");
                    validar.remove(j);
                    validar.remove(j-1);
                    continue continuar;
                }
            }
            for (int j = 0; j < validar.size(); j++) {
                if (validar.get(j).equals("Suma") || validar.get(j).equals("Resta")) {
                    total = realizarOperaciones(validar.get(j - 1), validar.get(j), validar.get(j + 1));
                    validar.set(j + 1, total + "");
                    validar.remove(j);
                    validar.remove(j-1);
                    continue continuar;
                }
            }
        }
        System.out.println("Total: " + total);
        return "Total: " + total;
    }

    private static double realizarOperaciones(String op1, String operador, String op2) {
        try {
        double n1 = Double.parseDouble(op1);
        double n2 = Double.parseDouble(op2);
        double resultado = 0;

            switch (operador) {
                case "Suma":
                    resultado = n1 + n2;
                    break;
                case "Resta":
                    resultado = n1 - n2;
                    break;
                case "Multiplicacion":
                    resultado = n1 * n2;
                    break;
                case "Division":
                    resultado = n1 / n2;
                    break;
            }
            operacionValida=true;
            return resultado;
        }catch (Exception ex){
            operacionValida=false;
            return 0;
        }
    }
}
