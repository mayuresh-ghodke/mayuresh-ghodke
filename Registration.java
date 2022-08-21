import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
class Registration implements ActionListener
{
    JFrame frame=new JFrame("Student Registration Form");
    Container con=frame.getContentPane();
    JLabel Imainhead,Iname,Iemail,Imobile,Igender,Idob,Ipassword,Iregis,Isearch,Idelete;
    JTextField tname,temail,tmobile,tsearch,tdelete;
    JPasswordField pass;
    JRadioButton r1,r2,r3;
    ButtonGroup gender=new ButtonGroup();
    JComboBox day,month,year;
    JCheckBox term;
    JButton submit,reset,showall,search,delete;
    JTextArea display;
    Registration()
    {
        frame.setBounds(30,30,1500,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(null);
        con.setBackground(Color.cyan);
        Font f=new Font("Times New Roman",Font.BOLD,30);

        //frame.setAlignment(Component.CENTER_ALIGNMENT);


        Imainhead=new JLabel("Student Registration Form");
        Imainhead.setForeground(Color.red);
        Imainhead.setBounds(420,3,400,65);
        Imainhead.setFont(f);
        con.add(Imainhead);

        Iname=new JLabel("Enter Name :");
        Iname.setForeground(Color.blue);
        Iname.setBounds(50,50,90,30);
        con.add(Iname);

        Iemail=new JLabel("Enter Email :");
        Iemail.setForeground(Color.blue);
        Iemail.setBounds(50,250,90,30);
        con.add(Iemail);

        Imobile=new JLabel("Mobile No :");
        Imobile.setForeground(Color.blue);
        Imobile.setBounds(50,200,70,30);
        con.add(Imobile);

        Igender=new JLabel("Gender :");
        Igender.setForeground(Color.blue);
        Igender.setBounds(50,100,70,30);
        con.add(Igender);

        Idob=new JLabel("DOB :");
        Idob.setForeground(Color.blue);
        Idob.setBounds(50,150,70,30);
        con.add(Idob);

        Ipassword=new JLabel("Password :");
        Ipassword.setForeground(Color.blue);
        Ipassword.setBounds(50,300,70,30);
        con.add(Ipassword);

        tname=new JTextField();
        tname.setForeground(Color.blue);
        tname.setBounds(130,53,180,20);
        con.add(tname);

        r1=new JRadioButton("Male");
        r1.setForeground(Color.black);
        r1.setBounds(130,103,80,30);
        r1.setBackground(Color.white);
        con.add(r1);

        r2=new JRadioButton("Female");
        r2.setForeground(Color.black);
        r2.setBounds(230,103,80,30);
        r2.setBackground(Color.white);
        con.add(r2);

        gender.add(r1);
        gender.add(r2);

        temail=new JTextField();
        temail.setForeground(Color.blue);
        temail.setBounds(130,253,180,20);
        con.add(temail);

        tmobile=new JTextField();
        tmobile.setForeground(Color.blue);
        tmobile.setBounds(130,203,180,20);
        con.add(tmobile);

        pass=new JPasswordField();
        pass.setForeground(Color.blue);
        pass.setBounds(130,303,180,20);
        con.add(pass);

        String[] daylist=new String[31];
        for(int i=1;i<=31;i++)
        {
            daylist[i-1]=Integer.toString(i);
        }
        day=new JComboBox(daylist);
        day.setBounds(130,153,40,25);
        day.setEditable(true);
        day.setBackground(Color.green);
        con.add(day);

        String[] monthlist={"jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        month=new JComboBox(monthlist);
        month.setBounds(185,153,40,25);
        month.setEditable(true);
        month.setBackground(Color.green);
        con.add(month);

        String[] yearlist=new String[100];
        for(int i=1951;i<=2022;i++)
        {
            yearlist[i-1951]=Integer.toString(i);
        }
        year=new JComboBox(yearlist);
        year.setBounds(250,153,60,25);
        year.setEditable(true);
        con.add(year);

        term=new JCheckBox("I accept all the terms and conditions.");
        term.setBounds(70,340,250,25);
        year.setBackground(Color.green);
        year.setForeground(Color.black);

        //term.setTextColor(Color.RED);
        con.add(term);

        submit=new JButton("REGISTER");
        submit.setForeground(Color.darkGray);
        submit.setBackground(Color.pink);
        submit.setBounds(100,380,100,25);
        con.add(submit);

        reset=new JButton("RESET");
        reset.setForeground(Color.red);
        reset.setBackground(Color.lightGray);
        reset.setBounds(250,380,80,25);
        con.add(reset);

        r3=new JRadioButton("Already Registered, Please Login here");
        r3.setForeground(Color.black);
        r3.setBounds(50,450,250,30);
        r3.setBackground(Color.white);
        con.add(r3);

        Font ff=new Font("Times New Roman",Font.BOLD,15);
        display=new JTextArea();
        display.setBounds(1000,50,400,450);
        con.add(display);
        display.setFont(ff);
        display.setBackground(Color.WHITE);
        display.setForeground(Color.RED);
        display.setEditable(false);


        showall=new JButton("SHOW DATA");
        showall.setBounds(570,80,200,30);
        con.add(showall);


        Isearch=new JLabel("Search");
        Isearch.setForeground(Color.blue);
        Isearch.setBounds(570,160,250,30);
        Isearch.setFont(f);

        con.add(Isearch);

        tsearch=new JTextField();
        tsearch.setBounds(570,200,200,20);
        con.add(tsearch);
        tsearch.setForeground(Color.blue);

        search=new JButton("SEARCH");
        search.setBounds(590,240,150,30);
        con.add(search);
        con.setForeground(Color.black);

        Idelete=new JLabel("Delete");
        Idelete.setBounds(580,320,150,30);
        Idelete.setFont(f);
        Idelete.setForeground(Color.blue);
        con.add(Idelete);

        tdelete=new JTextField();
        tdelete.setBounds(570,360,200,20);
        con.add(tdelete);

        delete=new JButton("DELETE");
        delete.setBounds(590,400,140,30);
        con.add(delete);

        r3.addActionListener(this);
        submit.addActionListener(this);
        reset.addActionListener(this);
        showall.addActionListener(this);
        search.addActionListener(this);
        delete.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        String ch = e.getActionCommand();

        if (ch == "SUBMIT") {
            if (term.isSelected()) {
                String name = tname.getText();
                String email = temail.getText();
                String mobile = tmobile.getText();
                String password = pass.getText();
                String gen = "Male";
                if (r2.isSelected()) {
                    gen = "Female";
                }
                String date = (String) day.getSelectedItem();
                String mon = (String) month.getSelectedItem();
                String yr = (String) year.getSelectedItem();

                try {
                    try {
                        //Load the driver
                        Class.forName("org.postgresql.Driver");
                        System.out.println("Driver Loaded Successfully");
                    } catch (ClassNotFoundException ce) {
                        display.setText("Loading Driver failed");
                    }

                    //establish the connection
                    Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/register","postgres","root");

                    String sql = "insert into data (name,gender,day,month,year,mobile,email,pass)values(?,?,?,?,?,?,?,?)";

                    //create the statement
                    PreparedStatement st = conn.prepareStatement(sql);

                    if (name == "REGISTER") {
                        display.setText("Yes");
                    }

                    st.setString(1, name);
                    st.setString(2, gen);
                    st.setString(3, date);
                    st.setString(4, mon);
                    st.setString(5, yr);
                    st.setString(6, mobile);

                    //To validate proper email
                    EmailValidation eml_val=new EmailValidation();
                    if(eml_val.EmailIsValid(String.valueOf(temail))) {
                        st.setString(7, email);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Email must contain only @,.,symbol");
                    }

                    st.setString(8, password);

                    st.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Congratulations, Registration Successful");

                    conn.close();
                    st.close();
                } catch (Exception ae) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please Fill All The Fields And/Or Agree Terms and Conditions");
            }

        } else if (ch == "SHOW DATA") {

            try {
                try {
                    Class.forName("org.postgresql.Driver");
                } catch (ClassNotFoundException ce) {
                    display.setText("Loading Driver failed");
                }


                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/register","postgres","root");
                String sql = "select * from data";
                Statement st = conn.createStatement();

                ResultSet rs = st.executeQuery(sql);


                while (rs.next()) {
                    String name = rs.getString("name");
                    String gen = rs.getString("gender");
                    String date = rs.getString("day");
                    String mon = rs.getString("month");
                    String yr = rs.getString("year");
                    String mobile = rs.getString("mobile");
                    String email = rs.getString("email");
                    String password = rs.getString("pass");
                    System.out.println();

                    display.setText("\n\nName: " + name + "\nEmail: " + email + "\nMobile No: " + mobile + "\nDate of Birth: " + date + "" + mon + "" + yr + "\nGender: " + gen + "\nPassword: " + password + "\n");
                }

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(null, "Something went wrong...");
            }
        } else if (ch == "SEARCH") {
            try {
                try {
                    Class.forName("org.postgresql.Driver");
                    System.out.println("Driver loaded successfully");
                } catch (ClassNotFoundException ce) {
                    display.setText("Loading Driver failed");
                }
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/register", "postgres", "root");

                String s1 = tsearch.getText();

                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from data where name= '" + s1 + "'");


                while (rs.next()) {
                    String name = rs.getString("name");
                    String gen = rs.getString("gender");
                    String date = rs.getString("day");
                    String mon = rs.getString("month");
                    String yr = rs.getString("year");
                    String mobile = rs.getString("mobile");
                    String email = rs.getString("email");
                    String password = rs.getString("pass");

                    display.setText("\n\nName: " + name + "\nEmail: " + email + "\nMobile No: " + mobile + "\nDate of Birth: " + date + "" + mon + "" + yr + "\nGender: " + gen + "\nPassword: " + password + "\n");

                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
        }
        else
        if (ch == "DELETE")
        {
            try {
                try {
                    Class.forName("org.postgresql.Driver");
                } catch (ClassNotFoundException ce) {
                    display.setText("Loading Driver failed");
                }
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/register","postgres","root");

                String sql = "delete from data where name=?";

                PreparedStatement st = conn.prepareStatement(sql);

                String s1 = tdelete.getText();

                st.setString(1, s1);

                st.executeUpdate();

                JOptionPane.showMessageDialog(null, "Deleted Successfully");

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
        }
        else
        {
            tname.setText(null);
            temail.setText(null);
            tmobile.setText(null);
            pass.setText(null);
            tsearch.setText(null);
            tdelete.setText(null);
            display.setText(null);

            gender.clearSelection();
            term.setSelected(false);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }

        if(r3.isSelected())
        {
            new CreateLoginForm();
        }
    }
}
class RegistrationMain
{
    public static void main(String args[])
    {
        Registration registration=new Registration();
        EmailValidation eml_val=new EmailValidation();
    }
}