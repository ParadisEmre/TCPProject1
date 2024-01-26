package AppPackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private ToolBar toolbar;
	private FormPanel formPanel;
	
	
	public MainFrame() {
		super("Hi!!");
		
		this.setLayout(new BorderLayout());
		toolbar = new ToolBar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		
		
		toolbar.setStringListener(new StringListener() {

			@Override
			public void textEmmited(String text) {
				textPanel.appendText(text);
				
			}
			
		});
		
		formPanel.setFormListener(new FormListener() {
			public void formEventOccured(FormEvent e) {
				String name = e.getName();
				String occupation = e.getOccupation();
				
				textPanel.appendText(name + " " + occupation + "\n");
			}
		});

		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		
		this.setSize(500, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
