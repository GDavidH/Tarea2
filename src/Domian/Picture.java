package Domian;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture extends JPanel {

    public Picture() {
        this.setPreferredSize(new Dimension(800, 600));
    }

    //Será el método encargado de realizar el pintado en pantalla
    private void draw(Graphics g) {
        g.setPaintMode();

        //Primitivas haciendo uso de Graphics
        g.setColor(new Color(255, 190, 0, 255));
        g.fillRect(0, 0, 810, 610);
//      g.fillRoundRect(50, 430, 100, 100, 20, 20);
        g.setColor(new Color(240, 95, 40, 230));
        g.fillOval(420, 245, 250, 250);

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(532, 55, 90, 45);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(560, 82, 90, 45);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(505, 82, 90, 45);

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(132, 15, 90, 45);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(160, 42, 90, 45);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(105, 42, 90, 45);

        g.setColor(new Color(0, 0, 0, 255));
        g.drawLine(35, 35, 55, 50);
        g.drawLine(62, 35, 55, 50);

        g.setColor(new Color(0, 0, 0, 255));
        g.drawLine(135, 135, 155, 150);
        g.drawLine(160, 135, 155, 150);

        g.setColor(new Color(0, 0, 0, 255));
        g.drawLine(635, 155, 655, 150);
        g.drawLine(660, 135, 655, 150);

        for (int i = 0; i < 3000; i++) {
            g.setColor(new Color(80, 150, 240));
            g.drawLine(i, 350, i, 610);

            if (i % 3 == 0) {
                g.setColor(new Color(255, 180, 0, 255));
                g.drawLine(i, 350, i, 355);
            }
        }

        int m = 418, b = 670, y = 350;

        for (int i = 0; i < 20; i++) {
            m = m + 10;
            b = b -2;
            y = y + 7;
            g.setColor(new Color(240, 90, 30, 180));
            g.drawLine(m, y, b, y);
        }
    }

    //Es necesario sobreescribir el metodo paintComponent para poder pintar
    @Override
    protected void paintComponent(Graphics g
    ) {
        super.paintComponent(g);
        draw(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Picture");
        ventana.setContentPane(new Picture());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();

        ventana.setResizable(false);
        ventana.setLocation(300, 50);
        ventana.setVisible(true);
    }

}
