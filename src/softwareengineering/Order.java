/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author hp
 */
public class Order extends JFrame {

    private JButton jbt1 = new JButton("Menu");
    private JButton jbt2 = new JButton("Order");
    private JButton jbt3 = new JButton("Payment");
    private JButton jbt4 = new JButton("Report");
    private JButton jbt5 = new JButton("Staff");
    private JButton jbt6 = new JButton("Help?");
    private JLabel[] jlbOrderID = {new JLabel("388"), new JLabel("389"), new JLabel("390"), new JLabel("391"), new JLabel("392"), new JLabel("393"), new JLabel("394"), new JLabel("395"), new JLabel("396")};
    private JButton jbtA = new JButton("Add");
    private JButton[] jbtD = {new JButton("Delete"), new JButton("Delete"), new JButton("Delete"), new JButton("Delete"), new JButton("Delete"), new JButton("Delete"), new JButton("Delete"), new JButton("Delete"), new JButton("Delete")};
    private JLabel jlbRemark = new JLabel("Remark");
    private JLabel jlbID = new JLabel("ID");
    private JLabel jlbTotal  = new JLabel("Quantity");
    private JLabel jlbUser  = new JLabel("User: Hong Ming     ");
    private JTextField[] jtfRemark = {new JTextField(25), new JTextField(25), new JTextField(25), new JTextField(25), new JTextField(25), new JTextField(25), new JTextField(25), new JTextField(25), new JTextField(25)};
    private JTextField[] jtfQuantity = {new JTextField(2), new JTextField(2), new JTextField(2), new JTextField(2), new JTextField(2), new JTextField(2), new JTextField(2), new JTextField(2), new JTextField(2)};
    private JButton jbtBack = new JButton("Back");
    private JButton jbtProceed = new JButton("Proceed");
    private JButton jbtC = new JButton("Clear");

    public Order() {
        JPanel jpn = new JPanel(new GridLayout(1, 2));
        JPanel jpn1 = new JPanel(new GridLayout(1, 7));
        JPanel jpn2 = new JPanel(new GridLayout(10, 4));
        JPanel jpn4 = new JPanel(new GridLayout(2, 2));
        JPanel jpn5 = new JPanel(new GridLayout(1, 3));
        JPanel jpn10 = new JPanel(new GridLayout(1, 1));
        jpn1.setLayout(new FlowLayout(FlowLayout.LEFT));
        jpn5.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jpn1.add(jbt1);
        jpn1.add(jbt2);
        jpn1.add(jbt3);
        jpn1.add(jbt4);
        jpn1.add(jbt5);
        jpn1.add(jbt6);
        jpn10.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jpn10.add(jlbUser);
        
        
        
         
             
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
         jbtProceed.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
              new Payment();
         }
         }); 
        
        
        
        
        
        
        jpn2.add(jlbID);
        jpn2.add(jlbTotal);
        jpn2.add(jlbRemark);
        jpn2.add(new JLabel(""));
        for (int i = 0; i < 9; i++) {
            jpn2.add(jlbOrderID[i]);
            jpn2.add(jtfQuantity[i]);
            jpn2.add(jtfRemark[i]);
            jpn2.add(jbtD[i]);
        }
        jpn5.add(jbtC);
        jpn5.add(jbtBack);
        jpn5.add(jbtProceed);

        jpn.add(jpn1);
        jpn.add(jpn10);
        add(jpn, BorderLayout.NORTH);
        add(jpn2);
        jpn4.add(jpn5);
        add(jpn4, BorderLayout.SOUTH);
        //jpn2.add(jpn3);

        setTitle("Order");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
        public static void main(String[] args) {
        new Order();
    }
}
