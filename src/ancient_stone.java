//Author:Thomas
//Name:ancient stone
//Date:feb.10
//Purpose:complete the graph

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ancient_stone extends JPanel implements ActionListener {
//    JTextField number = new JTextField(5);
    JButton stone1 = new JButton(createImageIcon("stone1.jpg")); 
    JButton stone2 = new JButton(createImageIcon("stone2.jpg"));
    JButton stone3 = new JButton(createImageIcon("stone3.jpg"));
    JButton stone4 = new JButton(createImageIcon("stone4.jpg"));
//    JButton stoneq = new JButton(createImageIcon("stone_quest.jpg");
    public ancient_stone() {
        setBackground(Color.BLUE);
        JLabel pic = new JLabel(createImageIcon("stone_quest.jpg"));
        JLabel txt = new JLabel("choose the correct one fit the graph");
	txt.setFont(new Font("Arial", Font.BOLD, 30));  
        txt.setForeground(Color.WHITE);
       
       	stone1.setBackground(Color.WHITE);
        stone1.setForeground(Color.BLUE);
	ImageIcon icon1 = new ImageIcon("stone1.jpg");
	stone1.setIcon(icon1);
        stone1.setOpaque(true);
        stone1.addActionListener(this);
       	stone1.setActionCommand("Guess1");
       
        stone2.setBackground(Color.WHITE);
        stone2.setForeground(Color.BLUE);
	ImageIcon icon2 = new ImageIcon("stone2.jpg");
	stone2.setIcon(icon2);
        stone2.setOpaque(true);
        stone2.addActionListener(this);
        stone2.setActionCommand("Guess2");
       
       	stone3.setBackground(Color.WHITE);
       	stone3.setForeground(Color.BLUE);
	ImageIcon icon3 = new ImageIcon("stone3.jpg");
	stone3.setIcon(icon3);
       	stone3.setOpaque(true);
        stone3.addActionListener(this);
        stone3.setActionCommand("Guess3");
       
       	stone4.setBackground(Color.WHITE);
        stone4.setForeground(Color.BLUE);
	ImageIcon icon4 = new ImageIcon("stone4.jpg");
	stone4.setIcon(icon4);
        stone4.setOpaque(true);
        stone4.addActionListener(this);
        stone4.setActionCommand("Guess4");
         
	add(pic);
        add(txt);
 //       add(number);
        add(stone1);
	add(stone2);
	add(stone3);
	add(stone4);
	//end up at here
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand ().equals ("Guess4")){
       		JOptionPane.showMessageDialog(null,"You won, this is the correct picture","Lose",JOptionPane.INFORMATION_MESSAGE); 
       	}
	else 
		JOptionPane.showMessageDialog(null,"Nope, try again","Lose",JOptionPane.INFORMATION_MESSAGE); 
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ancient_stone.class.getResource(path);
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
        frame.setSize(640, 900);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ancient_stone panel = new ancient_stone();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
