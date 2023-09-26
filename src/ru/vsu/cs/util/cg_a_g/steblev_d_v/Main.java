package ru.vsu.cs.util.cg_a_g.steblev_d_v;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainWindow.setSize(800, 600);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);

        // Центрирование окна
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        mainWindow.setLocation(dimension.width / 2 - mainWindow.getSize().width / 2,
                dimension.height / 2 - mainWindow.getSize().height / 2);
        System.out.println("Попытка запуска приложения...");
    }
}