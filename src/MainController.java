
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


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
