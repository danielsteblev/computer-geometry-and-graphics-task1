package ru.vsu.cs.util.cg_a_g.steblev_d_v;

import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart1 = 0;
    private int ticksFromStart2 = 0;
    private int ticksFromStart3 = 0;
    private Ship ship;

    private Cloud cloud;

    private Cloud cloud2;

    private SmallShip sh;
    private SmallShip sh2;
    private SmallShip sh3;
    private RealityCloud cloudR;
    private RealityCloud cloudR2;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.sh = new SmallShip(20, 250, new Color(214,130,70));
        this.sh2 = new SmallShip(120, 250, new Color(172,140,79));
        this.sh3 = new SmallShip(650, 250, new Color(223,154,182));

        this.ship = new Ship(ticksFromStart1, 255);

        this.cloud = new Cloud(ticksFromStart2, 30);

        this.cloud2 = new Cloud(ticksFromStart3, 20);

        this.cloudR = new RealityCloud(40, 50);
        this.cloudR2 = new RealityCloud(450, 30);











    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        // Рисование фона
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(new Color(41, 166, 225));
        g.fillRect(0, 0, 800, 260);
        g.setColor(new Color(1, 58, 145));
        g.fillRect(0, 260, 800, 210);
        g.setColor(new Color(121, 64, 6));
        g.fillRect(0, 450, 800, 130);
        g.setColor(Color.BLACK);
        g.fillRect(0, 450, 800, 2);
        g.fillRect(0, 260, 800, 2);
        for (int i = 0; i < 30; i++) {
            g.drawLine(i * 40 + 30, 450, (i - 5) * 100 + 35, 600);
        }
        g.setColor(new Color(121, 64, 6));
        for(int i = 0; i < 10; i++){
            g.fillRect((i + 1) * 80, 350, 20, 100);
        }

        for(int i = 0; i < 10; i++){
            g.setColor(Color.black);
            g.drawRect((i + 1) * 80, 350, 20, 100);
        }


        g.setColor(new Color(121, 64, 6));
        g.fillRect(-1, 365, 1000, 20);
        g.fillRect(-1, 415, 1000, 20);
        g.setColor(Color.BLACK);
        g.drawRect(-1,365, 1000, 20);
        g.drawRect(-1,415, 1000, 20);
        for (int j = 0; j < 18; j++) {
            for (int k = 0; k < 10; k++) {
                g.fillOval((j * 45 + 50), 460, 3, 3);
                g.fillOval((k * 80 + 60), 545, 3, 3);
            }
        }

        g.setColor(new Color(230, 176, 7));
        g.fillRect(625, 355, 50, 70);
        g.setColor(Color.black);
        g.drawRect(630, 360, 40, 60);
        g.drawRect(625, 355, 50, 70);
        g.setFont(new Font("Times", Font.BOLD, 8));
        g.drawString("DANGER", 632, 380);
//        g.drawString("ZONE", 633, 394);
        g.setFont(new Font("Times", Font.PLAIN, 35));
        g.drawString("☠\uFE0F", 632, 410);



        sh.drawSmallShip(gr);
        sh2.drawSmallShip(gr);
        sh3.drawSmallShip(gr);



        ship.setX(ticksFromStart1);
        ship.drawShip(gr);

//        cloudR.setX(ticksFromStart2 + 500);
        cloudR.drawRealityCloud(gr);

//        cloudR2.setX(ticksFromStart3 + 10);
        cloudR2.drawRealityCloud(gr);

//        cloud.setX(ticksFromStart2 + 500);
//        cloud.drawCloud(gr);
//
//        cloud2.setX(ticksFromStart3 + 10);
//        cloud2.drawCloud(gr);

        // Текст
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 33));
        g.drawString("♪ *BIG BAND*", 291, 540);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 30));
        g.drawString("♪ *BIG BAND*", 300, 540);

        Sun sun = new Sun(450, 15, 80, 80);
        Cloud cloud = new Cloud(100, 10);
        Cloud cloud2 = new Cloud(350, 40);

//        sun.drawSun(gr);
//        cloud.drawCloud(gr);
//        cloud2.drawCloud(gr);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer) {
            repaint();
            ++ticksFromStart1;
            --ticksFromStart2;
            ticksFromStart3 += 2;

        }
    }
}
