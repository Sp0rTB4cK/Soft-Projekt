package de.soft.views;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MultiTestOptionView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Labels
	private JLabel chooseElementCount = new JLabel("WŠhlen sie die maximale Elementzahl: 1");
	private JLabel chooseCase = new JLabel("WŠhlen Sie die Testvariante:");
	
	private ButtonGroup caseSelect = new ButtonGroup();
	
	// Radiobuttons
	private JRadioButton worstCase = new JRadioButton("Worst Case");
	private JRadioButton bestCase = new JRadioButton("Best Case", true);
	
	// Buttons
	private JButton goButton = new JButton("Go!");

	// Slider
	private JSlider elementCountSlider = new JSlider(1, 60001, 1);
	
	// Auswertung
	private String selectedCase;
	private int elementCount;

	public MultiTestOptionView() {
		setTitle("Sortieralgorithmen Tester - Vergleichstest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400, 300));
		setLayout(new GridLayout(3, 1));
		
		// Case Choose Panel
		JPanel caseChoosePanel = new JPanel(new GridLayout(2, 1));
		JPanel caseChooseRBPanel = new JPanel(new GridLayout(1, 2));

		caseSelect.add(bestCase);
		caseSelect.add(worstCase);
		caseChooseRBPanel.add(bestCase);
		caseChooseRBPanel.add(worstCase);
		selectedCase = "bestcase";

		caseChoosePanel.add(chooseCase);
		caseChoosePanel.add(caseChooseRBPanel);
		
		JPanel elementCountPanel = new JPanel(new GridLayout(2, 1));
		elementCountPanel.add(chooseElementCount);
		elementCountPanel.add(elementCountSlider);
		elementCountSlider.setMajorTickSpacing(10000);
		elementCountSlider.setMinorTickSpacing(1000);
		elementCountSlider.setPaintLabels(true);
		elementCountSlider.setPaintTicks(true);
		elementCount = 1;
		

		add(caseChoosePanel);
		add(elementCountPanel);
		add(goButton);
		
		addActionCommands();
		addActionListener();
		
		pack();
	}
	
	private void addActionCommands() {
		// Action Commands
		
		goButton.setActionCommand("go");
	}
	
	private void addActionListener() {
		
		elementCountSlider.addChangeListener(new ElementCountSliderListener());
	}
	
	public int getElementCount() {
		return elementCount;
	}
	
	public JButton getGoButton() {
		return goButton;
	}
	
	public String getSelectedCase() {
		return selectedCase;
	}
	
	private class ElementCountSliderListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider slider = (JSlider) e.getSource();
			
			elementCount = slider.getValue();
			chooseElementCount.setText("WŠhlen sie die maximale Elementzahl: "+ elementCount);
		}
		
	}

}
