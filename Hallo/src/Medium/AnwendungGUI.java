package Medium;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AnwendungGUI extends Application {
	
	MedienverwaltungsCollection mvc = new MedienverwaltungsCollection();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane bp = new BorderPane();

		
		MenuBar bar = new MenuBar();
		
		Menu datei = new javafx.scene.control.Menu("Datei");
		MenuItem laden = new MenuItem("Laden");
		MenuItem speichern = new MenuItem("Speichern");
		MenuItem mid = new MenuItem("Medienliste als Datei");
		MenuItem end = new MenuItem("Beenden");
		datei.getItems().add(laden);
		datei.getItems().add(speichern);
		datei.getItems().add(new SeparatorMenuItem());
		datei.getItems().add(mid);
		datei.getItems().add(new SeparatorMenuItem());
		datei.getItems().add(end);
		
		Menu medium = new javafx.scene.control.Menu("Medium");
		MenuItem an = new MenuItem("Add Audio");
		end.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
				
			}
		});
		mid.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String dateiname = InputView.create(primaryStage, "Dateiname eingeben", "Dateiname", null).showView();
				mvc.zeigeMedienAlsDateiGUI(dateiname);
			}
		});
		speichern.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				mvc.speichern();
				
			}
		});
		laden.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				mvc.laden();
				
			}
		});
		an.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Audio a = new Audio();
				Audioerfassung audioerfassung = new Audioerfassung(a, primaryStage);
				audioerfassung.showView();
				mvc.aufnehme(a);
				
			}
		});
		MenuItem bn = new MenuItem("Add Bild");
		bn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Bild b = new Bild();
				Bilderfassung bilderfassung = new Bilderfassung(b, primaryStage);
				bilderfassung.showView();
				mvc.aufnehme(b);
				
			}
		});
		medium.getItems().add(an);
		medium.getItems().add(bn);
		
		Menu anzeige = new javafx.scene.control.Menu("Anzeige");
		MenuItem all = new MenuItem("Alle Medien");
		all.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				MessageView mv = MessageView.create(primaryStage, "Alle Medien", mvc.zeigeMedienAlsString());
				mv.showView();
			}
		});
		MenuItem ej = new MenuItem("Erscheinungsjahr");
		MenuItem nm = new MenuItem("Neuestes Medium");
		anzeige.getItems().addAll(ej,nm,all);
		ej.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				MessageView mv = MessageView.create(primaryStage, "Durchschnittliche Jahr", String.valueOf(mvc.berechneErscheinungsjahr()));
				mv.showView();
			}
		});
		nm.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				MessageView mv = MessageView.create(primaryStage, "Neuestes Medium", mvc.sucheNeuesMedium().druckeDatenalsString());
				mv.showView();
				
			}
		});
		
		bar.getMenus().addAll(datei,medium,anzeige);
		bp.setTop(bar);
		Scene scene = new Scene(bp, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
		
		
	}

}
