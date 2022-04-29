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
public class TransactionHistory extends JFrame {

    private JButton jbt1 = new JButton("Menu");
    private JButton jbt2 = new JButton("Order");
    private JButton jbt3 = new JButton("Payment");
    private JButton jbt4 = new JButton("Report");
    private JButton jbt5 = new JButton("Staff");
    private JButton jbt7 = new JButton("Help?");
    private JButton jbtDiagram = new JButton("In Diagram");
    private JButton jbtReport = new JButton("Report");

    private JButton jbt8 = new JButton("Today");
    private JButton jbt9 = new JButton("Yesterday");
    private JButton jbt10 = new JButton("This Week");
    private JButton jbt11 = new JButton("Last Week");
    private JButton jbt12 = new JButton("This Month");
    private JButton jbt13 = new JButton("Last Month");

    private JLabel[] jlbNo = {new JLabel("1"), new JLabel("2"), new JLabel("3"), new JLabel("4"), new JLabel("5"), new JLabel("6"), new JLabel("7"), new JLabel("8"), new JLabel("9")};
    private JLabel[] jlbOrderID = {new JLabel("388"), new JLabel("389"), new JLabel("390"), new JLabel("391"), new JLabel("392"), new JLabel("393"), new JLabel("394"), new JLabel("395"), new JLabel("396")};
    private JLabel[] jlbAmount = {new JLabel("20.00"), new JLabel("20.00"), new JLabel("80.00"), new JLabel("25.00"), new JLabel("40.00"), new JLabel("30.00"), new JLabel("50.00"), new JLabel("36.50"), new JLabel("70.00")};
    private JLabel[] jlbTotalTaxes = {new JLabel("1.20"), new JLabel("1.20"), new JLabel("4.80"), new JLabel("1.50"), new JLabel("2.40"), new JLabel("1.80"), new JLabel("3.00"), new JLabel("2.19"), new JLabel("4.20")};
    private JLabel[] jlbTotal = {new JLabel("21.20"), new JLabel("21.20"), new JLabel("84.80"), new JLabel("26.50"), new JLabel("42.40"), new JLabel("31.80"), new JLabel("53.00"), new JLabel("38.69"), new JLabel("74.20")};
    private JLabel[] jlbDateCreated = {new JLabel("21/7/2019     10:20"), new JLabel("21/7/2019     11:20"), new JLabel("21/7/2019     11:21"), new JLabel("21/7/2019     11:25"), new JLabel("21/7/2019     12:20"), new JLabel("21/7/2019     14:20"), new JLabel("21/7/2019     14:30"), new JLabel("21/7/2019     14:35"), new JLabel("21/7/2019     15:20")};
    JLabel label=new JLabel("User :   Hong Ming              ");
    
    public TransactionHistory() {

        JPanel jpn = new JPanel(new GridLayout(2, 2));

        JPanel jpn1 = new JPanel(new GridLayout(1, 7));
        //jbtReport.setBackground(Color.gray);
        jpn1.setLayout(new FlowLayout(FlowLayout.LEFT));
        jpn1.add(jbt1);
        jpn1.add(jbt2);
        jpn1.add(jbt3);
        jpn1.add(jbt4);
        jpn1.add(jbt5);
        jpn1.add(jbt7);
        add(jpn, BorderLayout.NORTH);
        
        JPanel jpnSpecial = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpnSpecial.add(jbtDiagram);
        

        JPanel jpn2 = new JPanel(new GridLayout(1, 6));
        jpn2.setLayout(new FlowLayout(FlowLayout.LEFT));
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
        

        add(jpn, BorderLayout.NORTH);

        JPanel jpn3 = new JPanel();
        jpn3.setLayout(new GridLayout(10, 6));

        jpn3.add(new JLabel("No"));
        jpn3.add(new JLabel("Order ID"));
        jpn3.add(new JLabel("Amount(RM)"));
        jpn3.add(new JLabel("Sales Tax(6%)"));
        jpn3.add(new JLabel("Total(RM)"));
        jpn3.add(new JLabel("Created"));

        for (int i = 0; i < 9; i++) {

            jlbNo[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbNo[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbNo[i]);

            jlbOrderID[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbOrderID[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbOrderID[i]);

            jlbAmount[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbAmount[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbAmount[i]);

            jlbTotalTaxes[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbTotalTaxes[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbTotalTaxes[i]);

            jlbTotal[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbTotal[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbTotal[i]);

            jlbDateCreated[i].setBorder(BorderFactory.createLineBorder(Color.black));
            jlbDateCreated[i].setHorizontalAlignment(SwingConstants.LEFT);
            jpn3.add(jlbDateCreated[i]);
        }

        add(jpn3, BorderLayout.CENTER);

        JPanel jpn4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jpn4.add(new JLabel("Grand Total: "));
        jpn4.add(new JLabel(""));
        jpn4.add(new JLabel("RM 393.79"));

        add(jpn4, BorderLayout.SOUTH);

        setTitle("Report");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TransactionHistory();
    }
    
    
    
}



