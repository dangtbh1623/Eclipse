package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GuiAnwendung extends Application {

	public GuiAnwendung() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Gridpane Layout");
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10));
		gp.setVgap(10);
		gp.setHgap(10);
		ListView<String> list = new ListView<String>();
		for(int i=0;i<100;i++)
			list.getItems().add("This is Item " + (i + 1));
		
		Label lb1 = new Label("Label 1");
		Label lb2 = new Label("Label 2");
		TextField tf1 = new TextField("Textfield 0");
		TextField tf2 = new TextField("Textfield 1");
		TextField tf3 = new TextField("Textfield 2");
		Button bt = new Button("Start");
		bt.setOnAction(new MeinEventHandler());
		
		gp.add(list,0,0,4,4);
		gp.add(lb1, 4, 0);
		gp.add(lb2, 4, 1);
		gp.add(tf1, 5, 0, 2, 1);
		gp.add(tf2, 5, 1, 2, 1);
		gp.add(tf3, 5, 2, 2, 1);
		gp.add(bt, 6, 4);
		Scene scene = new Scene(gp);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	
}
