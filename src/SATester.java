import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;


public class SATester {
	
	private static Dimension screensize;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		screensize = Toolkit.getDefaultToolkit().getScreenSize();
		
		// Hauptfenster
		JFrame hauptfenster = createMainFrame();
		
		hauptfenster.setVisible(true);
		
	}
	
	private static JFrame createMainFrame() {
		JFrame result = new JFrame();
		result.setTitle("Sortieralgorithmen Tester");
		result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		result.setSize(800, 600);
		result.setLocationRelativeTo(null);
		result.setJMenuBar(createJMenuBar());
		
		return result;
	}
	
	private static JMenuBar createJMenuBar() {
		JMenuBar result = new JMenuBar();
		
		// Datei
		JMenu fileMenu = new JMenu("Datei");
		JMenuItem closeItem = new JMenuItem("Schlie§en");
		fileMenu.add(closeItem);
		
		
		// Hilfe
		JMenu helpMenu = new JMenu("Hilfe");
		JMenuItem aboutItem = new JMenuItem("†ber");
		JMenuItem helpTextItem = new JMenuItem("Handbuch");
		helpMenu.add(aboutItem);
		helpMenu.addSeparator();
		helpMenu.add(helpTextItem);
		
		// Auf das Menue legen
		result.add(fileMenu);
		result.add(helpMenu);
		
		return result;
	}

}
