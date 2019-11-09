package Medium;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;



public class InputView extends ModalStage{
    
    private final String input;
    private final String titel;
    private final String nachricht;
    private final TextField tf_input;
    
   
    private InputView(Stage primaryStage, String titel, String nachricht, String input) {
   
        super(primaryStage);
        this.input = input;
        this.titel = titel;
        this.nachricht = nachricht;
        tf_input = new TextField();
    }
    
   
    public static InputView create(Stage primaryStage, String titel, String nachricht, String input){
        return new InputView(primaryStage, titel, nachricht, input);
    }
    
   
    public String showView(){
        setTitle(titel);
        BorderPane bp = new BorderPane();
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10.0));
        gp.setHgap(5.0);
        gp.setVgap(10.0);

        if (input != null) {
            update();
        }

        Label inputLabel = new Label(nachricht);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);
        GridPane.setHgrow(tf_input, Priority.ALWAYS);
        gp.addRow(1, inputLabel, tf_input);

        FlowPane fp = new FlowPane();
        fp.setAlignment(Pos.CENTER);
        fp.setPadding(new Insets(20.0));
        fp.setHgap(20.0);
        Button ok = new Button("OK");
        Button abbrechen = new Button("Abbrechen");
        
        ok.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                close();
            }
            
        });
        abbrechen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tf_input.setText(null);
                close();
            }
        });
        fp.getChildren().addAll(ok, abbrechen);

        bp.setCenter(gp);
        bp.setBottom(fp);

        Scene scene = new Scene(bp);
        setScene(scene);

        showAndWait();
        
        return tf_input.getText();
    }
    
    private void update() {
        tf_input.setText(input);
    }
    
    
}
