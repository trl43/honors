package ConnectFour;

import com.trl.main.GameApp;
import com.trl.main.HomeScene;
import com.trl.main.Main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ConnectFour extends GameApp {
	
	private TextArea messagesText;
	private Label choiceLabel;
	private ComboBox<String> choiceCombo;
	private Button playButton;
	private Button playAgainButton;
	private String player1 = "";
	private String player2 = "";
	private boolean isPlayer1Turn = true;
	
	
	
	public ConnectFour() {
		super(Main.currentStage, new GridPane(), Main.currentStage.getWidth(), Main.currentStage.getHeight());
	}
	
	
	
	@Override
	public VBox getOverviewArea() {
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
		
		TextArea instructionsText = new TextArea("First player to get 4 in a row wins, vertically, horizontally, or diagonally.");
		instructionsText.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		instructionsText.setPrefHeight(40);
		instructionsText.setEditable(false);
		instructionsText.setWrapText(true);
		
		Pane spacer2 = new Pane();
		spacer2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		spacer2.setPrefHeight(30);
		
		Label messagesLabel = new Label("Messages:");
		messagesLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		messagesText = new TextArea("Player 1, choose below to play as red or black.");
		messagesText.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		messagesText.setPrefHeight(40);
		messagesText.setEditable(false);
		messagesText.setWrapText(true);
		
		choiceLabel = new Label("Player 1:");
		choiceLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		choiceCombo = new ComboBox<String>();
		choiceCombo.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		choiceCombo.getItems().addAll("red", "black");
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
	    		player2 = choiceCombo.getValue().equalsIgnoreCase("red") ? "black" : "red";
	    		messagesText.appendText("\nPlayer 1: "+player1+"    Player 2: "+player2);
		    }
		});
		
		playAgainButton = new Button("Play Again!");
		playAgainButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		playAgainButton.setVisible(false);
		playAgainButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
			public void handle(ActionEvent e) {
		    	ConnectFour G = new ConnectFour();
		    	Main.currentStage.setScene(G);
		    }
		});
		
		VBox layout = new VBox(5);
		layout.getChildren().addAll(returnButton, spacer1, instructionsLabel, instructionsText, spacer2, messagesLabel, messagesText, choiceLabel, choiceCombo, spacer3, playButton, playAgainButton);
		
		return layout;
	}
	
	
	
	@Override
	public BorderPane getPlayArea() {
		BorderPane layout = new BorderPane();
		TilePane tp = new TilePane();
		tp.setOrientation(Orientation.HORIZONTAL);
		tp.setAlignment(Pos.CENTER);
		tp.setPrefColumns(7);
		tp.setPrefRows(6);
		tp.setPrefTileWidth(getWidth()*0.1);
		tp.setPrefTileHeight(getHeight()*0.16);
		tp.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
		for(int i = 0; i<42; ++i) {
			Circle circle = new Circle(tp.getTileHeight()/3, Color.WHITE);
			tp.getChildren().add(circle);
		}
		
		
		Pane leftSpace = new Pane();
		leftSpace.setPrefWidth(40);
		
		Pane rightSpace = new Pane();
		rightSpace.setPrefWidth(40);
		
		Pane topSpace = new Pane();
		topSpace.setPrefWidth(40);
		
		Pane bottomSpace = new Pane();
		bottomSpace.setPrefWidth(40);
		
		layout.setLeft(leftSpace);
		layout.setRight(rightSpace);
		layout.setTop(topSpace);
		layout.setBottom(bottomSpace);
		layout.setCenter(tp);
		
		return layout;
	}
	
}
