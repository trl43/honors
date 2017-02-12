package com.trl.main;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class HomeScene extends Scene {

	public HomeScene(TilePane root, double width, double height) {
		super(root, width, height);
		
		root.setPrefColumns(3);
		root.setPrefRows(3);
		
		Button b1 = new Button("1");
		b1.setPrefWidth(root.getWidth()*0.32);
		b1.setPrefHeight(root.getHeight()*0.32);
		
		Button b2 = new Button("2");
		b2.setPrefWidth(root.getWidth()*0.32);
		b2.setPrefHeight(root.getHeight()*0.32);
		
		Button b3 = new Button("3");
		b3.setPrefWidth(root.getWidth()*0.32);
		b3.setPrefHeight(root.getHeight()*0.32);
		
		Button b4 = new Button("4");
		b4.setPrefWidth(root.getWidth()*0.32);
		b4.setPrefHeight(root.getHeight()*0.32);
		
		Button b5 = new Button("5");
		b5.setPrefWidth(root.getWidth()*0.32);
		b5.setPrefHeight(root.getHeight()*0.32);
		
		Button b6 = new Button("6");
		b6.setPrefWidth(root.getWidth()*0.32);
		b6.setPrefHeight(root.getHeight()*0.32);
		
		Button b7 = new Button("7");
		b7.setPrefWidth(root.getWidth()*0.32);
		b7.setPrefHeight(root.getHeight()*0.32);
		
		Button b8 = new Button("8");
		b8.setPrefWidth(root.getWidth()*0.32);
		b8.setPrefHeight(root.getHeight()*0.32);
		
		Button b9 = new Button("9");
		b9.setPrefWidth(root.getWidth()*0.32);
		b9.setPrefHeight(root.getHeight()*0.32);
		
		
		root.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9);
	}

}
