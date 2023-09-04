import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class DrawPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;
    private Ship ship;
    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();
        this.ship = new Ship(ticksFromStart, 255);


    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(new Color(41, 166, 225));
        g.fillRect(0, 0, 800, 260);
        g.setColor(new Color(1, 58, 145));
        g.fillRect(0, 260, 800, 210);
        g.setColor(new Color(94, 81, 46));
        g.fillRect(650, 400, 47, 100);
        g.fillRect(710, 380, 47, 100);
        g.setColor(Color.black);
        g.drawRect(650, 400, 47, 100);
        g.drawRect(710, 380, 47, 100);
        g.setColor(new Color(141, 78, 9));
        g.fillRect(0, 450, 800, 130);
        g.setColor(Color.BLACK);
        g.fillRect(0, 450, 800, 2);
        g.fillRect(0, 260, 800, 2);
        for (int i = 0; i < 30; i++) {
            g.drawLine(i * 40 + 30, 450, (i - 5) * 100 + 35, 600);
        }
        g.setColor(Color.BLACK);
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 10; k++) {
                g.fillOval((j * 40 + 10), 465, 5, 5);
                g.fillOval((k * 80 + 60), 545, 5, 5);
            }
        }
        ship.setX(ticksFromStart);
        ship.drawPicture(gr);
//        // Нижняя часть корабля
//       g.setColor(new Color(147, 8, 3));
//        g.fillRect(2, 255, 302, 32);
//        g.setColor(Color.BLACK);
//        g.fillRect(2, 255, 350, 2);
//        g.fillRect(2, 285, 302, 2);
//        g.fillRect(2, 285, 300, 2);
//        g.drawLine(2, 255, 2, 285);
//
//        g.setColor(new Color(147, 8, 3));
//        g.fillPolygon(new int[] {302, 352, 304}, new int[] {257, 257, 286}, 3);
//
//        g.setColor(Color.BLACK);
//        g.drawLine(303, 285, 352, 255);
//
//        // Основа корабля
//        g.setColor(new Color(220, 216, 213));
//        g.fillRect(3, 200, 350, 55);
//        g.fillPolygon(new int[] {352, 402, 352}, new int[] {200, 200, 255}, 3);
//
//
//        g.setColor(Color.BLACK);
//        g.drawLine(351, 255, 402, 200);




    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}
