package de.soft.controller;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class SortMenuBar extends JMenuBar {
	private JMenuItem closeItem = new JMenuItem("Schlie§en");
	private JMenuItem aboutItem = new JMenuItem("†ber");
	private JMenuItem helpTextItem = new JMenuItem("Handbuch");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SortMenuBar() {
		// Datei
		JMenu fileMenu = new JMenu("Datei");

		closeItem.setActionCommand("quit");
		//closeItem.addActionListener(menuBarDelegate);

		fileMenu.add(closeItem);


		// Hilfe
		JMenu helpMenu = new JMenu("Hilfe");

		aboutItem.setActionCommand("about");
		//aboutItem.addActionListener(menuBarDelegate);

		helpTextItem.setActionCommand("manual");
		//helpTextItem.addActionListener(menuBarDelegate);

		helpMenu.add(aboutItem);
		helpMenu.addSeparator();
		helpMenu.add(helpTextItem);

		// Auf das Menue legen
		add(fileMenu);
		add(helpMenu);
	}

	public JMenuItem getCloseItem() {
		return closeItem;
	}

	public JMenuItem getAboutItem() {
		return aboutItem;
	}

	public JMenuItem getHelpTextItem() {
		return helpTextItem;
	}

}
