import de.soft.controller.MainController;


public class Main {
	static MainController controller;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		controller = new MainController();
		controller.showView();
	}
}
