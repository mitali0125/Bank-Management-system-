package bankmangement;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener
{ 
    
    long random;
    JTextField nameTextField, FnameTextField,EmailTextField,AddressTextField,CityTextField,stateTextField,pincodeTextField;
    JButton next;
    JDateChooser dcdob;
    JRadioButton male,female,single,married;
    signup()
        {      setLayout(null);
            
            Random ran= new Random();
            long random =(Math.abs(ran.nextLong()%9000L)+1000L);
            
            JLabel formo =new JLabel("Application Form NO."+random);
            formo.setFont( new Font("Raleway",Font.BOLD,38));
            formo.setBounds(140, 20, 600, 40);
            add(formo);
            
            JLabel personelDetails =new JLabel("PAGE 1: Personel Details");
            personelDetails.setFont( new Font("Raleway",Font.BOLD,22));
            personelDetails.setBounds(290, 80, 400, 40);
            add(personelDetails);
            
            JLabel name =new JLabel("Name:");
            name.setFont( new Font("Raleway",Font.BOLD,22));
            name.setBounds(100, 140, 100, 30);
            add(name);
            
            nameTextField = new JTextField();
            nameTextField.setFont(new Font("raleway",Font.BOLD,14));
            nameTextField.setBounds(300,140 ,400,30 );
            add(nameTextField);
            
            JLabel Fname =new JLabel("Father's name:");
            Fname.setFont( new Font("Raleway",Font.BOLD,22));
            Fname.setBounds(100, 190, 200, 30);
            add(Fname);
            
            FnameTextField = new JTextField();
            FnameTextField.setFont(new Font("raleway",Font.BOLD,14));
            FnameTextField.setBounds(300,190 ,400,30 );
            add(FnameTextField);
            
            JLabel dob =new JLabel("DOB:");
            dob.setFont( new Font("raleway",Font.BOLD,22));
            dob.setBounds(100, 240, 200, 30);
            add(dob);
            
             dcdob=new JDateChooser();
             dcdob.setBounds(300,240,400,30);                   
             dcdob.setFont(new Font("RALEWAY",Font.BOLD,14));
             add(dcdob);

         
                       
            JLabel gender =new JLabel("Gender:");
            gender.setFont( new Font("Raleway",Font.BOLD,22));
            gender.setBounds(100, 290, 200, 30);
            add(gender);
            
            male = new JRadioButton("Male");
            male.setBounds(300, 290,60,30);
            male.setBackground(Color.WHITE);
            add(male);

            female = new JRadioButton("Female");
            female.setBounds(450,290,120,30);
            female.setBackground(Color.WHITE);
            add(female);
            
            ButtonGroup gendergroup = new ButtonGroup();
            gendergroup.add(male);
            gendergroup.add(female);
            
            JLabel Email =new JLabel("Email:");
            Email.setFont( new Font("Raleway",Font.BOLD,22));
            Email.setBounds(100, 340, 200, 30);
            add(Email);
            
            EmailTextField = new JTextField();
            EmailTextField.setFont(new Font("raleway",Font.BOLD,14));
            EmailTextField.setBounds(300,340 ,400,30 );
            add(EmailTextField);
            
            
            JLabel marital  =new JLabel("Maritial status:");
            marital .setFont( new Font("Raleway",Font.BOLD,22));
            marital.setBounds(100, 390, 200, 30);
            add(marital);
            
            single = new JRadioButton("Single");
            single.setBounds(300, 390,100,30);
            single.setBackground(Color.WHITE);
            add(single);

            married = new JRadioButton("Married");
            married.setBounds(450,390,100,30);
            married.setBackground(Color.WHITE);
            add(married);
            
            ButtonGroup maritalgroup = new ButtonGroup();
            maritalgroup.add(single);
            maritalgroup.add(married);

            JLabel Address  =new JLabel("Address:");
            Address .setFont( new Font("Raleway",Font.BOLD,22));
            Address.setBounds(100, 440, 200, 30);
            add(Address);
            
            AddressTextField = new JTextField();
            AddressTextField.setFont(new Font("raleway",Font.BOLD,14));
            AddressTextField.setBounds(300,440 ,400,30 );
            add(AddressTextField);
            
            JLabel city  =new JLabel("City:");
            city .setFont( new Font("Raleway",Font.BOLD,22));
            city.setBounds(100, 490, 200, 30);
            add(city);
            
            CityTextField = new JTextField();
            CityTextField.setFont(new Font("raleway",Font.BOLD,14));
            CityTextField.setBounds(300,490 ,400,30 );
            add(CityTextField);
            
            JLabel state  =new JLabel("State:");
            state .setFont( new Font("Raleway",Font.BOLD,22));
            state.setBounds(100, 540, 200, 30);
            add(state);
            
            stateTextField = new JTextField();
            stateTextField.setFont(new Font("raleway",Font.BOLD,14));
            stateTextField.setBounds(300,540 ,400,30 );
            add(stateTextField);
            
            JLabel pincode  =new JLabel("Pincode:");
            pincode .setFont( new Font("Raleway",Font.BOLD,22));
            pincode.setBounds(100, 590, 200, 30);
            add(pincode);
            
            pincodeTextField = new JTextField();
            pincodeTextField.setFont(new Font("raleway",Font.BOLD,14));
            pincodeTextField.setBounds(300,590 ,400,30 );
            add(pincodeTextField);
            
            next = new JButton("NEXT");
            next.setBackground(Color.WHITE);
            next.setForeground(Color.BLACK);
            next.setFont(new Font("raleway",Font.BOLD,14));
            next.setBounds(620,660,80,30);
            next.addActionListener(this);
            add(next);
            
            
             
            getContentPane().setBackground(Color.white);
                setSize(850,800);
                setLocation(350,10);
                setVisible(true);
        
    
        }
public void actionPerformed(ActionEvent ae )
{
 String formo = ""+ random;
 String name  = nameTextField.getText();
 String Fname = FnameTextField.getText();
 String dob =((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
 String gender = null;
 if(male.isSelected())
 {
     gender ="male ";
 }else
 {
     gender="female";
 }
 String Email = EmailTextField.getText();
 String marital= null;
 if(single.isSelected())
 {
     marital="single";
 }
 else{
     marital="married";
     }
 String Address = AddressTextField.getText();
 String City = CityTextField.getText();
 String State = stateTextField.getText(); 
 String pincode = pincodeTextField.getText();
 
        try{
          if (name.equals("")){
              JOptionPane.showMessageDialog(null,"name is required");
          }  else{
              conn c = new conn();
              String query ="insert into signup values('"+formo+"', '"+name+"' , '"+Fname+"' , '"+dob+"' , '"+gender+"' , '"+Email+"' , '"+marital+"','"+Address+"','"+City+"' , '"+pincode+"' , '"+State+"')";
              c.s.executeUpdate(query);
              
              setVisible(false);
              new signup0ne(formo).setVisible(true);
          }
        }
        catch (Exception e){
            System.out.println(e); 
        }
 }


        public static void main(String[] args) 
        {
         new signup();
    }
}

 
    

