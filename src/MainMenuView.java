import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenuView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton multiTest = new JButton("Vergleichstest");
	private JButton singleTest = new JButton("Einzeltest");

	public MainMenuView() {
		setTitle("Sortieralgorithmen Tester - Hauptmenü");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Buttons
		JPanel buttonPanel = new JPanel();
		GridLayout buttonPanelLayout = new GridLayout(2, 2);
		
		buttonPanel.setLayout(buttonPanelLayout);
		
		JPanel singleTestButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		singleTestButtonPanel.add(singleTest);
		
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
		
		add(buttonPanel);
		pack();
		
		
	}

	public JButton getMultiTest() {
		return multiTest;
	}

	public JButton getSingleTest() {
		return singleTest;
	}
}
