package Domian;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LineArt extends JPanel {

    //Constructor
    public LineArt() {
        this.setPreferredSize(new Dimension(550, 450));
    }

    //Dibuja plano cartesiano
    private void draw(Graphics g) {
        // Total de lineas utilizadas
        for (int i = 0; i < 5000; i++) {

            // Se establecen los colores de las lineas
            int selectColor;
            selectColor = (int) (Math.random() * 18);

            switch (selectColor) {
                case 0:
                    g.setColor(Color.BLACK);
                    break;
                case 1:
                    g.setColor(Color.BLUE);
                    break;
                case 2:
                    g.setColor(Color.CYAN);
                    break;
                case 3:
                    g.setColor(Color.DARK_GRAY);
                    break;
                case 4:
                    g.setColor(Color.GRAY);
                    break;
                case 5:
                    g.setColor(Color.GREEN);
                    break;
                case 6:
                    g.setColor(Color.LIGHT_GRAY);
                    break;
                case 7:
                    g.setColor(Color.MAGENTA);
                    break;
                case 8:
                    g.setColor(Color.ORANGE);
                    break;
                case 9:
                    g.setColor(Color.PINK);
                    break;
                case 10:
                    g.setColor(Color.RED);
                    break;
                case 11:
                    g.setColor(Color.WHITE);
                    break;
                case 12:
                    g.setColor(Color.YELLOW);
                    break;
                case 13:
                    g.setColor(new Color(50, 80, 125, 50));
                    break;
                case 14:
                    g.setColor(new Color(150, 50, 255, 0));
                    break;
                case 15:
                    g.setColor(new Color(110, 80, 0, 50));
                    break;
                case 16:
                    g.setColor(new Color(220, 99, 240, 20));
                    break;
                case 17:
                    g.setColor(new Color(74, 63, 1, 180));
                    break;

                default:
                    g.setColor(new Color(200, 200, 0, 200));
            }
            
            double x = (Math.random() * (1 - 555 + 1)) + 555;
            double y = (Math.random() * (1 - 460 + 1)) + 460;
            double x1 = (Math.random() *(1-560+ 1)) + 560;
            double y1 = (Math.random() *(1- 460 + 1)) + 460;
            g.drawLine((int) x, (int) y, (int) x1, (int) y1);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Line Art");
        window.setContentPane(new LineArt());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.pack();
        window.setResizable(false);
        window.setLocation(150, 100);
        window.setVisible(true);
    }
}
