package com.gioco.controller;

public class Validating {

    public static boolean validate(Object obj) {
        if ((obj == null)) {
            System.out.println(Tools.ANSI_RED + "Operación no valida" + Tools.ANSI_RESET);
            return false;
        } else return true;
    }
}
