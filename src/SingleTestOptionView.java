//import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SingleTestOptionView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Labels
	private JLabel chooseAlgorithm = new JLabel("WŠhlen sie den Algorithmus");
	private JLabel chooseCase = new JLabel("WŠhlen Sie die Testvariante:");
	private JLabel chooseElementCount = new JLabel("WŠhlen sie die maximale Elementzahl");
	
	private JTextField elementCountField = new JTextField();
	
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
	

	public SingleTestOptionView() {
		

		setTitle("Sortieralgorithmen Tester");
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
		
		algorithmChoosePanel.add(chooseAlgorithm);
		algorithmChoosePanel.add(algorithmChooseRBPanel);
		
		// Case Choose Panel
		JPanel caseChoosePanel = new JPanel(new GridLayout(2, 1));
		JPanel caseChooseRBPanel = new JPanel(new GridLayout(1, 2));

		caseSelect.add(bestCase);
		caseSelect.add(worstCase);
		caseChooseRBPanel.add(bestCase);
		caseChooseRBPanel.add(worstCase);
		
		JPanel elementCountPanel = new JPanel(new GridLayout(2, 1));
		elementCountPanel.add(chooseElementCount);
		elementCountPanel.add(elementCountField);

		caseChoosePanel.add(chooseCase);
		caseChoosePanel.add(caseChooseRBPanel);
		
		add(algorithmChoosePanel);
		add(caseChoosePanel);
		add(elementCountPanel);
		add(goButton);
		pack();
	}
}
