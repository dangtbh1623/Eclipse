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

public class Audioerfassung extends Stage {
	private Audio a;
	private Stage stage;

	public Audioerfassung(Audio a, Stage stage) {
		this.a = a;
		this.stage = stage;
	}

	public void showView(){
		
		Button abbrechen = new Button("Abbrechen");
		Label titel = new Label("Titel: ");
		Label aufnahmejahr = new Label("Aufnahmejahr: ");
		Label interpret = new Label("Interpret ");
		Label dauer = new Label("Dauer ");
		
		TextField tftitel = new TextField("Titel");
		TextField tfjahr = new TextField("Aufnahmejahr");
		TextField tfinterpret = new TextField("Interpret");
		TextField tfDauer = new TextField("Dauer");
		
		Button neu = new Button("Neu");
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
		abbrechen.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				close();
				
			}
			
		});
		neu.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				a.setTitel(tftitel.getText());
				a.setJahr(Integer.parseInt(tfjahr.getText()));
				a.setInterpret(tfinterpret.getText());
				a.setDauer(Integer.parseInt(tfDauer.getText()));
			close();
			}
			}
		);
		Scene scene = new Scene(bp, 300, 200);
		this.initOwner(stage);
		this.initModality(Modality.WINDOW_MODAL);
		this.setScene(scene);
		this.showAndWait();
	}

}
