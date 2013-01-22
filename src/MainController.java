
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.jfree.data.category.DefaultCategoryDataset;


public class MainController {
	//Views
	private MainMenuView mainMenuView;
	private SingleTestOptionView singleTestOptionView = new SingleTestOptionView(); 
	
	// Menu Bar
	private SortMenuBar menuBar;
	

	public MainController() {
		menuBar = new SortMenuBar();
		
		mainMenuView = new MainMenuView();
		singleTestOptionView = new SingleTestOptionView();
		
		addActionListeners();
	}
	
	
	public void showView() {
		mainMenuView.setLocationRelativeTo(null);
		mainMenuView.setJMenuBar(menuBar);
		mainMenuView.pack();
		mainMenuView.setVisible(true);
	}
	
	private void addActionListeners() {
		// Menu Bar
		menuBar.getCloseItem().addActionListener(new MenuBarListener());
		menuBar.getAboutItem().addActionListener(new MenuBarListener());
		menuBar.getHelpTextItem().addActionListener(new MenuBarListener());
		
		//main menu view
		mainMenuView.getSingleTest().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				singleTestOptionView.setLocationRelativeTo(null);
				singleTestOptionView.setJMenuBar(menuBar);
				singleTestOptionView.setVisible(true);
				mainMenuView.setVisible(false);
				
			}
		});
		
		// SingleTestOptionView
		singleTestOptionView.getGoButton().addActionListener(new SingleTestOptionViewController());
	}
	
	class SingleTestOptionViewController implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton event = (JButton) e.getSource();
			
			if("go".equals(event.getActionCommand())) {
				int elementCount = Integer.parseInt(singleTestOptionView.getElementCount());
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				
				for(int i = 1; i <= elementCount; i += 1000) {
					int array[] = new int[0];
					if("worstcase".equals(singleTestOptionView.getSelectedCase())) {
						array = makeWCArray(i);
					} else {
						array = makeBCArray(i);
					}

					System.out.println("Sorting with " + i + " elements...");

					if("bubblesort".equals(singleTestOptionView.getSelectedAlgorithm())) {
						Bubblesort sort = new Bubblesort(array);
						dataset.addValue(sort.getSortTime(), "bubblesort", new Integer(i).toString());
					}
					if("insertionsort".equals(singleTestOptionView.getSelectedAlgorithm())) {
						Insertionsort sort = new Insertionsort(array);
						dataset.addValue(sort.getSortTime(), "insertionsort", new Integer(i).toString());
					}
					if("mergesort".equals(singleTestOptionView.getSelectedAlgorithm())) {
						Mergesort sort = new Mergesort(array);
						dataset.addValue(sort.getSortTime(), "mergesort", new Integer(i).toString());
					}
					if("quicksort".equals(singleTestOptionView.getSelectedAlgorithm())) {
						Quicksort sort = new Quicksort(array);
						dataset.addValue(sort.getSortTime(), "quicksort", new Integer(i).toString());
					}
				}
				
				new SingleTestResultView(dataset);
				
				System.out.println(singleTestOptionView.getSelectedAlgorithm());
				System.out.println(singleTestOptionView.getElementCount());
				System.out.println("GOOOO");
			}
		}
	}
	
	private int[] makeWCArray(int elements) {
		int array[] = new int[elements];
		
		int j = 0;
		for(int i = array.length-1; i >= 0; i--) {
			array[i] = j;
			j++;
		}
		
		return array;
	}

	private int[] makeBCArray(int elements) {
		int array[] = new int[elements];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		return array;
	}
	
	class MenuBarListener implements ActionListener {

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

}
