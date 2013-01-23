package de.soft.views;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class MultiTestResultView extends JFrame {
	private static final long serialVersionUID = 1L;

	public MultiTestResultView(DefaultCategoryDataset dataSet) {
		super("Result");
		
		JFreeChart barchart = ChartFactory.createBarChart("Ergebnis", "Elementzahl", "millisekunden", dataSet, PlotOrientation.VERTICAL, true, true, false);
		ChartPanel panel = new ChartPanel(barchart);
		
		setSize(500, 300);
		
		setContentPane(panel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
