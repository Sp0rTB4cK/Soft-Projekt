import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
			System.out.println("ToDo: About!");
		}
		if("manual".equals(e.getActionCommand())) {
			System.out.println("ToDo: Handbuch!");
		}
		
	}

}
