package sprint3_swing_learning.mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseAdapter{
    JButton button;
    JPanel panel;
    JFrame frame;

    MouseAdapter(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Button");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button.setForeground(Color.RED);
                button.setBackground(Color.BLACK);
                button.setOpaque(true);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button.setForeground(Color.WHITE);
                button.setBackground(Color.YELLOW);
                button.setOpaque(true);
            }
        });
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseAdapter();
    }
}
