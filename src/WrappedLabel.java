import javax.swing.JLabel;
import javax.swing.JTextArea;


public class WrappedLabel extends JTextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	
	public WrappedLabel() {
		this("");
	}

	public WrappedLabel(String text) {
		super(text);
		label = new JLabel();

        this.setEditable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setFont(label.getFont());
        this.setOpaque(false);
	}
	

}
