package JavaFX;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Audioerfassung extends Application {


	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button neu = new Button("Neu");
		Button abbrechen = new Button("Abbrechen");
		Label titel = new Label("Titel: ");
		Label aufnahmejahr = new Label("Aufnahmejahr: ");
		Label interpret = new Label("Interpret ");
		Label dauer = new Label("Dauer ");
		
		TextField tftitel = new TextField("Titel");
		TextField tfjahr = new TextField("Aufnahmejahr");
		TextField tfinterpret = new TextField("Interpret");
		TextField tfDauer = new TextField("Dauer");
		
		
		HBox hb = new HBox(10, neu, abbrechen);
		hb.setAlignment(Pos.CENTER);
		
		GridPane gp = new GridPane();
		gp.setVgap(10);
		gp.setHgap(10);
		GridPane.setHalignment(titel, HPos.RIGHT);
		GridPane.setHalignment(aufnahmejahr, HPos.RIGHT);
		GridPane.setHalignment(interpret, HPos.RIGHT);
		GridPane.setHalignment(dauer, HPos.RIGHT);
		gp.add(titel, 0, 0);
		gp.add(aufnahmejahr, 0, 1);
		gp.add(interpret, 0, 2);
		gp.add(dauer, 0, 3);
		gp.add(tftitel, 1, 0, 2, 1);
		gp.add(tfjahr, 1, 1, 2, 1);
		gp.add(tfinterpret, 1, 2, 2, 1);
		gp.add(tfDauer, 1, 3, 2, 1);
		

		
		BorderPane bp = new BorderPane();
		bp.setBottom(hb);
		bp.setCenter(gp);
		bp.setPadding(new Insets(10, 10, 10, 10));
		
		
		Scene scene = new Scene(bp, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
