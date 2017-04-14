package com.trl.main;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LaunchScene extends Scene {

	private final static double width = 400;
	private final static double height = 300;
	private static VBox layout = new VBox(40);
	
	public LaunchScene() {
		super(layout, width, height);
		
		// Set the loading scene title label
		Label title = new Label("Game Collection");
		title.setFont(Font.font("Verdana", 25));
		title.setTextFill(Color.WHITE);
		
		// Set the loading scene version label
		Label version = new Label("Version: 1.0");
		version.setFont(Font.font("Verdana", 15));
		version.setTextFill(Color.WHITE);
		
		// Set the loading scene creator label
		Label creator = new Label("Creator: Todd Locker");
		creator.setFont(Font.font("Verdana", 15));
		creator.setTextFill(Color.WHITE);
		
		// Set the loading scene progress indicator
		ProgressIndicator indicator = new ProgressIndicator();
		indicator.setProgress(-0.1);
		indicator.setMaxSize(50, 50);
		
		layout.setAlignment(Pos.CENTER);
		layout.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		layout.getChildren().add(title);
		layout.getChildren().add(version);
		layout.getChildren().add(creator);
		layout.getChildren().add(indicator);
	}

}