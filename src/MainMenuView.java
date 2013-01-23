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
		WrappedLabel singleTestDescriptionText = new WrappedLabel("Bei einem Einzeltest waehlen Sie einen Sortieralgorithmus, ob worst- oder best-case und die maximale Anzahl der Elemente." +
				"\nDas Programm wird verschiedene Arrays mit der Elementanzahl 1 bis X sortieren und Ihnen die jeweilige Sortierzeit als Liniendiagramm ausgeben.");
		singleTestDescriptionText.setSize(300, 100);
		singleTestDescriptionPanel.add(singleTestDescriptionText);
		
		JPanel multiTestDescriptionPanel = new JPanel();
		multiTestDescriptionPanel.setLayout(descriptionLayout);
		WrappedLabel multiTestDescriptionText = new WrappedLabel("Der Vergleichstest funktioniert wie der Einzeltest. Der Unterschied liegt hier jedoch darin, dass alle 4 Sortierverfahren durchgespielt werden und Sie" +
				" ein Diagramm erhalten, in dem Sie alle 4 Algorithmen vergleichen koennen.");
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
