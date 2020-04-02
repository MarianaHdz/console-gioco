package com.gioco.view;

import com.gioco.controller.CLogin;
import com.gioco.controller.Tools;

public class Login implements IVisualizable {
    CLogin login = new CLogin();

    public Login() {
    }

    @Override
    public void show() {
        Tools.cleanScreen();
        Tools.printTitle("Gioco - Login");
        System.out.println("\nIngesa tus datos de usuario para entrar.");
        System.out.println("\nUsuario: ");
        System.out.println("Contraseña: ");

    }
}
