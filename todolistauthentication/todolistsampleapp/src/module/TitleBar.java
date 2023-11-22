package module;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{
	
	TitleBar(){
		this.setPreferredSize(new Dimension(1400,60));
		this.setBackground(Color.GREEN);
		
		JLabel titletext= new JLabel("user to do list");
		titletext.setPreferredSize(new Dimension(200,60));
		titletext.setFont(new Font("times-new-roman",Font.BOLD,20));
		titletext.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titletext);
		}

}
