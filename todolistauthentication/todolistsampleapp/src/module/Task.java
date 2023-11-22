package module;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
	
	private JLabel index;
	private JTextField taskName;
	private JButton done;
	
	private boolean checked;
	
	Task(){
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index=new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		
		taskName= new JTextField("user task here");
		taskName.setBorder(BorderFactory.createEtchedBorder());
		taskName.setBackground(Color.BLUE);
		
		this.add(taskName,BorderLayout.CENTER);
		
		done= new JButton("Completed");
		done.setPreferredSize(new Dimension(80,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done,BorderLayout.EAST);
	}
	
	public JButton getDone() {
		return done;
	}

	public void changeIndex(int num) {
		this.index.setText(num+"");
		this.revalidate();		
	}
	
	public void changeStatus() {
		this.setBackground(Color.RED);
		taskName.setBackground(Color.RED);
		checked =true;
	}
}
