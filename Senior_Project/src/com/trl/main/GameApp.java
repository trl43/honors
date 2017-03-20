package com.trl.main;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public abstract class GameApp extends Scene {
	
	protected GridPane gridpane;
	
	public GameApp(Stage primary, GridPane root, double width, double height) {
		super(root, width, height);
		
		// These columns in the gridpane create the "overview" and "play" sections
		ColumnConstraints column1 = new ColumnConstraints();
	    column1.setPercentWidth(25);
	    ColumnConstraints column2 = new ColumnConstraints();
	    column2.setPercentWidth(75);
	    root.getColumnConstraints().addAll(column1, column2);
		root.setAlignment(Pos.CENTER);
		gridpane = root;
		
		Pane overviewArea = getOverviewArea();
		Pane playArea = getPlayArea(primary);
		
		gridpane.add(overviewArea, 0, 0);
		gridpane.add(playArea, 1, 0);
	}
	
	
	public abstract Pane getOverviewArea();
	
	
	public abstract Pane getPlayArea(Stage primary);
}
