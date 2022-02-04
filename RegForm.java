/*********************************************************************
 * File        : RegForm.java
 * Author      : lakshmi suresh
 * Description : program to create signUp form
 * date        : 04/02/2022
 * 
**********************************************************************/
import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegForm extends Frame implements ActionListener {
    TextField textField1;
    TextField textField2;
    TextField textField3;
    TextField textField4;
    Label label;
   

    RegForm(){
        //Setting frame
        setTitle("Registration Form");
        setSize(600,500);
        setVisible(true);

        //setting layout
        setLayout(new FlowLayout());
        
        
        //Name
        Label userLabel = new Label();
        userLabel.setText("Name: ");
        userLabel.setBounds(100,100,140,30);
        textField1 = new TextField(15); //textField for name
        add(userLabel);
        add(textField1);
       
        //Address
        Label addLabel = new Label();
        addLabel.setText("Address: ");
        addLabel.setBounds(100, 150, 140, 50);
        textField2 = new TextField(15);
        add(addLabel);
        add(textField2);

        //mailID
        Label mailLabel = new Label();
        mailLabel.setText("e-mail ID:  ");
        mailLabel.setBounds(150, 200, 140, 50);
        textField3 = new TextField(15);
        add(mailLabel);
        add(textField3);
        
        //department
        Label depLabel = new Label();
        depLabel.setText("Department: ");
        depLabel.setBounds(150, 250, 100, 50);
        textField4 = new TextField(15);
        add(depLabel);
        add(textField4);

        //creating submit button
        Button button = new Button("SUBMIT");
        button.setBounds(200,300,100,20);
        button.setBackground(Color.RED);
        add(button);
        
        button.addActionListener(this);//add action listener to button
    }
    public void actionPerformed(ActionEvent e) {
    	
        System.out.println("Name: "+textField1.getText());
        System.out.println("Address: "+textField2.getText());
        System.out.println("Mail Id: "+textField3.getText());
        System.out.println("Department: "+textField4.getText());

}


 public static void main(String[] args) {
        RegForm RegForm = new RegForm();

    }

}

