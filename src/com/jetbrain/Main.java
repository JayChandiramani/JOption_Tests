package com.jetbrain;
import javax.swing.*;

//import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hello User."); //Shows pop-up

        String fname,lname,fullname;
        // Scanner input=new Scanner(System.in);

        fname=JOptionPane.showInputDialog("Enter first name."); //input pop-up
        lname=JOptionPane.showInputDialog("Enter last name."); //input pop-up
        fullname=fname+" "+lname; //Joining first and last name
        JOptionPane.showMessageDialog(null,"Hello "+fullname); //printing full name in pop-up


        JOptionPane.showMessageDialog(null,"Error. Input is invalid.\nPlease try again.","Error Message Box",JOptionPane.ERROR_MESSAGE); //error message
        JOptionPane.showMessageDialog(null,"Test Run Successful","Information Test Run",JOptionPane.INFORMATION_MESSAGE); //informative message
        JOptionPane.showMessageDialog(null,"Test Run Successful","Warning Test Run",JOptionPane.WARNING_MESSAGE); //warning message
        JOptionPane.showMessageDialog(null,"Test Run Successful","Question Test Run",JOptionPane.QUESTION_MESSAGE); //question message

        // The following is for inserting an image
        ImageIcon Img = new ImageIcon("Fact.jpg");
        JOptionPane.showMessageDialog(null,"Test Run Successful","Image Test Run",JOptionPane.INFORMATION_MESSAGE,Img); //Showing Image
        
    }
}
