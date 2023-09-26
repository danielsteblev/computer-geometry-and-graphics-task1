package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Title {

    private int x;
    private int y;

    private String title;

    public Title(int x, int y, String title) {
        this.x = x;
        this.y = y;
        this.title = title;
    }

    public void printTittle(Graphics g) {
        // 291, 540  ----  300, 540

        // Тень
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 33));
        g.drawString(title, x, y);
        // ♪ *BIG BAND*

        // Текст
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 30));
        g.drawString(title, x + 9, y);
    }
}
