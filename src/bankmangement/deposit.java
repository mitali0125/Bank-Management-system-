
package bankmangement;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class deposit extends JFrame implements ActionListener {

JButton deposit, back;
JTextField amount;
String pinumber;
    deposit(String pinumber){
        this.pinumber=pinumber;
        
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);  
         JLabel image =new JLabel(i3);
         image.setBounds(0,0,900,900);
         add(image);
         
        JLabel text = new JLabel("enter the amount you want to enter");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);
        
        amount=new JTextField();
       amount.setBounds(170,350,320,25);                   
       amount.setFont(new Font("Raleway",Font.BOLD,22));
       image.add(amount);
       
       deposit = new JButton("Deposit");
       deposit.setBounds(355, 465, 150, 30);
       deposit.addActionListener(this);
       image.add(deposit);
       
       back = new JButton("BACK");
       back.setBounds(355, 500, 150, 30);
       back.addActionListener(this);
       image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==deposit){
             
             String number = amount.getText();
             Date date = new Date();
             
             if(number.equals("")){
                 JOptionPane.showMessageDialog(null,"please  enter the amount");
             } else{
                 try{
                         conn c= new conn();
                         String query = "insert into bank values('"+pinumber+"','"+date+"','deposit','"+number+"')";
                         c.s.executeUpdate(query);
                         JOptionPane.showMessageDialog(null, "RS"+number+"Dposited Succesfully");
                         
                         setVisible (false);
                         new transaction(pinumber).setVisible(true);
                         
                 }catch(Exception e){
                     e.printStackTrace();
                 }
             }
             
         }else if(ae.getSource()==back){
             setVisible(false);
             new transaction(pinumber).setVisible(true);
         }
     }
    
    public static void main(String[] args) {
         new deposit("");
    }
}
