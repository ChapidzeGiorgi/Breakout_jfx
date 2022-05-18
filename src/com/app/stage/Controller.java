package com.app.stage;

import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import com.app.movement.Movement;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class Controller implements Initializable {
	protected static Timer moveStarterTimer;
	private static double X = 5.0;
	private static double Y = 6.0;
	private long speed;
	private int score;
	protected static Timer ballObserveTimer;
	private Movement movement;
	private Ball ball;
	protected static Table table;
	protected static Timer clockTimer;
	@FXML
	private AnchorPane mainLayout;
	@FXML
	private Label timeLabel;
	@FXML
	private Label scoreLabel;
	@FXML
	private Label lossLabel;
	@FXML
	private Rectangle rec_1;
	@FXML
	private Rectangle rec_2;
	@FXML
	private Rectangle rec_3;
	@FXML
	private Rectangle rec_4;
	@FXML
	private Rectangle rec_5;
	@FXML
	private Rectangle rec_6;
	@FXML
	private Rectangle rec_7;
	@FXML
	private Rectangle rec_8;
	@FXML
	private Rectangle rec_9;
	@FXML
	private Rectangle rec_10;
	@FXML
	private Rectangle rec_11;
	@FXML
	private Rectangle rec_12;
	@FXML
	private Rectangle rec_13;
	@FXML
	private Rectangle rec_14;
	@FXML
	private Rectangle rec_15;
	@FXML
	private Rectangle rec_16;
	@FXML
	private Rectangle rec_17;
	@FXML
	private Rectangle rec_18;
	@FXML
	private Rectangle rec_19;
	@FXML
	private Rectangle rec_20;
	@FXML
	private Rectangle rec_21;
	@FXML
	private Rectangle rec_22;
	@FXML
	private Rectangle rec_23;
	@FXML
	private Rectangle rec_24;
	@FXML
	private Rectangle rec_25;
	@FXML
	private Rectangle rec_26;
	@FXML
	private Rectangle rec_27;
	@FXML
	private Rectangle rec_28;
	@FXML
	private Rectangle rec_29;
	@FXML
	private Rectangle rec_30;
	@FXML
	private Rectangle rec_31;
	@FXML
	private Rectangle rec_32;
	@FXML
	private Rectangle rec_33;
	@FXML
	private Rectangle rec_34;
	@FXML
	private Rectangle rec_35;
	@FXML
	private Rectangle rec_36;
	@FXML
	private Rectangle rec_37;
	@FXML
	private Rectangle rec_38;
	@FXML
	private Rectangle rec_39;
	@FXML
	private Rectangle rec_40;
	@FXML
	private Rectangle rec_41;
	@FXML
	private Rectangle rec_42;
	@FXML
	private Rectangle rec_43;
	@FXML
	private Rectangle rec_44;
	@FXML
	private Rectangle rec_45;
	@FXML
	private Rectangle rec_46;
	@FXML
	private Rectangle rec_47;
	@FXML
	private Rectangle rec_48;
	@FXML
	private Rectangle rec_49;
	@FXML
	private Rectangle rec_50;
	@FXML
	private Rectangle rec_51;
	@FXML
	private Rectangle rec_52;
	@FXML
	private Rectangle rec_53;
	@FXML
	private Rectangle rec_54;
	@FXML
	private Rectangle rec_55;
	@FXML
	private Rectangle rec_56;
	@FXML
	private Rectangle rec_57;
	@FXML
	private Rectangle rec_58;
	@FXML
	private Rectangle rec_59;
	@FXML
	private Rectangle rec_60;
	@FXML
	private Rectangle rec_61;
	@FXML
	private Rectangle rec_62;
	@FXML
	private Rectangle rec_63;
	@FXML
	private Rectangle rec_64;
	@FXML
	private Rectangle rec_65;
	@FXML
	private Rectangle rec_66;
	@FXML
	private Rectangle rec_67;
	@FXML
	private Rectangle rec_68;
	@FXML
	private Rectangle rec_69;
	@FXML
	private Rectangle rec_70;
	@FXML
	private Rectangle rec_71;
	@FXML
	private Rectangle rec_72;
	@FXML
	private Rectangle rec_73;
	@FXML
	private Rectangle rec_74;
	@FXML
	private Rectangle rec_75;
	@FXML
	private Rectangle rec_76;
	@FXML
	private Rectangle rec_77;
	@FXML
	private Rectangle rec_78;
	@FXML
	private Rectangle rec_79;
	@FXML
	private Rectangle rec_80;
	@FXML
	private Rectangle rec_81;
	@FXML
	private Rectangle rec_82;
	@FXML
	private Rectangle rec_83;
	@FXML
	private Rectangle rec_84;
	@FXML
	private Rectangle rec_85;
	@FXML
	private Rectangle rec_86;
	@FXML
	private Rectangle rec_87;
	@FXML
	private Label winLabel;

	private LinkedList<Rectangle> bricksList;

	protected static double layoutHeight = 400.0;
	protected static double layoutWidth = 600.0;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		updateTime();

		ball = new Ball();
		mainLayout.getChildren().add(ball.getBall());

		table = new Table();
		mainLayout.getChildren().add(table.getTable());

		movement = new Movement(ball);
		initializeList();
		observeBallMovement();
	}

	private void initializeList() {
		bricksList = new LinkedList<>(Arrays.asList(rec_1, rec_2, rec_3, rec_4, rec_5, rec_6, rec_7, rec_8, rec_9,
				rec_10, rec_11, rec_12, rec_13, rec_14, rec_15, rec_16, rec_17, rec_18, rec_19, rec_20, rec_21, rec_22,
				rec_23, rec_24, rec_25, rec_26, rec_27, rec_28, rec_29, rec_30, rec_31, rec_32, rec_33, rec_34, rec_35,
				rec_37, rec_38, rec_39, rec_40, rec_41, rec_42, rec_43, rec_44, rec_45, rec_46, rec_47, rec_48, rec_49,
				rec_50, rec_51, rec_52, rec_53, rec_54, rec_55, rec_56, rec_57, rec_58, rec_59, rec_60, rec_61,
				rec_62, rec_63, rec_64, rec_65, rec_66, rec_67, rec_68, rec_69, rec_70, rec_71, rec_72, rec_73, rec_74,
				rec_75, rec_76, rec_77, rec_78, rec_79, rec_80, rec_81, rec_82, rec_83, rec_84, rec_85, rec_86,
				rec_87));
	}

	public void update(String time) {
		// TODO Auto-generated method stub
		timeLabel.setText(time);
	}

	private void updateTime() {
		clockTimer = new Timer();

		var second = new AtomicInteger();
		second.set(0);
		var minute = new AtomicInteger();
		minute.set(0);
		var hour = new AtomicInteger();
		hour.set(0);
		clockTimer.schedule(new TimerTask() {

			@Override
			public void run() {
				Platform.runLater(() -> {
					if (second.get() == 60) {
						minute.incrementAndGet();
						second.set(0);
					} else if (minute.get() == 60) {
						hour.incrementAndGet();
						minute.set(0);
					}
					second.incrementAndGet();

					var secondStr = String.format("%02d", second.get());
					var minuteStr = String.format("%02d", minute.get());
					var hourStr = String.format("%02d", hour.get());

					var sb = new StringBuilder();
					sb.append(hourStr + ":");
					sb.append(minuteStr + ":");
					sb.append(secondStr);

					timeLabel.setText(sb.toString());
				});
			}
		}, 1000, 1000);
	}

	private void observeBallMovement() {
		moveStarterTimer = new Timer();
		var tBall = ball.getBall();
		var tTable = table.getTable();
		moveStarterTimer.schedule(new TimerTask() {

			@Override
			public void run() {
				if (tBall.getLayoutY() > 387) {
					clockTimer.cancel();
					Movement.getBallMove().cancel();
					moveStarterTimer.cancel();
					Platform.runLater(() -> {
						mainLayout.getChildren().remove(ball.getBall());
						lossLabel.setText("Game Lost!");
					});
				}
				movement.setLayoutY(4.0);
				if (tTable.getBoundsInParent().intersects(tBall.getBoundsInParent())) {
					moveStarterTimer.cancel();
				}
				try {
					moveStarterTimer.schedule(new TimerTask() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
						}
					}, 1, 1);
				} catch (Exception e) {
					changeSpeed(30);
					if (speed == 0) {
						speed = 60;
					}
					var direction = new AtomicReference<String>();
					direction.set("");
					var isCentric = new AtomicBoolean();
					ballObserveTimer = new Timer();
					ballObserveTimer.schedule(new TimerTask() {

						@Override
						public void run() {
							checkIfBallTouchesBrick();
							if (tBall.getLayoutY() > 387) {
								clockTimer.cancel();
								Movement.getBallMove().cancel();
								ballObserveTimer.cancel();
								Platform.runLater(() -> {
									mainLayout.getChildren().remove(ball.getBall());
									lossLabel.setText("Game Lost!");
								});
							} else if (tBall.getBoundsInParent().intersects(table.getTable().getBoundsInParent())) {
								double tableCenter = (tTable.getBoundsInParent().getMinX() + Table.tableWidth / 2.0)
										+ Table.tableLength / 2.0;
								if (tBall.getLayoutX() >= (tableCenter - 5.0)
										&& tBall.getLayoutX() <= (tableCenter + 5.0)) {
									isCentric.set(true);
									movement.setLayoutY(-Y);
									movement.setLayoutX(0);
								} else if (tBall.getLayoutX() < (tableCenter - 5.0)) {
									direction.set("Left");
									movement.setLayoutX(-X);
									movement.setLayoutY(-Y);
								} else if (tBall.getLayoutX() > (tableCenter + 5.0)) {
									direction.set("Right");
									movement.setLayoutX(X);
									movement.setLayoutY(-Y);
								}
							} else if (direction.get().equals("Left")) {
								for (var e : bricksList) {
									if (e != null) {
										if (e.getBoundsInParent().intersects(tBall.getBoundsInParent())) {
											movement.setLayoutX(X);
											movement.setLayoutY(Y);

											if (tBall.getLayoutX() <= 7.0) {
												movement.setLayoutX(X);
												movement.setLayoutY(Y);
											} else if (tBall.getLayoutY() < 28) {
												movement.setLayoutX(-X);
												movement.setLayoutY(Y);
											}
										}
									}
								}
								if (tBall.getLayoutX() <= 7.0) {
									movement.setLayoutX(X);
									movement.setLayoutY(-Y);
								} else if (tBall.getLayoutY() < 28) {
									movement.setLayoutX(X);
									movement.setLayoutY(Y);
								} else if (tBall.getLayoutX() >= 581.0) {
									movement.setLayoutX(-X);
									movement.setLayoutY(Y);
								}
							} else if (direction.get().equals("Right")) {
								bricksList.forEach((e) -> {
									if (e != null) {
										if (e.getBoundsInParent().intersects(tBall.getBoundsInParent())) {
											movement.setLayoutX(-X);
											movement.setLayoutY(Y);

											if (tBall.getLayoutX() <= 7.0) {
												movement.setLayoutX(X);
												movement.setLayoutY(-Y);
											} else if (tBall.getLayoutY() < 28) {
												movement.setLayoutX(X);
												movement.setLayoutY(Y);
											}
										}
									}
								});
								if (tBall.getLayoutX() <= 7.0) {
									movement.setLayoutX(X);
									movement.setLayoutY(Y);
								} else if (tBall.getLayoutY() < 28) {
									movement.setLayoutX(-X);
									movement.setLayoutY(Y);
								} else if (tBall.getLayoutX() >= 581.0) {
									movement.setLayoutX(-X);
									movement.setLayoutY(-Y);
								}
							} else if (isCentric.get()) {
								bricksList.forEach((e) -> {
									if (e != null) {
										if (e.getBoundsInParent().intersects(tBall.getBoundsInParent())) {
											movement.setLayoutY(Y);
										}
									}
								});
								if (tBall.getLayoutY() < 28) {
									movement.setLayoutY(Y);
								}
							}

						}
					}, speed, speed);
				}
			}
		}, 100, 100);
	}

	private void checkIfBallTouchesBrick() {
		Iterator<Rectangle> iterator = bricksList.iterator();
		Platform.runLater(() -> {
			if (score == 85) {
				winLabel.setText("Vistory!");
				clockTimer.cancel();
				ballObserveTimer.cancel();
				Movement.getBallMove().cancel();
			}
			while (iterator.hasNext()) {
				var e = iterator.next();
				if (e != null) {
					if (ball.getBall().getBoundsInParent().intersects(e.getBoundsInParent())) {
						mainLayout.getChildren().remove(e);
						score++;
						scoreLabel.setText(String.valueOf(score));
						iterator.remove();
					}
				}
			}
		});
	}

	protected void changeSpeed(long speed) {
		this.speed = speed;
		movement.changeSpeed(speed);
	}
}
