package com.app.stage;

import java.io.IOException;

import com.app.movement.Movement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class Main extends Application {
	private static double tablePosX = 1;

	@Override
	public void start(Stage primaryStage) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("MainRoot.fxml"));
		Scene scene = new Scene(root);

		if (Controller.table != null) {
			tablePosX = Controller.table.getTable().getLayoutX();
		}
		scene.setOnKeyPressed((e) -> {
			if (e.getCode() == KeyCode.LEFT) {
				if (Controller.table != null && (Controller.table.getTable().getBoundsInParent().getMinX() != 3.0)) {
					Controller.table.getTable().setLayoutX(tablePosX -= 5.0);
				}
			} else if (e.getCode() == KeyCode.RIGHT) {
				if (Controller.table != null && ((int)Controller.table.getTable().getBoundsInParent().getMinX()) != 527) {
					Controller.table.getTable().setLayoutX(tablePosX += 5.0);
				}
			}
		});

		primaryStage.setOnCloseRequest((e) -> {
			Controller.clockTimer.cancel();
			Movement.getBallMove().cancel();
			if (Controller.ballObserveTimer != null) {
				Controller.ballObserveTimer.cancel();
			} else if (Controller.moveStarterTimer != null) {
				Controller.moveStarterTimer.cancel();
			}
		});

		primaryStage.setTitle("BrickBreaker");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
