package loginpannel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener{
	
	Container c;
	JLabel label1,label2,label3;
	JTextField user,pass;
	JPasswordField password;
	JButton button;
	
	public LoginForm(){
		setTitle("LoginForm");
		setSize(500,400);
		setLocation(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(null);
		
		label1=new JLabel("User Email:");
		label2=new JLabel("Password:");
		
		label1.setBounds(100, 100, 100, 20);
		label2.setBounds(100, 150, 100, 20);
		
		c.add(label1);
		c.add(label2);
		
		user=new JTextField();
		user.setBounds(200, 100, 160, 25);
		c.add(user);
		
		pass=new JTextField();
		pass.setBounds(200, 150, 160, 25);
		c.add(pass);
		
		button=new JButton("Authenticate");
		button.setBounds(190, 250, 120, 25);
		c.add(button);
		
		label3=new JLabel();
		label3.setBounds(180,50,200,25);
		c.add(label3);
		
		button.addActionListener(this);
		
		setVisible(true);
		
		}
	String username;
	String passwordvalue;
	
	public void actionPerformed(ActionEvent e) {
		username=user.getText();
		passwordvalue=pass.getText();
		LoginUserData data =new LoginUserData();
		data.setUsermail(username);
		data.setPassword(passwordvalue);
		new Authentication(data);
	}
	
}
