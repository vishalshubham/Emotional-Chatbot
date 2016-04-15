package com.emobot.charts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class XYLineChart extends JFrame {

	public XYLineChart(String title, ArrayList<ArrayList<Double>> eList,
			ArrayList<ArrayList<Double>> pList, ArrayList<ArrayList<Double>> aList) {
		super("EPA Graph of your conversation with Emobot");

		setLayout(new GridLayout(1, 0));
		JPanel chartPanel1 = createChartPanel(title + "E Value", eList, 1);
		add(chartPanel1);
		JPanel chartPanel2 = createChartPanel(title + "P Value", pList, 2);
		add(chartPanel2);
		JPanel chartPanel3 = createChartPanel(title + "A Value", aList, 3);
		add(chartPanel3);
		setSize(1680, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private JPanel createChartPanel(String title,
			ArrayList<ArrayList<Double>> eList, int i) {
		String chartTitle = title;
		String xAxisLabel = "X";
		String yAxisLabel = "Y";

		XYDataset dataset = createDataset(eList, i);

		JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
				xAxisLabel, yAxisLabel, dataset);

        chart.setBackgroundPaint(Color.WHITE);
		setSize(300, 200);
		XYPlot plot = chart.getXYPlot();
		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

		// sets paint color for each series
		if (i == 1) {
			renderer.setSeriesPaint(0, Color.RED);
			renderer.setSeriesPaint(1, Color.GRAY);
			renderer.setSeriesPaint(2, Color.GRAY);
			renderer.setSeriesPaint(3, Color.GRAY);
			renderer.setSeriesPaint(4, Color.GRAY);
			renderer.setSeriesPaint(5, Color.GRAY);
		} else if (i == 2) {
			renderer.setSeriesPaint(0, Color.YELLOW);
			renderer.setSeriesPaint(1, Color.GRAY);
			renderer.setSeriesPaint(2, Color.GRAY);
			renderer.setSeriesPaint(3, Color.GRAY);
			renderer.setSeriesPaint(4, Color.GRAY);
			renderer.setSeriesPaint(5, Color.GRAY);
		} else {
			renderer.setSeriesPaint(0, Color.GREEN);
			renderer.setSeriesPaint(1, Color.GRAY);
			renderer.setSeriesPaint(2, Color.GRAY);
			renderer.setSeriesPaint(3, Color.GRAY);
			renderer.setSeriesPaint(4, Color.GRAY);
			renderer.setSeriesPaint(5, Color.GRAY);
		}
		plot.setRenderer(renderer);

		return new ChartPanel(chart);
	}

	private XYDataset createDataset(ArrayList<ArrayList<Double>> eList, int index) {
		XYSeriesCollection dataset = new XYSeriesCollection();

		for (int i = 0; i < eList.size(); i++) {

			XYSeries series;
			if (index == 1) {
				series = new XYSeries("E" + i);
			} else if (index == 2) {
				series = new XYSeries("P" + i);
			} else {
				series = new XYSeries("A" + i);
			}

			ArrayList<Double> temp = eList.get(i);

			for (int j = 0; j < temp.size(); j++) {
				series.add(j + 1, temp.get(j));
			}

			dataset.addSeries(series);
		}
		return dataset;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ArrayList<Double> eList = new ArrayList<Double>();
				ArrayList<Double> pList = new ArrayList<Double>();
				ArrayList<Double> aList = new ArrayList<Double>();

				ArrayList<ArrayList<Double>> eListt = new ArrayList<ArrayList<Double>>();
				ArrayList<ArrayList<Double>> pListt = new ArrayList<ArrayList<Double>>();
				ArrayList<ArrayList<Double>> aListt = new ArrayList<ArrayList<Double>>();
				eList.add(1.0);
				eList.add(1.25);
				eList.add(1.5);

				pList.add(2.0);
				pList.add(2.25);
				pList.add(2.5);

				aList.add(3.0);
				aList.add(3.25);
				aList.add(3.75);
				eListt.add(eList);
				eListt.add(pList);/*
								 * eListt.add(aList);
								 */
				pListt.add(pList);
				aListt.add(aList);
				new XYLineChart("", eListt, pListt, aListt).setVisible(true);
			}
		});
	}
}