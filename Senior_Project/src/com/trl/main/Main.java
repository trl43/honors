package com.trl.main;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	public static Stage currentStage;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		currentStage = primaryStage;
		primaryStage.setTitle("Game Collection");
		primaryStage.centerOnScreen();
		primaryStage.setResizable(false);
		primaryStage.setScene(new LaunchScene());
		primaryStage.show();
		
		new Timeline(new KeyFrame(Duration.millis(1000), ae -> showHomeScene(primaryStage))).play();
	}
	
	
	
	private void showHomeScene(Stage primaryStage) {
		primaryStage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
		primaryStage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
		primaryStage.setResizable(true);
		primaryStage.centerOnScreen();
//		primaryStage.setFullScreen(true);
		primaryStage.setScene(new HomeScene());
	}
	
}
