package JavaFX;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MeinEventHandler implements EventHandler<ActionEvent> {

	public MeinEventHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(ActionEvent arg0) {
		System.out.print("hallo kitty");

	}

}
