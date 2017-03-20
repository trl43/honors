package com.trl.tictactoe;

import com.trl.main.GameApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends GameApp {
	
	public TicTacToe(Stage primary) {
		super(primary, new GridPane(), primary.getWidth(), primary.getHeight());
	}
	
	
	
	public void play() {
		checkForWin();
		
	}
	
	
	
	private boolean checkForWin() {
		return false;
	}
	
	
	
	@Override
	public VBox getOverviewArea() {
		VBox layout = new VBox();
		
		Button b = new Button("Play!");
		b.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	if(gridpane.getChildren().get(1) instanceof TilePane) {
		    		for(Node n : ((TilePane)gridpane.getChildren().get(1)).getChildren()) {
	    				n.setDisable(false);
	    			}
		    	}else {
		    		throw new ClassCastException("The play area is not a TilePane and it should be in this case.");
		    	}
		    }
		});
		
		layout.getChildren().add(b);
		
		return layout;
	}
	
	
	
	@Override
	public TilePane getPlayArea(Stage primary) {
		Button b1 = new Button("");
		b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b1.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b2 = new Button("");
		b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b2.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b3 = new Button("");
		b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b3.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b4 = new Button("");
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b4.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b5 = new Button("");
		b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b6 = new Button("");
		b6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b6.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b7 = new Button("");
		b7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b7.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b8 = new Button("");
		b8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b8.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		Button b9 = new Button("");
		b9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b9.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	
		    }
		});
		
		
		TilePane layout = new TilePane();
		layout.setOrientation(Orientation.HORIZONTAL);
		layout.setAlignment(Pos.CENTER);
		layout.setPrefColumns(3);
		layout.setPrefRows(3);
		layout.setPrefTileWidth((primary.getWidth()*(gridpane.getColumnConstraints().get(1).getPercentWidth()/100))*0.329);
		layout.setPrefTileHeight(primary.getHeight()*0.32);
		layout.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9);
		for(Node n : layout.getChildren()) {
			n.setDisable(true);
		}
		
		return layout;
	}
	
}
