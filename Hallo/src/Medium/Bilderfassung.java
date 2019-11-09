package Medium;


import javafx.event.Event;
import javafx.event.EventHandler;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Bilderfassung extends Stage {
	private Bild b;
	private Stage stage;
	
	public Bilderfassung(Bild b, Stage stage) {
		this.b = b;
		this.stage = stage;
	}
	
	
	public void showView() {
		Button neu = new Button("Neu");
		Button abbrechen = new Button("Abbrechen");
		Label titel = new Label("Titel: ");
		Label ort = new Label("Ort: ");
		Label Aufnahmejahr = new Label("Aufnahmejahr: ");
		TextField tftitel = new TextField("Titel");
		TextField tfOrt = new TextField("Ort");
		TextField tfjahr = new TextField("Aufnahmejahr");
		
		
		HBox hb = new HBox(10, neu, abbrechen);
		hb.setAlignment(Pos.CENTER);
		
		GridPane gp = new GridPane();
		gp.setVgap(10);
		gp.setHgap(10);
		GridPane.setHalignment(titel, HPos.RIGHT);
		GridPane.setHalignment(ort, HPos.RIGHT);
		GridPane.setHalignment(Aufnahmejahr, HPos.RIGHT);
		gp.add(titel, 0, 0);
		gp.add(ort, 0, 1);
		gp.add(Aufnahmejahr, 0, 2);
		gp.add( tftitel, 1, 0, 2, 1);
		gp.add(tfOrt, 1, 1, 2, 1);
		gp.add(tfjahr, 1, 2, 2, 1);
		gp.autosize();
		
		BorderPane bp = new BorderPane();
		bp.setBottom(hb);
		bp.setCenter(gp);
		bp.setPadding(new Insets(10, 10, 10, 10));
		
		abbrechen.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				close();				
			}			
		});
		neu.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				b.setTitel(tftitel.getText());
				b.setOrt(tfOrt.getText());
				b.setJahr(Integer.parseInt(tfjahr.getText()));
				close();
			}
		});
		
		Scene scene = new Scene(bp, 300, 200);
		this.initOwner(stage);
		this.initModality(Modality.WINDOW_MODAL);
		this.setScene(scene);
		this.showAndWait();
		
		
	}

}
