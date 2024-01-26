package AppPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar implements ActionListener{
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StringListener sListener;
	
	public ToolBar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
		
	}
	
	public void setStringListener(StringListener stringListener) {
		this.sListener = stringListener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloButton) {
			sListener.textEmmited("Hello!\n");
		}else if(clicked == goodbyeButton){
			sListener.textEmmited("Goodbye!\n");
		}
	}
}
