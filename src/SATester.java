
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;


public class SATester {
	// Delegates
	private MenuBarDelegate menuBarDelegate;
	
	private static Dimension screensize;
	
	private static JFrame hauptfenster;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SATester();
	}
	
	public SATester() {
		screensize = Toolkit.getDefaultToolkit().getScreenSize();
		menuBarDelegate = new MenuBarDelegate();
		
		// Hauptfenster
		hauptfenster = createMainFrame();
		
		hauptfenster.setVisible(true);
	}
	
	private JFrame createMainFrame() {
		JFrame result = new JFrame();
		result.setTitle("Sortieralgorithmen Tester");
		result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//result.setSize(800, 600);
		
		// Menu bar
		result.setJMenuBar(createJMenuBar());
		
		// Buttons
		JPanel buttonPanel = new JPanel();
		GridLayout buttonPanelLayout = new GridLayout(2, 2);
		
		buttonPanel.setLayout(buttonPanelLayout);
		
		JButton singleTest = new JButton("Einzeltest");
		JPanel singleTestButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		singleTestButtonPanel.add(singleTest);
		
		JButton multiTest = new JButton("Vergleichstest");
		JPanel multiTestButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		multiTestButtonPanel.add(multiTest);
		
		// Descriptions
		FlowLayout descriptionLayout = new FlowLayout(FlowLayout.CENTER);
		
		JPanel singleTestDescriptionPanel = new JPanel();
		singleTestDescriptionPanel.setLayout(descriptionLayout);
		WrappedLabel singleTestDescriptionText = new WrappedLabel("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
				"eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et");
		singleTestDescriptionText.setSize(300, 100);
		singleTestDescriptionPanel.add(singleTestDescriptionText);
		
		JPanel multiTestDescriptionPanel = new JPanel();
		multiTestDescriptionPanel.setLayout(descriptionLayout);
		WrappedLabel multiTestDescriptionText = new WrappedLabel("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
				"eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et");
		multiTestDescriptionText.setSize(300, 100);
		multiTestDescriptionPanel.add(multiTestDescriptionText);
		
		
		buttonPanel.add(singleTestButtonPanel);
		buttonPanel.add(singleTestDescriptionPanel);
		buttonPanel.add(multiTestButtonPanel);
		buttonPanel.add(multiTestDescriptionPanel);
		
		result.add(buttonPanel);
		result.pack();
		result.setLocationRelativeTo(null);
		
		return result;
	}
	
	private JMenuBar createJMenuBar() {
		JMenuBar result = new JMenuBar();
		
		// Datei
		JMenu fileMenu = new JMenu("Datei");
		
		JMenuItem closeItem = new JMenuItem("Schlie§en");
		closeItem.setActionCommand("quit");
		closeItem.addActionListener(menuBarDelegate);
		
		fileMenu.add(closeItem);
		
		
		// Hilfe
		JMenu helpMenu = new JMenu("Hilfe");
		
		JMenuItem aboutItem = new JMenuItem("†ber");
		aboutItem.setActionCommand("about");
		aboutItem.addActionListener(menuBarDelegate);
		
		JMenuItem helpTextItem = new JMenuItem("Handbuch");
		helpTextItem.setActionCommand("manual");
		helpTextItem.addActionListener(menuBarDelegate);
		
		helpMenu.add(aboutItem);
		helpMenu.addSeparator();
		helpMenu.add(helpTextItem);
		
		// Auf das Menue legen
		result.add(fileMenu);
		result.add(helpMenu);
		
		
		return result;
	}

}
