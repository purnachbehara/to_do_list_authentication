package module;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPannel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JButton addTask;
	private JButton clear;
	
	Border emptyBorder= BorderFactory.createEmptyBorder();

	ButtonPannel(){
		this.setPreferredSize(new Dimension(1400,60));
		this.setBackground(Color.GRAY);
		
		addTask= new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("times-new-roman",Font.PLAIN,20));
		
		this.add(addTask);
		
		this.add(Box.createHorizontalStrut(20));
		
		clear= new JButton("complete Task");
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("times-new-roman",Font.PLAIN,20));
		
		this.add(clear);
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}

}
