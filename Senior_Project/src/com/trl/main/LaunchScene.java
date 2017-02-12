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

	public LaunchScene(VBox root, double width, double height) {
		super(root, width, height);
		
		// Set the loading scene title label
		Label label = new Label("Welcome to Games");
		label.setFont(Font.font("Verdana", 25));
		label.setTextFill(Color.WHITE);
		
		// Set the loading scene progress indicator
		ProgressIndicator indicator = new ProgressIndicator();
		indicator.setProgress(-0.1);
		indicator.setMaxSize(50, 50);
		indicator.setLayoutY(100);
		
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		root.getChildren().add(indicator);
		root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		
	}

}