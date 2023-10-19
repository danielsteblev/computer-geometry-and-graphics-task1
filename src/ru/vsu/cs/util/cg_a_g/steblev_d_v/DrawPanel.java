package ru.vsu.cs.util.cg_a_g.steblev_d_v;

import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.*;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.BigShip;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.Ship;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.SmallShip;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.SmallShipV2;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.utils.GetRandom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements ActionListener {
    private Timer timer;
    public static int ticksFromStart1 = 0;
    private final Pier pier;
    private final Ship bigShip;
    private Ship sh = null;
    private final Ship sh2;
    private final Ship smallShipV2;

    private final java.util.List<Cloud> cloudList = new ArrayList<Cloud>();
    private Title title;
    private final java.util.List<Lifebuoy> lifebuoyList = new ArrayList<Lifebuoy>();
    private Wave wave;
    public static double phase;


    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.title = new Title(291, 540, "♪ *BIG BAND*");
        timer = new Timer(timerDelay, this);
        timer.start();
        Cloud cloud1 = new Cloud(40, 40, 4);
        Cloud cloud2 = new Cloud(450, 15, 4);
        Cloud cloud3 = new Cloud(330, 100, 2);
        Cloud cloud4 = new Cloud(520, 115, 2);
        Cloud cloud5 = new Cloud(360, 160, 1);
        Cloud cloud6 = new Cloud(90, 130, 1);
        cloudList.add(cloud1);
        cloudList.add(cloud2);
        cloudList.add(cloud3);
        cloudList.add(cloud4);
        cloudList.add(cloud5);
        cloudList.add(cloud6);

        this.sh = new SmallShip(GetRandom.getRandom(1, 250), 250, new Color(214, 130, 70));
        this.sh2 = new SmallShip(GetRandom.getRandom(280, 500), 250, new Color(172, 140, 79));
        this.smallShipV2 = new SmallShipV2(GetRandom.getRandom(530, 700), 245, new Color(223, 154, 182));
        Lifebuoy shipLifebuoy = new Lifebuoy(700, 200, 1);
        this.bigShip = new BigShip(ticksFromStart1, 255, shipLifebuoy);

        this.pier = new Pier(new Fence(new Poster(GetRandom.getRandom(1, 700))));
        Lifebuoy lifebuoy1 = new Lifebuoy(GetRandom.getRandom(1, 100), 185, 2);
        Lifebuoy lifebuoy2 = new Lifebuoy(GetRandom.getRandom(200, 300), 185, 2);
        lifebuoyList.add(shipLifebuoy);
        lifebuoyList.add(lifebuoy1);
        lifebuoyList.add(lifebuoy2);
        this.wave = new Wave(300, 65/14, 570/2, new Color(1, 58, 145));
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        /*
        РИСОВАНИЕ ФОНА
         */

        // Небо
        g.setColor(new Color(41, 166, 225));
        g.fillRect(0, 0, 800, 260);

        // Море
        g.setColor(new Color(1, 58, 145));
        g.fillRect(0, 260, 800, 305);

        // Линия горизонта
        g.setColor(Color.black);
        g.fillRect(0, 260, 800, 1);

        for (int i = 0; i < cloudList.size(); i++) {
            cloudList.get(i).drawCloud(gr);
        }

        smallShipV2.drawShip(gr);
        sh.drawShip(gr);
        sh2.drawShip(gr);
        bigShip.setX(ticksFromStart1);
        for (int i = 0; i < lifebuoyList.size(); i++) {
            lifebuoyList.get(0).setX(ticksFromStart1 + 140);
        }
        bigShip.drawShip(gr);

        pier.drawPier(gr);
        title.printTittle(gr);
        for (int i = 1; i < lifebuoyList.size() ; i++) {
            lifebuoyList.get(i).drawLifebuoy(gr);
        }

        wave.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart1;
        }

        phase += 0.3;
        repaint();
    }
}
