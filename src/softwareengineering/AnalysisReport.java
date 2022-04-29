package softwareengineering;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class AnalysisReport extends JFrame {

    ImageIcon icon = new ImageIcon(getClass().getResource("analysisImage7.png"));
    private JLabel jbtReport = new JLabel(icon);

    private JButton jbt1 = new JButton("Menu");
    private JButton jbt2 = new JButton("Order");
    private JButton jbt3 = new JButton("Payment");
    private JButton jbt4 = new JButton("Report");
    private JButton jbt5 = new JButton("Staff");
    private JButton jbt7 = new JButton("Help?");
    private JButton jbtTable = new JButton("In Table");

    private JButton jbt8 = new JButton("Today");
    private JButton jbt9 = new JButton("Yesterday");
    private JButton jbt10 = new JButton("This Week");
    private JButton jbt11 = new JButton("Last Week");
    private JButton jbt12 = new JButton("This Month");
    private JButton jbt13 = new JButton("Last Month");

    public AnalysisReport() {

        JPanel jpn = new JPanel(new GridLayout(2, 3));

        JPanel jpn1 = new JPanel(new GridLayout(1, 7));
        jbt4.setBackground(Color.lightGray);
        jpn1.setLayout(new FlowLayout(FlowLayout.LEFT));
        jpn1.add(jbt1);
        jpn1.add(jbt2);
        jpn1.add(jbt3);
        jpn1.add(jbt4);
        jpn1.add(jbt5);
        jpn1.add(jbt7);

        add(jpn, BorderLayout.NORTH);

        JPanel jpnSpecial = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpnSpecial.add(new JLabel("User :   Hong Ming            "));

        JPanel jpnSpecial2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpnSpecial2.add(jbtTable);

        JPanel jpn2 = new JPanel(new GridLayout(1, 6));
        jpn2.setLayout(new FlowLayout(FlowLayout.LEFT));
        jbt8.setBackground(Color.lightGray);
        jpn2.add(jbt8);
        jpn2.add(jbt9);
        jpn2.add(jbt10);
        jpn2.add(jbt11);
        jpn2.add(jbt12);
        jpn2.add(jbt13);

        add(jpn2, BorderLayout.SOUTH);

        jpn.add(jpn1);
        jpn.add(jpnSpecial);
        jpn.add(jpn2);
        jpn.add(jpnSpecial2);

        add(jpn, BorderLayout.NORTH);

        
        
        
             
         jbt1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
               foodMenu  f =new foodMenu();
            f.food();
         }
         });
         
         jbt2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
             new Order();
         }
         });
           
         jbt3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
              new Payment();
         }
         }); 
         jbt4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
                 new AnalysisReport();
         }
         });
         
         jbt5.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
         
              
         }
         });
         
         
        
        
        
        
        
        
        
        
        
        JPanel jpn3 = new JPanel();

        jpn3.add(jbtReport);
        add(jpn3, BorderLayout.CENTER);

        setTitle("TBR Food Ordering System");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnalysisReport();
    }
}
