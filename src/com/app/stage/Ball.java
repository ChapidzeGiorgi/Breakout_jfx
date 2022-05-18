package com.app.stage;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball {
	private double radius;
	private static double defLayoutX = Controller.layoutWidth / 2;
	private static double defLayoutY = Controller.layoutHeight - 120.0;
	private Circle ball;

	public Ball() {
		ball = new Circle();

		radius = 8.0;
		ball.setStroke(Color.RED);

		ball.setRadius(radius);

		ball.setLayoutX(Controller.layoutWidth / 2);
		ball.setLayoutY(Controller.layoutHeight - 120.0);
	}

	protected void changeSize(double radius) {
		ball.setRadius(radius);
	}

	protected void setRadius(double radius) {
		this.radius = radius;
	}

	protected double getRadius() {
		return this.radius;
	}

	public Circle getBall() {
		return this.ball;
	}

	public static double getDefLayoutX() {
		return defLayoutX;
	}

	public static void setDefLayoutX(double defLayoutX) {
		Ball.defLayoutX = defLayoutX;
	}

	public static double getDefLayoutY() {
		return defLayoutY;
	}

	public static void setDefLayoutY(double defLayoutY) {
		Ball.defLayoutY = defLayoutY;
	}
}
