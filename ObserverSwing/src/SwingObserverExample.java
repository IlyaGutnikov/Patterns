import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MartinSeptim on 14.07.2016.
 */
public class SwingObserverExample {

    JFrame jFrame;

    public void go() {

        jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
    }

    class AngelListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.out.println("Dont do it!");
        }

    }

    class DevilListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.out.println("Do it!");
        }

    }
}
