import javax.swing.*;
import java.awt.*;

public class SimplePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Hello! This is my first Applet Program!", 50, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple JPanel Program");

        SimplePanel panel = new SimplePanel();
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
