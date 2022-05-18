package com.app.stage;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Table {
	protected static double tableLength = 60.0;
	protected static double tableWidth = 6.0;
	private Line table;

	public Table() {
		table = new Line();
		table.setStroke(Color.BROWN);
		table.setStrokeWidth(tableWidth);
		table.setStartX(Controller.layoutWidth / 2.0 - tableLength / 2.0);
		table.setStartY(Controller.layoutHeight - 30.0);
		table.setEndX(Controller.layoutWidth / 2.0 + tableLength / 2.0);
		table.setEndY(Controller.layoutHeight - 30.0);
	}

	protected Line getTable() {
		return this.table;
	}

	protected void changeSize(double length) {
		table.setStartX(Controller.layoutWidth / 2 - length / 2 + 5);
		table.setEndX(Controller.layoutWidth / 2 + length / 2 + 5);
	}
}
