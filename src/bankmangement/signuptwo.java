package bankmangement;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
//import java.lang.*;

public class signuptwo extends JFrame implements ActionListener {
    JLabel type, card, number, pin, pinnumber, services;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno,cardnumber,accounttype,pinumber;
    signuptwo(String formno)
    {
        
       this.formno=formno;
       setLayout(null);
        
        JLabel l1 =new JLabel("PAGE 3: Acoount Details");
        l1.setFont( new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type =new JLabel("Acoount type");
        type.setFont( new Font("Raleway",Font.BOLD,18));
        type.setBounds(100, 140, 120, 20);
        add(type);
        
        r1= new JRadioButton("Saving Account");
        r1.setFont( new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100, 180, 200, 30);
        add(r1);
        
        r2= new JRadioButton("FD Account");
        r2.setFont( new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350, 180, 150, 20);
        add(r2);
        
        r3= new JRadioButton("Current Account");
        r3.setFont( new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100, 220, 150, 20);
        add(r3);
        
        r4= new JRadioButton("Recuring Account");
        r4.setFont( new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350, 220, 150, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
            groupaccount.add(r1);
            groupaccount.add(r2);
            groupaccount.add(r3);
            groupaccount.add(r4);
            
        JLabel card =new JLabel("card number");
        card.setFont( new Font("Raleway",Font.BOLD,18));
        card.setBounds(100, 300, 200, 40);
        add(card);    
               
        JLabel number =new JLabel("xxxx-xxxx-xxxx-4184");
        number.setFont( new Font("Raleway",Font.BOLD,15));
        number.setBounds(330, 300, 300, 40);
        add(number); 
        
        JLabel detail =new JLabel("this is your 16 digit card number");
        detail.setFont( new Font("Raleway",Font.BOLD,12));
        detail.setBounds(100, 330, 300, 30);
        add(detail); 
        
        JLabel pin =new JLabel("pin");
        pin.setFont( new Font("Raleway",Font.BOLD,18));
        pin.setBounds(100, 370, 200, 30);
        add(pin);    
        
        JLabel pinnumber =new JLabel("xxxx");
        pinnumber.setFont( new Font("Raleway",Font.BOLD,15));
        pinnumber.setBounds(330, 370, 300, 30);
        add(pinnumber);   
        
        JLabel services =new JLabel("Services Required");
        services.setFont( new Font("Raleway",Font.BOLD,15));
        services.setBounds(100, 450, 400, 30);
        add(services);    
        
        c1= new JCheckBox("atm card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2= new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4= new JCheckBox("Email& SMS alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5= new JCheckBox("Check book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6= new JCheckBox("E-statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7= new JCheckBox("hereby declares that the above mentioned details are correct");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,200,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font("raleway",Font.BOLD,14));
        cancel.setBounds(620,660,80,30);
        cancel.addActionListener(this);
        add(cancel);
            
        getContentPane().setBackground(Color.WHITE);

        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource( )== submit)
        {
          String accounttype =null;
          if(r1.isSelected()){
              accounttype="Saving Account";
          }else if(r2.isSelected()){
              accounttype="FD";
          }else if(r3.isSelected()){
              accounttype="current account";
          }else if(r4.isSelected()){
              accounttype="recurring account";
          }
          
          
  
          Random random =  new Random();
      
         String cardnumber = "" + Math.abs((random.nextLong()% 90000000L) + 504093600000L);          
         String pinumber = "" + Math.abs((random.nextLong()% 9000L) + 1000L);
         
 

          String facility="";
              if(c1.isSelected()){
                  facility= facility+"ATM Card";
              }  
              else if(c2.isSelected()){
                  facility= facility+"Internet Banking";
              }
              else if(c3.isSelected()){
                  facility= facility+"Mobile Banking";
              }
              else if(c4.isSelected()){
                  facility= facility+"Email&SMS Alerts";
              }
              else if(c5.isSelected()){
                  facility= facility+"check book";
              }                            
              else if(c6.isSelected()){
                  facility= facility+"E-Statement";
              }
                            
              try{
          if (accounttype.equals("")){
              JOptionPane.showMessageDialog(null,"account number is required");
          }  else{
              conn c = new conn();
              String query ="insert into signuptwo values('"+formno+"' ,'"+accounttype+"' , '"+cardnumber+"' , '"+pinumber+"' ,'"+facility+"')";
            String query2 ="insert into login values('"+formno+"' , '"+cardnumber+"' , '"+pinumber+"')";

              c.s.executeUpdate(query);
              c.s.executeUpdate(query2);

            JOptionPane.showMessageDialog(null,"card number"+cardnumber+"\n pin:"+pinumber);
          }
          setVisible(false);
          new deposit(pinumber).setVisible(true);
        }
        catch (Exception e){
            System.out.println(e); 
        }
    }   
        else if(ae.getSource() ==cancel)
        {
        setVisible(false);
        new login().setVisible(true);
        } 
               }
 public static void main(String[]args){
             new signuptwo("");
        }
        
        
        
}
        