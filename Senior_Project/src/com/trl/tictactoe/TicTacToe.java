package com.trl.tictactoe;

import java.util.HashMap;

import com.trl.main.GameApp;
import com.trl.main.HomeScene;
import com.trl.main.Main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class TicTacToe extends GameApp {
	
	private TextArea messagesText;
	private Label choiceLabel;
	private ComboBox<String> choiceCombo;
	private Button playButton;
	private Button playAgainButton;
	private String player1 = "";
	private String player2 = "";
	private boolean isPlayer1Turn = true;
	private HashMap<String, String> buttonValues = new HashMap<String, String>();
	
	
	public TicTacToe() {
		super(Main.currentStage, new GridPane(), Main.currentStage.getWidth(), Main.currentStage.getHeight());
	}
	
	
	
	private boolean checkForWin() {
		if(buttonValues.get("1") != null && !buttonValues.get("1").isEmpty() && buttonValues.get("1").equals(buttonValues.get("2")) && buttonValues.get("1").equals(buttonValues.get("3"))) {
			messagesText.appendText("\n"+buttonValues.get("1")+" wins!!!");
			return true;
		}
		else if(buttonValues.get("4") != null && !buttonValues.get("4").isEmpty() && buttonValues.get("4").equals(buttonValues.get("5")) && buttonValues.get("4").equals(buttonValues.get("6"))) {
			messagesText.appendText("\n"+buttonValues.get("4")+" wins!!!");
			return true;
		}
		else if(buttonValues.get("7") != null && !buttonValues.get("7").isEmpty() && buttonValues.get("7").equals(buttonValues.get("8")) && buttonValues.get("7").equals(buttonValues.get("9"))) {
			messagesText.appendText("\n"+buttonValues.get("7")+" wins!!!");
			return true;
		}
		else if(buttonValues.get("1") != null && !buttonValues.get("1").isEmpty() && buttonValues.get("1").equals(buttonValues.get("4")) && buttonValues.get("1").equals(buttonValues.get("7"))) {
			messagesText.appendText("\n"+buttonValues.get("1")+" wins!!!");
			return true;
		}
		else if(buttonValues.get("2") != null && !buttonValues.get("2").isEmpty() && buttonValues.get("2").equals(buttonValues.get("5")) && buttonValues.get("2").equals(buttonValues.get("8"))) {
			messagesText.appendText("\n"+buttonValues.get("2")+" wins!!!");
			return true;
		}
		else if(buttonValues.get("3") != null && !buttonValues.get("3").isEmpty() && buttonValues.get("3").equals(buttonValues.get("6")) && buttonValues.get("3").equals(buttonValues.get("9"))) {
			messagesText.appendText("\n"+buttonValues.get("3")+" wins!!!");
			return true;
		}
		else if(buttonValues.get("1") != null && !buttonValues.get("1").isEmpty() && buttonValues.get("1").equals(buttonValues.get("5")) && buttonValues.get("1").equals(buttonValues.get("9"))) {
			messagesText.appendText("\n"+buttonValues.get("1")+" wins!!!");
			return true;
		}
		else if(buttonValues.get("3") != null && !buttonValues.get("3").isEmpty() && buttonValues.get("3").equals(buttonValues.get("5")) && buttonValues.get("3").equals(buttonValues.get("7"))) {
			messagesText.appendText("\n"+buttonValues.get("3")+" wins!!!");
			return true;
		}
		
		return false;
	}
	
	
	
	@Override
	public VBox getOverviewArea() {
		VBox layout = new VBox(5);
		
		Button returnButton = new Button("Return Home");
		returnButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		returnButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	Main.currentStage.setScene(new HomeScene());
		    }
		});
		
		Pane spacer1 = new Pane();
		spacer1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		spacer1.setPrefHeight(30);
		
		Label instructionsLabel = new Label("Instructions:");
		instructionsLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		TextArea instructionsText = new TextArea("First player to get 3 in a row wins, vertically, horizontally, or diagonally.");
		instructionsText.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		instructionsText.setPrefHeight(40);
		instructionsText.setEditable(false);
		instructionsText.setWrapText(true);
		
		Pane spacer2 = new Pane();
		spacer2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		spacer2.setPrefHeight(30);
		
		Label messagesLabel = new Label("Messages:");
		messagesLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		messagesText = new TextArea("Player 1, choose below to play as X's or O's");
		messagesText.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		messagesText.setPrefHeight(40);
		messagesText.setEditable(false);
		messagesText.setWrapText(true);
		
		choiceLabel = new Label("Player 1:");
		choiceLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		choiceCombo = new ComboBox<String>();
		choiceCombo.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		choiceCombo.getItems().addAll("X", "O");
		choiceCombo.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	playButton.setDisable(false);
		    }
		});
		
		Pane spacer3 = new Pane();
		spacer3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		spacer3.setPrefHeight(30);
		
		playButton = new Button("Play!");
		playButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		playButton.setDisable(true);
		playButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
	    		player1 = choiceCombo.getValue();
	    		player2 = choiceCombo.getValue().equalsIgnoreCase("X") ? "O" : "X";
	    		messagesText.appendText("\nPlayer 1: "+player1+"    Player 2: "+player2);
	    		choiceLabel.setVisible(false);
	    		choiceCombo.setVisible(false);
	    		playButton.setVisible(false);
		    	if(baseGridLayout.getChildren().get(1) instanceof TilePane) {	
		    		for(Node n : ((TilePane)baseGridLayout.getChildren().get(1)).getChildren()) {
	    				n.setDisable(false);
	    			}
		    	}else {
		    		throw new ClassCastException("The play area is not a TilePane and it should be in this case.");
		    	}
		    }
		});
		
		playAgainButton = new Button("Play Again!");
		playAgainButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		playAgainButton.setVisible(false);
		playAgainButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	TicTacToe G = new TicTacToe();
		    	Main.currentStage.setScene(G);
		    }
		});
		
		layout.getChildren().addAll(returnButton, spacer1, instructionsLabel, instructionsText, spacer2, messagesLabel, messagesText, choiceLabel, choiceCombo, spacer3, playButton, playAgainButton);
		
		return layout;
	}
	
	
	
	@Override
	public TilePane getPlayArea() {
		
		EventHandler<ActionEvent> buttonPressed = new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	if(!(e.getSource() instanceof Button)) {
		    		return;
		    	}
		    	
		    	Button tempButton = (Button)e.getSource();
		    	
		    	tempButton.setDisable(true);
		    	
		    	if(isPlayer1Turn) {
		    		tempButton.setText(player1);
		    		buttonValues.put(tempButton.getId(), player1);
		    	}else {
		    		tempButton.setText(player2);
		    		buttonValues.put(tempButton.getId(), player2);
		    	}
		    	
		    	isPlayer1Turn = !isPlayer1Turn;
		    	
		    	if(checkForWin()) {
		    		if(baseGridLayout.getChildren().get(1) instanceof TilePane) {	
			    		for(Node n : ((TilePane)baseGridLayout.getChildren().get(1)).getChildren()) {
		    				n.setDisable(true);
		    			}
			    	}else {
			    		throw new ClassCastException("The play area is not a TilePane and it should be in this case.");
			    	}
		    		playAgainButton.setVisible(true);
		    	}
		    }
		};
		
		
		Button b1 = new Button("");
		b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b1.setOnAction(buttonPressed);
		b1.setId("1");
		
		Button b2 = new Button("");
		b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b2.setOnAction(buttonPressed);
		b2.setId("2");
		
		Button b3 = new Button("");
		b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b3.setOnAction(buttonPressed);
		b3.setId("3");
		
		Button b4 = new Button("");
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b4.setOnAction(buttonPressed);
		b4.setId("4");
		
		Button b5 = new Button("");
		b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5.setOnAction(buttonPressed);
		b5.setId("5");
		
		Button b6 = new Button("");
		b6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b6.setOnAction(buttonPressed);
		b6.setId("6");
		
		Button b7 = new Button("");
		b7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b7.setOnAction(buttonPressed);
		b7.setId("7");
		
		Button b8 = new Button("");
		b8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b8.setOnAction(buttonPressed);
		b8.setId("8");
		
		Button b9 = new Button("");
		b9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b9.setOnAction(buttonPressed);
		b9.setId("9");
		
		
		TilePane layout = new TilePane();
		layout.setOrientation(Orientation.HORIZONTAL);
		layout.setAlignment(Pos.CENTER);
		layout.setPrefColumns(3);
		layout.setPrefRows(3);
		layout.setPrefTileWidth((Main.currentStage.getWidth()*(baseGridLayout.getColumnConstraints().get(1).getPercentWidth()/100))*0.329);
		layout.setPrefTileHeight(Main.currentStage.getHeight()*0.32);
		layout.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9);
		
		for(Node n : layout.getChildren()) {
			n.setDisable(true);
		}
		
		return layout;
	}
	
}
