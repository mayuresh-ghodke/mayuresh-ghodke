//import required classes and packages

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//create CreateLoginForm class to create login form
//class extends JFrame to create a window where our component add
//class implements ActionListener to perform an action on button click
class CreateLoginForm extends JFrame implements ActionListener
{
    //initialize button, panel, label, and text field
    JButton b1,b2;
    JFrame frame = new JFrame();
    Container con=frame.getContentPane();
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;

    //calling constructor
    CreateLoginForm()
    {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        con.setLayout(null);
        con.setBackground(Color.gray);
        Font f=new Font("Times New Roman",Font.BOLD,30);

        //create label for username
        userLabel = new JLabel();
        userLabel.setText("Username");      //set label value for textField1
        userLabel.setBounds(80,90,100,25);
        con.add(userLabel);

        //create text field to get username from the user
        textField1 = new JTextField();    //set length of the text
        textField1.setBounds(160,90,150,30);
        con.add(textField1);

        //create label for password
        passLabel = new JLabel();
        passLabel.setText("Password");      //set label value for textField2
        passLabel.setBounds(80,120,100,30);
        con.add(passLabel);

        //create text field to get password from the user
        textField2 = new JPasswordField();    //set length for the password
        textField2.setBounds(160,120,150,20);
        con.add(textField2);

        //create submit button
        b1 = new JButton("Submit"); //set label to button
        b1.setBounds(80,160,90,20);
        b2 = new JButton("Forgot Password");
        b2.setBounds(180,160,130,20);

        //create panel to put form elements
        frame.setBounds(500,200,400,300);
        frame.add(userLabel);    //set username label to frame
        frame.add(textField1);   //set text field to frame
        frame.add(passLabel);    //set password label to frame
        frame.add(textField2);   //set text field to frame
        frame.add(b1);           //set button to frame
        frame.add(b2);

        //perform action on button click
        b1.addActionListener(this);     //add action listener to button
        b2.addActionListener(this);
        frame.setTitle("Student Login Form");         //set title to the login form
    }

    //define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
    {
        String userValue = textField1.getText();        //get user entered username from the textField1
        String passValue = textField2.getText();        //get user entered password from the textField2



    }
}
//create the main class
class LoginFormDemo
{
    //main() method start
    public static void main(String[] args)
    {
        CreateLoginForm clf=new CreateLoginForm();

    }
}


