package com.trl.main;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Game Collection");
		primaryStage.centerOnScreen();
		primaryStage.setResizable(false);
		primaryStage.setScene(new LaunchScene(new VBox(60), 400, 300));
		primaryStage.show();
		
		new Timeline(new KeyFrame(Duration.millis(1000), ae -> showHomeScene(primaryStage))).play();
	}
	
	
	
	private void showHomeScene(Stage primaryStage) {
		primaryStage.setScene(new HomeScene(new TilePane() ,600, 550));
		primaryStage.setResizable(true);
	}
	
}


