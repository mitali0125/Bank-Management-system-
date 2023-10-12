package bankmangement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
public class fastcash extends JFrame implements ActionListener{
JButton deposit,withrawl,fastcash,ministatement,pinchange,balancenquiry,exit;
    String pinumber;
     fastcash(String pinumber){
         this.pinumber=pinumber;
         
         setLayout(null);
         
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);  
         JLabel image =new JLabel(i3);
         image.setBounds(0,0,900,900);
         add(image);
         
         JLabel text = new JLabel("SELECT withrawl amount");
         text.setBounds(200,300,700,35);
         text.setForeground(Color.WHITE);
         text.setFont(new Font("System" , Font.BOLD,16));
         image.add(text);
         
       deposit = new JButton("rs 100");
       deposit.setBounds(170, 415, 150, 30);
       deposit.addActionListener(this);
       add(deposit);
       
       withrawl = new JButton("rs 500");
       withrawl.setBounds(355, 415, 150, 30);
       withrawl.addActionListener(this);
       add(withrawl);
       
       fastcash= new JButton("rs 1000");
       fastcash.setBounds(170, 450, 150, 30);
       fastcash.addActionListener(this);
       add(fastcash);
       
       ministatement= new JButton("rs 2000");
       ministatement.setBounds(355, 450, 150, 30);
       ministatement.addActionListener(this);
       add(ministatement);
       
       pinchange= new JButton("rs 5000");
       pinchange.setBounds(170, 485, 150, 30);
       pinchange.addActionListener(this);
       add(pinchange);
       
       balancenquiry= new JButton("10000");
       balancenquiry.setBounds(355, 485, 150, 30);
       balancenquiry.addActionListener(this);
       add(balancenquiry);
       
       exit= new JButton("back");                                      
       exit.setBounds(355, 520, 150, 30);
       exit.addActionListener(this);
       image.add(exit);
         
         setSize(900,900);
         setLocation(300,0);
         setUndecorated(true);//for removing above line
         setVisible(true);
     }
     
     public void actionPerformed(ActionEvent ae){
         if  (ae.getSource()== exit){
             setVisible(false);
             new transaction(pinumber).setVisible(true);

         }else {
            String amount =((JButton)ae.getSource()).getText().substring(3);
            conn c= new conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinumber+"'");
                int balance =0;
                while(rs.next()){
                    if(rs.getString("type").equals("deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinumber+"','"+date+"','withraw','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"rs"+amount+"Debited Successfully");

                setVisible(false);
                new transaction(pinumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
         }
             
         
     }
     
    public static void main(String[] args) {
        new fastcash("");{
        
        
        
    }
        
        
    }
    
}
