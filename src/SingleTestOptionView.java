import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class SingleTestOptionView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SingleTestOptionView() {
		setPreferredSize(new Dimension(500, 400));
		
		JLabel chooseCase = new JLabel("WŠhlen Sie die Testvariante:");
	}

}
