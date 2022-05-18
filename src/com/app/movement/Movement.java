package com.app.movement;

import java.util.Timer;
import java.util.TimerTask;

import com.app.stage.Ball;

public class Movement {
	private long speed;
	private static double X;
	private static double Y;
	private double layoutX = Ball.getDefLayoutX();
	private double layoutY = Ball.getDefLayoutY();
	private static Timer ballMove;

	public Movement(Ball ball) {
		if (speed == 0) {
			speed = 60;
		}
		setBallMove(new Timer());

		getBallMove().schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ball.getBall().setLayoutX(layoutX += X);
				ball.getBall().setLayoutY(layoutY += Y);
			}
		}, speed, speed);
	}

	public void setLayoutX(double layoutX) {
		X = layoutX;
	}

	public void setLayoutY(double layoutY) {
		Y = layoutY;
	}

	public void changeSpeed(long speed) {
		this.speed = speed;
	}

	public static Timer getBallMove() {
		return ballMove;
	}

	private static void setBallMove(Timer ballMove) {
		Movement.ballMove = ballMove;
	}
}
