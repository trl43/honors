package com.trl.main;

import com.trl.tictactoe.TicTacToe;

import ConnectFour.ConnectFour;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class HomeScene extends GameApp {
	
	public HomeScene() {
		super(Main.currentStage, new GridPane(), Main.currentStage.getWidth(), Main.currentStage.getHeight());
	}
	
	
	
	@Override
	public VBox getOverviewArea() {
		VBox layout = new VBox();
		
		Button b = new Button("Welcome Home!");
		b.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b.setDisable(true);
		b.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	System.out.println("This is home!");
		    }
		});
		
		Pane spacer1 = new Pane();
		spacer1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		spacer1.setPrefHeight(40);
		
		Label messagesLabel1 = new Label("Messages:");
		messagesLabel1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		TextArea messagesText = new TextArea("Select a game to begin playing!");
		messagesText.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		messagesText.setPrefHeight(100);
		messagesText.setEditable(false);
		messagesText.setWrapText(true);
		
		Pane spacer2 = new Pane();
		spacer2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		spacer2.setPrefHeight(40);
		
		Label messagesLabel2 = new Label("HighScore: 0");
		messagesLabel2.setStyle("-fx-font: 20 arial;");
		messagesLabel2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		Pane spacer3 = new Pane();
		spacer3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		spacer3.setPrefHeight(40);
		
		Button importGame = new Button("Import Game");
		importGame.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		layout.getChildren().addAll(b, spacer1, messagesLabel1, messagesText, spacer2, messagesLabel2, spacer3, importGame);
		
		return layout;
	}
	
	
	
	@Override
	public TilePane getPlayArea() {
		Button b1 = new Button("Tic-Tac-Toe");
		b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b1.setStyle("-fx-font: 40 arial;");
		b1.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	TicTacToe G = new TicTacToe();
		    	Main.currentStage.setScene(G);
		    }
		});
		
		Button b2 = new Button("Maze Game");
		b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b2.setStyle("-fx-font: 40 arial;");
		b2.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	try {
		    		// Add game call here
		    		Main.currentStage.hide();
				} finally {
					Main.currentStage.show();
				}
		    }
		});
		
		Button b3 = new Button("Hangman");
		b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b3.setStyle("-fx-font: 40 arial;");
		b3.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	// Add game call here
		    }
		});
		
		Button b4 = new Button("Concentration");
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b4.setStyle("-fx-font: 40 arial;");
		b4.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	// Add game call here
		    }
		});
		
		Button b5 = new Button("Connect Four");
		b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5.setStyle("-fx-font: 40 arial;");
		b5.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	ConnectFour G = new ConnectFour();
		    	Main.currentStage.setScene(G);
		    }
		});
		
		Button b6 = new Button("Game 6");
		b6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b6.setStyle("-fx-font: 40 arial;");
		b6.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	// Add game call here
		    }
		});
		
		Button b7 = new Button("Pinball");
		b7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b7.setStyle("-fx-font: 40 arial;");
		b7.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	try {
		    		// Add game call here
//		    		Main.currentStage.hide();
				} finally {
					Main.currentStage.show();
				}
		    }
		});
		
		Button b8 = new Button("Shooter");
		b8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b8.setStyle("-fx-font: 40 arial;");
		b8.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	try {
		    		// Add game call here
//		    		Main.currentStage.hide();
				} finally {
					Main.currentStage.show();
				}
		    }
		});
		
		Button b9 = new Button("Translate");
		b9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b9.setStyle("-fx-font: 40 arial;");
		b9.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	try {
		    		// Add game call here
//		    		Main.currentStage.hide();
				} finally {
					Main.currentStage.show();
				}
		    }
		});
		
		
		TilePane layout = new TilePane();
		layout.setOrientation(Orientation.HORIZONTAL);
		layout.setAlignment(Pos.CENTER);
		layout.setPrefColumns(3);
		layout.setPrefRows(3);
		layout.setPrefTileWidth((Main.currentStage.getWidth()*(baseGridLayout.getColumnConstraints().get(1).getPercentWidth()/100))*0.329);
		layout.setPrefTileHeight(Main.currentStage.getHeight()*0.32);
		layout.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9);
		
		return layout;
	}
	
}
