//Author:Thomas
//Name:SnowmanJumble
//Date:nov29
//Purpose:complete the graph

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnowmanJumble extends JPanel implements ActionListener {
    JTextField number = new JTextField(5);
    JButton stone1 = new JButton(createImageIcon("stone1.jpg");
    public SnowmanJumble() {
        setBackground(Color.BLUE);
        JLabel pic = new JLabel(createImageIcon("stone_quest.jpg"));
        JLabel txt = new JLabel("choose the correct one fit the graph");
        txt.setForeground(Color.WHITE);
        stone1.setBackground(Color.WHITE);
        stone1.setForeground(Color.BLUE);
        stone1.setOpaque(true);
        stone1.addActionListener(this);
        stone1.setActionCommand("Guess");
        add(pic);
        add(txt);
        add(number);
        add(stone1);
	//end up at here
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand ().equals ("Guess")){
            int num = Integer.parseInt(number.getText());
            if (num==16)
                JOptionPane.showMessageDialog(null,"Correct!");
            else if (num>12&&num<20)
                JOptionPane.showMessageDialog(null,"Very close!");
            else
                JOptionPane.showMessageDialog(null,"Wrong!");
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SnowmanJumble.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        }
        else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("EyeballBlizzard");
        frame.setSize(360, 470);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SnowmanJumble panel = new SnowmanJumble();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
