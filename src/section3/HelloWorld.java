package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
System.out.println("Free Vbucks");
JOptionPane.showMessageDialog(null,"Welcome to Vbuck Generator");
String username = JOptionPane.showInputDialog(" What is your Fortnite Username and Password");
System.out.println(username);
JOptionPane.showMessageDialog(null,"Your Vbucks have been sent to " + username);
}
}
 