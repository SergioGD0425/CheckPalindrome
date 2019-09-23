import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindrome extends Application {
	
	private TextField text;
	private Label lab;
	private Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		text = new TextField();
		text.setPromptText("Introduce un palíndromo");
		text.setMaxWidth(150);
		
		button = new Button("Comprobar");
		button.setDefaultButton(true);
		button.setOnAction(e -> onSaludarButtonAction(e));
		
		lab = new Label();
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(text,button,lab);
		
		Scene scene = new Scene(root,320,200);
		
		
		primaryStage.setTitle("Comprobador de palíndromos");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void onSaludarButtonAction(ActionEvent e) {	
		String palindromo = text.getText();	
		boolean esPal=true;
		int j=palindromo.length()-1;
		for(int i =0;i<palindromo.length()-1/2;i++){
			if(palindromo.charAt(i)!=palindromo.charAt(j))
				esPal=false;
		    j--;
		}
		if(esPal) {
			lab.setText("Es palíndromo");
			lab.setStyle("-fx-text-fill: green;"); 
		}
		else {
			lab.setText("No es palíndromo");
			lab.setStyle("-fx-text-fill: red;"); 
		}
		    
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
