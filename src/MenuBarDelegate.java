import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class MenuBarDelegate implements ActionListener {

	public MenuBarDelegate() {
		// TODO Automatisch generierter Konstruktorstub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Datei
		if("quit".equals(e.getActionCommand())) {
			System.exit(0);
		}
		
		// Hilfe
		if("about".equals(e.getActionCommand())) {
			
			String about = "Sortieralgorithmus Tester wurde von Michael Hahn und Johann Fischer entwickelt. \n\n" +
					"Version 1.0";
			
			JOptionPane.showMessageDialog(null, about, "†ber", JOptionPane.PLAIN_MESSAGE);
		}
		if("manual".equals(e.getActionCommand())) {
			System.out.println("ToDo: Handbuch!");
		}
		
	}

}
