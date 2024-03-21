package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.TestSelection;
import edu.kis.powp.jobs2d.commands.CommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private TestSelection figureNumber;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestSelection figureNumber) {
		this.driverManager = driverManager;
		this.figureNumber = figureNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figureNumber) {
			case figureScriptOne:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case figureScriptTwo:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case Rectangle:
				CommandFactory.getRectangleCommand().execute(driverManager.getCurrentDriver());
				break;
			case Triangle:
				CommandFactory.getTriangleCommand().execute(driverManager.getCurrentDriver());
				break;
			default:
				break;
		}
	}
}
