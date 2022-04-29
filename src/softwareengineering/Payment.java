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
public class Payment extends JFrame {

    private JButton jbt1 = new JButton("Menu");
    private JButton jbt2 = new JButton("Order");
    private JButton jbt3 = new JButton("Payment");
    private JButton jbt4 = new JButton("Report");
    private JButton jbt5 = new JButton("Staff");
    private JButton jbt7 = new JButton("Help?");
    private JButton jbt8 =new JButton("Back to Order");
    private JButton jbt9 =new JButton("Print Receipt");
    private JButton jbt10 =new JButton("Finish");
    
    private JLabel jibBlank=new JLabel("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    private JLabel[] jlbFoodID = {new JLabel("A308"), new JLabel("B107"), new JLabel("C409"),new JLabel("C408"),new JLabel("A410")};
    private JLabel[] jlbFoodName = {new JLabel("Roti Canai"), new JLabel("Ais Limau"), new JLabel("Sup Kambing"),new JLabel("Sup Ayam"),new JLabel("Roti Telur")};
    private JLabel[] jlbFoodPrice = {new JLabel("1.00"), new JLabel("1.40"), new JLabel("5.50"),new JLabel("5.50"),new JLabel("2.00")};
    private JLabel[] jibQuantity={new JLabel("2"),new JLabel("1"),new JLabel("1"),new JLabel("1"),new JLabel("2")};
    private JLabel[] jibTotal={new JLabel("2.00"),new JLabel("1.40"),new JLabel("5.50"),new JLabel("5.50"),new JLabel("4.00")};
    
    private JLabel jibAMT=new JLabel("Total Amt Excluded Tax (RM)                            18.4");
    private JLabel jibTax=new JLabel("SST(6%)                                              1.10");
    private JLabel jibRounding=new JLabel("Rounding                                              20.50");
    private JLabel jibAdj=new JLabel("Rounding Adjustment                                       0.00");
    private JLabel jibNett=new JLabel("Nett                                                     20.50");
    private JLabel jibTendered=new JLabel("Tendered                                   ");
    private JLabel jibChange=new JLabel("Change                                                 0.50");
    private JLabel label=new JLabel("User :   Hong Ming              ");
    private JTextField jtfTendered=new JTextField(5);
    public Payment() {

        JPanel jpn = new JPanel(new GridLayout(2, 2));

        JPanel jpn1 = new JPanel(new GridLayout(1, 7));
        jpn1.setLayout(new FlowLayout(FlowLayout.LEFT));
        jpn1.add(jbt1);
        jpn1.add(jbt2);
        jpn1.add(jbt3);
        jpn1.add(jbt4);
        jpn1.add(jbt5);
        jpn1.add(jbt7);
        
        JPanel jpn100 = new JPanel(new GridLayout(1, 1));
        jpn100.add(label);
        jpn100.setLayout(new FlowLayout(FlowLayout.RIGHT));

              
        JPanel jpn2 = new JPanel(new GridLayout(1, 2));
        jpn2.setLayout(new FlowLayout(FlowLayout.LEFT));
        jpn2.add(new JLabel("Table No : "));
        jpn2.add(new JLabel(""));
        jpn2.add(new JLabel("5"));

        add(jpn2, BorderLayout.SOUTH);
        
        jpn.add(jpn1);
        jpn.add(jpn100);
        jpn.add(jpn2);
        add(jpn, BorderLayout.NORTH);
        
        
        JPanel jpn10 = new JPanel(new GridLayout(2, 1));
        
        JPanel jpn3 = new JPanel();
        jpn3.setLayout(new GridLayout(6, 5));

        jpn3.add(new JLabel("FoodID"));
        jpn3.add(new JLabel("Food Name"));
        jpn3.add(new JLabel("Price (RM)"));
        jpn3.add(new JLabel("Quantity"));
        jpn3.add(new JLabel("Total (RM)"));
        
         for (int i = 0; i < 5; i++) {

            jlbFoodID[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbFoodID[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbFoodID[i]);

            jlbFoodName[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbFoodName[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbFoodName[i]);

            jlbFoodPrice[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbFoodPrice[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbFoodPrice[i]);

            jibQuantity[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jibQuantity[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jibQuantity[i]);

            jibTotal[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jibTotal[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jibTotal[i]);
            
        }
       
         
           
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
         
         jbt8.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             setVisible(false);
             new Order();
         }
         }); 
         
         
         
         
         
         
         
         
         
         
         
        JPanel jpn4 = new JPanel(new GridLayout(8,1));
        jibBlank.setBorder(BorderFactory.createLineBorder(Color.black));
        jibBlank.setHorizontalAlignment(SwingConstants.LEFT);
        jpn4.add(jibBlank);
        JPanel jpn11=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn11.add(jibAMT);
        JPanel jpn12=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn12.add(jibTax);
        JPanel jpn13=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn13.add(jibRounding);
        JPanel jpn14=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn14.add(jibAdj);
        JPanel jpn15=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn15.add(jibNett);
        JPanel jpn16=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn16.add(jibTendered);
        jpn16.add(jtfTendered);
        JPanel jpn17=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn17.add(jibChange);
        jpn4.add(jpn11);
        jpn4.add(jpn12);
        jpn4.add(jpn13);
        jpn4.add(jpn14);
        jpn4.add(jpn15);
        jpn4.add(jpn16);
        jpn4.add(jpn17);
        
        
                
//        add(jpn3, BorderLayout.CENTER); 
//        add(jpn4, BorderLayout.SOUTH);
        jpn10.add(jpn3);
        jpn10.add(jpn4);
        add(jpn10, BorderLayout.CENTER);

        
        JPanel jpn5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn5.add(jbt8);
        jpn5.add(jbt9);
        jpn5.add(jbt10);
        add(jpn5, BorderLayout.SOUTH);
              
        setTitle("Payment");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Payment();
    }
}
