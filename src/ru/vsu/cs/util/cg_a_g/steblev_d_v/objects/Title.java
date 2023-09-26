package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Title {

    private int x;
    private int y;

    public Title(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printTittle(Graphics g) {
        // 291, 540  ----  300, 540

        // Тень
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 33));
        g.drawString("♪ *BIG BAND*", x, y);

        // Текст
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 30));
        g.drawString("♪ *BIG BAND*", x + 9, y);
    }
}
