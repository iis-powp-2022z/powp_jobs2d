package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Drawer to Jobs2dMagic adapter
 */
public class DrawerToJobs2dMagicAdapter implements Job2dDriver {
	private int startX = 0, startY = 0;
	private final DrawPanelController drawPanelController;

	public DrawerToJobs2dMagicAdapter(DrawPanelController drawPanelController) {
		super();
		this.drawPanelController = drawPanelController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		drawPanelController.drawLine(line);
		setPosition(x, y);
	}

	@Override
	public String toString() {
		return "DrawerToJobs2dMagicAdapter";
	}
}