module BBgame_jfx {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens com.app.stage to javafx.graphics, javafx.fxml;
}
