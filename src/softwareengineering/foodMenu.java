/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengineering;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import static java.awt.PageAttributes.MediaType.E;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javafx.scene.paint.Color;
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
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
public class foodMenu extends JFrame {
       JPanel jpn = new JPanel(new GridLayout(3, 1));
        JPanel jpn1 = new JPanel(new GridLayout(1, 6));
        JPanel jpn2 = new JPanel(new GridLayout(1, 1));
        JPanel jpn3 = new JPanel(new GridLayout(1,5));
        JPanel jpn4 = new JPanel(new GridLayout(1,1));
        JPanel jpn5 = new JPanel(new GridLayout(1, 3));
        JPanel jpn6 = new JPanel(new GridLayout(1, 3));
        JPanel jpn7 = new JPanel(new GridLayout(1, 2));
        JPanel jpn8 = new JPanel(new GridLayout(1, 1));
        JPanel jpn9 = new JPanel(new GridLayout(4, 1));
         JPanel jpn10 = new JPanel(new GridLayout(1, 3));
            JPanel jpn11 = new JPanel(new GridLayout(1, 3));
        JTextField[] jtf = {new JTextField(10), new JTextField(10), new JTextField(10)};
        JButton jbt1[] = {new JButton("Menu "), new JButton("Order "),new JButton("Payment "),new JButton("Report "),new JButton("Staff"),new JButton("Help?")};
        JButton jbt2[] = {new JButton("All "), new JButton("Roti Canai"),new JButton("Fried Rice"),new JButton("Mee"),new JButton("Beverage")};
        JButton jbt3[] = {new JButton("Add Food Menu "), new JButton("Delete Food Menu"),new JButton("Modify  Food Menu")};
        JLabel[] jlbmenu = {new JLabel("Food ID           "), new JLabel("Food Name           "), new JLabel("Price        ")};
         JLabel[] jlbmenu1 = {new JLabel("Food ID                    "), new JLabel("Food Name                  "), new JLabel("Price         ")};
        JLabel label=new JLabel("User :   Hong Ming              ");
    public   void food() {
    
     String s1[][] ={{"R1000","Roti Kosong","RM 1.00"},{"R1001","Roti Susu","RM 2.00"},{"R1002","Roti Pisang","RM 2.00"},{"R1003","Roti Pisang","RM 2.00"},{"N1000","Nasi Goreng Biasa ","RM 5.00"},{"N1001","Nasi Goreng Mamak ","RM 5.00"},{"N1002","Nasi Goreng Ayam","RM 7.00"},{"N1003","Nasi Goreng pattaya","RM 5.00"}
     ,{"M1000","Mee Goreng Biasa","RM 5.00"},{"M1001","Mee Goreng double","RM 5.00"},{"M1002","Mee Goreng sup","RM 7.00"},{"M1003","Mee Goreng pattaya","RM 5.00"},{"B1000","Air ","RM 1.00"},{"B1001","Teh O","RM 2.00"},{"B1002","Susu","RM 2.00"},{"B1003","Milo","RM 2.00"}};
       String a[]={"Id ","Name"    ,"Price"};
  
 
      
          
        jpn1.setLayout(new FlowLayout(FlowLayout.LEFT));
        jpn5.setLayout(new FlowLayout(FlowLayout.CENTER));
         jpn3.setLayout(new FlowLayout(FlowLayout.CENTER));
       
     
          jpn10.setLayout(new FlowLayout(FlowLayout.CENTER));
        jpn8.setLayout(new FlowLayout(FlowLayout.RIGHT));
         jpn11.setLayout(new FlowLayout(FlowLayout.CENTER));
         JTable t =new JTable(s1 ,a); 
         t.setRowHeight(15);
         t.setSize(500, 400);

          
       for(int i=0;i<jbt1.length;i++){
        jpn1.add(jbt1[i]);
       }
       
       
       for(int i=0;i<jbt2.length;i++){
        jpn3.add(jbt2[i]);
       
       }         
         jbt1[0].setBackground(java.awt.Color.lightGray);
         jbt1[0].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
               foodMenu  f =new foodMenu();
            f.food();
         }
         });
         
         jbt1[1].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
             new Order();
         }
         });
           
         jbt1[2].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
              new Payment();
         }
         }); 
         jbt1[3].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
                 new AnalysisReport();
         }
         });
         
         jbt1[4].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
             new Register().setVisible(true);
              
         }
         });
         
         
         
        
        
        jbt2[0].setBackground(java.awt.Color.lightGray);
         
        
       
       
        for(int i=0;i<jbt3.length;i++){
        jpn5.add(jbt3[i]);
       }      
          for(int i=0;i<jlbmenu.length;i++){
        jpn6.add(jlbmenu[i] );
       }       for(int i=0;i<jlbmenu.length;i++){
        jpn11.add(jlbmenu1[i] );
       }   
             for(int i=0;i< jtf.length;i++){
        jpn10.add( jtf[i] );
       }   
        
        
           
          jpn4.add(t);           
          jpn2.add(jpn4);
   
          
          
          jpn9.add(jpn11);    
         jpn9.add(jpn10 );  
         jpn9.add(jpn5 );  
         
         jpn8.add(label);
          jpn7.add(jpn1);
          jpn7.add(jpn8);
         jpn.add(jpn7);
         jpn.add(jpn3 );               
         jpn.add(jpn6 );               
           
         
        add(jpn, BorderLayout.NORTH);     
        add(jpn2,BorderLayout.CENTER);     
        add(jpn9,BorderLayout.SOUTH);  
        
        
        setTitle("TBR Food Ordering System");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        

}
   
    public static void main(String[] args) {
        foodMenu  f =new foodMenu();
        f.food();
        
    }
}
