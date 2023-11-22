package module;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame {
	
	private TitleBar title;
	private List list;
	private ButtonPannel btnpanel;
	
	private JButton addTask;
	private JButton clear;
	
	public AppFrame(){
		this.setSize(new Dimension(1400,700));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		title = new TitleBar();
		list = new List();
		btnpanel = new ButtonPannel();
		
		this.add(title,BorderLayout.NORTH);
		this.add(btnpanel,BorderLayout.SOUTH);
		this.add(list,BorderLayout.CENTER);
		
		addTask = btnpanel.getAddTask();
		clear=btnpanel.getClear();
		
		addListeners();
	}

	public void addListeners() {
		
		addTask.addMouseListener(new MouseAdapter(){
			
			public void mousePressed(MouseEvent e) {
				Task task= new Task();
				list.add(task);
				list.updateNumbers();
				
				task.getDone().addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						task.changeStatus();
						revalidate();
					}
				});
				revalidate();
			}
			
		});
	}
}
