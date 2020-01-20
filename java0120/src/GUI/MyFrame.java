package GUI;

import java.awt.Dialog;
import java.awt.Frame;

public class MyFrame extends Frame {
	
	public MyFrame() {
		setTitle("버튼");
		setLocation(20, 20);
		setSize(400, 400);
		setVisible(true);
		

		Dialog dialog = new Dialog(this, "버튼",true);
		dialog.setLocation(10,10);
		dialog.setSize(100,100);
			
				
		setVisible(true);
		
		dialog.setVisible(true);
	}
}
