/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dav.edu.thirdsem.tenthlab;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;



/**
 *
 * @author dell
 */
public class Student {
    public Student(){
        JFrame jf = new JFrame("Student Entry Form");
        jf.setBounds(200, 200, 500 , 500);
        jf.setLayout(null);
        JLabel name = new JLabel("Name: ");
        JLabel email = new JLabel("Email: ");
        JLabel contact = new JLabel("Contact: ");
        JLabel gender = new JLabel("Gender: ");
     
        
        name.setBounds(20, 40, 50, 20);
        email.setBounds(20, 60, 50, 20);
        contact.setBounds(20, 80, 50, 20);
        gender.setBounds(20, 100, 50, 20);
        JButton jb = new JButton();
        jb.setText("ADD");
        jb.setBounds(100, 140, 80, 30);
        
        
        
        JTextField nameEntry = new JTextField();
        JTextField emailEntry = new JTextField();
        JTextField contactEntry = new JTextField();
        JRadioButton male= new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        
        
        nameEntry.setBounds(80, 40, 150, 20);
        emailEntry.setBounds(80, 60, 150, 20);
        contactEntry.setBounds(80, 80, 150, 20);
        male.setBounds(80, 100, 80, 20);
        female.setBounds(170, 100, 100, 20);
        
        ButtonGroup Gender = new ButtonGroup();
        Gender.add(male);
        Gender.add(female);
        JTextField textArea = new JTextField();

        jb.addActionListener((e) -> {
            String nameShow = nameEntry.getText();
            String emailShow = emailEntry.getText();
            String contactShow = contact.getText();
            String genderShow = gender.getText();
          
      
        });
        
        
        
        jf.add(textArea);
        jf.add(name);
        jf.add(email);
        jf.add(contact);
        jf.add(gender);
        jf.add(jb);
        jf.add(nameEntry);
        jf.add(emailEntry);
        jf.add(contactEntry);
        jf.add(male);
        jf.add(female);
        
        
        
        
        jf.setVisible(true);
   
        
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Student st = new Student();
    }
    
}
