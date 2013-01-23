package de.soft.views;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SingleTestOptionView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Labels
	private JLabel chooseAlgorithm = new JLabel("WŠhlen sie den Algorithmus");
	private JLabel chooseCase = new JLabel("WŠhlen Sie die Testvariante:");
	private JLabel chooseElementCount = new JLabel("WŠhlen sie die maximale Elementzahl: 1");
	
	private ButtonGroup algorithmSelect = new ButtonGroup();
	private ButtonGroup caseSelect = new ButtonGroup();
	
	// Radiobuttons
	private JRadioButton algorithmQuickSort = new JRadioButton("Quicksort");
	private JRadioButton algorithmInsertionSort = new JRadioButton("Insertionsort");
	private JRadioButton algorithmMergeSort = new JRadioButton("Mergesort");
	private JRadioButton algorithmBubbleSort = new JRadioButton("Bubblesort", true);
	private JRadioButton worstCase = new JRadioButton("Worst Case");
	private JRadioButton bestCase = new JRadioButton("Best Case", true);
	
	// Buttons
	private JButton goButton = new JButton("Go!");
	
	// Slider
	private JSlider elementCountSlider = new JSlider(1, 60001, 1);
	
	// Auswertung
	private String selectedAlgorithm;
	private String selectedCase;
	private int elementCount;

	public SingleTestOptionView() {

		setTitle("Sortieralgorithmen Tester - Einzeltest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(new GridLayout(4, 1));
		
		// Algorithm Choose Panel
		JPanel algorithmChoosePanel = new JPanel(new GridLayout(2, 1));
		JPanel algorithmChooseRBPanel = new JPanel(new GridLayout(1, 4));
		
		algorithmSelect.add(algorithmBubbleSort);
		algorithmSelect.add(algorithmInsertionSort);
		algorithmSelect.add(algorithmMergeSort);
		algorithmSelect.add(algorithmQuickSort);
		algorithmChooseRBPanel.add(algorithmBubbleSort);
		algorithmChooseRBPanel.add(algorithmInsertionSort);
		algorithmChooseRBPanel.add(algorithmMergeSort);
		algorithmChooseRBPanel.add(algorithmQuickSort);
		selectedAlgorithm = "bubblesort";
		
		algorithmChoosePanel.add(chooseAlgorithm);
		algorithmChoosePanel.add(algorithmChooseRBPanel);
		
		// Case Choose Panel
		JPanel caseChoosePanel = new JPanel(new GridLayout(2, 1));
		JPanel caseChooseRBPanel = new JPanel(new GridLayout(1, 2));

		caseSelect.add(bestCase);
		caseSelect.add(worstCase);
		caseChooseRBPanel.add(bestCase);
		caseChooseRBPanel.add(worstCase);
		selectedCase = "bestcase";
		
		JPanel elementCountPanel = new JPanel(new GridLayout(2, 1));
		elementCountPanel.add(chooseElementCount);
		elementCountPanel.add(elementCountSlider);
		elementCountSlider.setMajorTickSpacing(10000);
		elementCountSlider.setMinorTickSpacing(1000);
		elementCountSlider.setPaintLabels(true);
		elementCountSlider.setPaintTicks(true);
		elementCount = 1;

		caseChoosePanel.add(chooseCase);
		caseChoosePanel.add(caseChooseRBPanel);
		
		addActionCommands();
		addActionListener();
		
		add(algorithmChoosePanel);
		add(caseChoosePanel);
		add(elementCountPanel);
		add(goButton);
		pack();
	}
	
	private void addActionCommands() {
		// Action Commands
		algorithmBubbleSort.setActionCommand("bubblesort");
		algorithmInsertionSort.setActionCommand("insertionsort");
		algorithmMergeSort.setActionCommand("mergesort");
		algorithmQuickSort.setActionCommand("quicksort");
		
		bestCase.setActionCommand("bestcase");
		worstCase.setActionCommand("worstcase");
		
		goButton.setActionCommand("go");
	}

	private void addActionListener() {
		algorithmBubbleSort.addActionListener(new AlgorithmChooseListener());
		algorithmInsertionSort.addActionListener(new AlgorithmChooseListener());
		algorithmMergeSort.addActionListener(new AlgorithmChooseListener());
		algorithmQuickSort.addActionListener(new AlgorithmChooseListener());
		
		bestCase.addActionListener(new CaseChooseListener());
		worstCase.addActionListener(new CaseChooseListener());
		
		elementCountSlider.addChangeListener(new ElementCountSliderListener());
	}

	public int getElementCount() {
		return elementCount;
	}

	public JButton getGoButton() {
		return goButton;
	}
	
	public String getSelectedAlgorithm() {
		return selectedAlgorithm;
	}
	
	public String getSelectedCase() {
		return selectedCase;
	}
	
	// ActionListener Klassen
	private class AlgorithmChooseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			selectedAlgorithm = e.getActionCommand();
		}
	}
	
	private class CaseChooseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			selectedCase = e.getActionCommand();
		}
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
