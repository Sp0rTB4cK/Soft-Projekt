import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * Die Klasse WrappedLabel dient dazu, Labels mit Zeilenumbruechen zu erzeugen.
 * 
 * 
 * @author michaelhahn
 *
 */

public class WrappedLabel extends JTextArea {

	private static final long serialVersionUID = 1L;
	private JLabel label;
	
	/**
	 * Der Standard Konstruktor initialisiert ein WrappedLabel mit einem leeren String.
	 */
	public WrappedLabel() {
		this("");
	}
	
	/**
	 * Dieser Konstruktor initialisiert ein WrappedLabel mit dem uebergebenen String.
	 * 
	 * @param text: der Label Text
	 */
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
