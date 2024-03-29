package Medium;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class MessageView extends ModalStage{
    
    private final String titel;
    private final String nachricht;
    private final TextField tf_input;
    
    
    private MessageView(Stage primaryStage, String titel, String nachricht) {
        
        super(primaryStage);
        this.titel = titel;
        this.nachricht = nachricht;
        this.tf_input = new TextField();
    }
    
    public static MessageView create(Stage primaryStage, String titel, String nachricht){
        return new MessageView(primaryStage, titel, nachricht);
    }
    
   
    public void showView()  {
        setTitle(titel);
        BorderPane bp = new BorderPane();
        
        HBox hb = new HBox();
        hb.setPadding(new Insets(20.0, 5.0, 20.0, 5.0));
        hb.setAlignment(Pos.CENTER);
        Label label = new Label(nachricht);
        hb.getChildren().add(label);

        FlowPane fp = new FlowPane();
        fp.setAlignment(Pos.CENTER);
        fp.setPadding(new Insets(20.0));
        fp.setHgap(20.0);
        Button ok = new Button("OK");
        
        ok.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                close();
            }
            
        });
       
        fp.getChildren().add(ok);

        bp.setCenter(hb);
        bp.setBottom(fp);

        Scene scene = new Scene(bp);
        setScene(scene);

        showAndWait();
        
    }
    
    
}