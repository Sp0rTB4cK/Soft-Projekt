
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class SingleTestResultView extends JFrame {
	private static final long serialVersionUID = 1L;

	public SingleTestResultView(DefaultCategoryDataset dataSet) {
		super("Result");
		

		JFreeChart linechart = ChartFactory.createLineChart("Ergebnis", "Elementzahl", "millisekunden", dataSet, PlotOrientation.VERTICAL, false, true, false);
		ChartPanel panel = new ChartPanel(linechart);
		setSize(500, 500);
		
		setContentPane(panel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
