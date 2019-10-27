package sprint3_swing_learning.layout;

import javax.swing.*;
import java.awt.*;

public class SIgrunTest {


    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel p = new JPanel();
        JLabel l1 = new JLabel("label1");
        JLabel l2 = new JLabel("label2");
        p.setLayout(new GridLayout(2,2));
        jf.add(p);
        p.add(l1);
        p.add(l2);
        jf.pack();
        jf.setVisible(true);

    }

}
