package com.trl.main;

import com.trl.tictactoe.TicTacToe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class HomeScene extends GameApp {
	
	public HomeScene() {
		super(Main.currentStage, new GridPane(), Main.currentStage.getWidth(), Main.currentStage.getHeight());
	}
	
	
	
	@Override
	public VBox getOverviewArea() {
		VBox layout = new VBox();
		
		Button b = new Button("Return Home");
		b.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	System.out.println("This is home!");
		    }
		});
		
		layout.getChildren().add(b);
		
		return layout;
	}
	
	
	
	@Override
	public TilePane getPlayArea() {
		Button b1 = new Button("Tic-Tac-Toe");
		b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b1.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	TicTacToe G = new TicTacToe();
		    	Main.currentStage.setScene(G);
		    }
		});
		
		Button b2 = new Button("2");
		b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b2.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
		    }
		});
		
		Button b3 = new Button("3");
		b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b3.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
		    }
		});
		
		Button b4 = new Button("4");
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b4.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
		    }
		});
		
		Button b5 = new Button("5");
		b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
		    }
		});
		
		Button b6 = new Button("6");
		b6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b6.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
		    }
		});
		
		Button b7 = new Button("7");
		b7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b7.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
		    }
		});
		
		Button b8 = new Button("8");
		b8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b8.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
		    }
		});
		
		Button b9 = new Button("9");
		b9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b9.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
//		    	TicTacToe G = new TicTacToe();
//		        primary.setScene(G);
//		        G.play();
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
