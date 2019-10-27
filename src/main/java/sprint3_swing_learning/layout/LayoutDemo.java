package sprint3_swing_learning.layout;

import javax.swing.*;
import java.awt.*;




public class LayoutDemo {
    public static void main(String[] args) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame flowLayoutFrame = new JFrame();
        JFrame gridLayoutFrame = new JFrame();
        JFrame borderLayoutFrame = new JFrame();


        flowLayoutFrame.setTitle("flow");
        gridLayoutFrame.setTitle("grid");
        borderLayoutFrame.setTitle("border");

        flowLayoutFrame.setLayout(new FlowLayout());

        JLabel north = new JLabel("North");
        JLabel south = new JLabel("South");
        JLabel east = new JLabel("East");
        JLabel west = new JLabel("West");
        JLabel center = new JLabel("Center");

        GridLayout gridLayout = new GridLayout(2,3);
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(gridLayout);
        gridPanel.add(north);
        gridPanel.add(south);
        gridPanel.add(east);
        gridPanel.add(west);
        gridPanel.add(center);
        gridLayoutFrame.add(gridPanel);


        JPanel borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        borderPanel.add(north, BorderLayout.NORTH);
        borderPanel.add(south, BorderLayout.SOUTH);
        borderPanel.add(east, BorderLayout.EAST);
        borderPanel.add(west, BorderLayout.WEST);
        borderPanel.add(center, BorderLayout.CENTER);
        borderLayoutFrame.add(borderPanel);


        flowLayoutFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gridLayoutFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        borderLayoutFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        flowLayoutFrame.setSize(300,300);
        gridLayoutFrame.setSize(300,300);
        borderLayoutFrame.setSize(300,300);

        flowLayoutFrame.setLocation(0,0);
        gridLayoutFrame.setLocation(dimension.width-flowLayoutFrame.getWidth(),0);
        borderLayoutFrame.setLocation(dimension.width-flowLayoutFrame.getWidth()-gridLayoutFrame.getWidth(),0);

        //flowLayoutFrame.add(panel);

        //borderLayoutFrame.add(panel);

        //flowLayoutFrame.setVisible(true);
        gridLayoutFrame.setVisible(true);
        //borderLayoutFrame.pack();
        //borderLayoutFrame.setVisible(true);

    }
}
