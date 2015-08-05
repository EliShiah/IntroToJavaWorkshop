package day3;

import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
String Adress = JOptionPane.showInputDialog("where do you live");
String Age = JOptionPane.showInputDialog("how old are you");
String name = JOptionPane.showInputDialog("what is your name");
String cellphone = JOptionPane.showInputDialog("What is your phone number");
JOptionPane.showMessageDialog(null,"i know your adress is "+Adress+"I know how old you are "+Age+" I now what your name is "+name+"I know what your phone number is "+cellphone+". "+name+" You shouldent tell people your information");
}
}
