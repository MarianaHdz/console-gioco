package com.gioco.view;

import com.gioco.controller.Tools;

import javax.tools.Tool;

public class MainMenu implements IVisualizable {
    int option = 0;

    @Override
    public void show() {
        do {
            Tools.cleanScreen();
            Tools.cleanLine();
            Tools.printTitle("Gioco - Tienda de videojuegos");
            System.out.println("1.- Administrar Artículos");
            System.out.println("2.- Administrar Clientes");
            System.out.println("3.- Administrar ventas");
            System.out.println("0.- Salir");

            option = Tools.getOption();
            Tools.validateOption(0, 3, option);

        } while (option != 0);
    }
}
