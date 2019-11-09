package JavaFX;

import java.awt.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Zeichnen extends Application {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		
		Line linie = new Line(0,100,400,100);
		linie.setStroke(javafx.scene.paint.Color.BLUE);
		Rectangle rec = new Rectangle(150, 50, 100, 100);
		rec.setFill(javafx.scene.paint.Color.BLACK);
		Button bt = new Button("Farbe");
		bt.setOnAction(new EventHandler<ActionEvent>() {
			
			
			@Override
			public void handle(ActionEvent event) {
				int r = (int)(Math.random() * 255);
				int g = (int)(Math.random() * 255);
				int b = (int)(Math.random() * 255);
				rec.setFill(javafx.scene.paint.Color.rgb(r, g, b));
				
			}
		});
		root.getChildren().addAll(linie,rec,bt);
		root.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				rec.setX(event.getX());
				rec.setY(event.getSceneY());
				
			}
			
		});
		Scene scene = new Scene(root, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Zeichnen");
		primaryStage.show();
		
		
		
	}

}
