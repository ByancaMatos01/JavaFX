package projeto3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		
		 TabPane tabPane = new TabPane();
	        Tab tab1 = new Tab("Calculadora");

	        // Criando o layout com TextField e botão CE
	        HBox hbox = new HBox(10);
	        hbox.setPadding(new Insets(10));
	        TextField textCampo = new TextField();
	        Button CE = new Button("CE");
	        CE.setPrefSize(30, 30);
	        hbox.getChildren().addAll(textCampo, CE);
	        GridPane gridPane = new GridPane();
	        gridPane.setHgap(10);
	        gridPane.setVgap(10);

	        // Adicionando os botões ao GridPane
	        for (int i = 1; i <= 9; i++) {
	            Button button = new Button(Integer.toString(i));
	            button.setPrefSize(60, 60);
	            gridPane.add(button, (i - 1) % 3, (i - 1) / 3);
	        }
	        Button mais = new Button("+");
	        mais.setPrefSize(60, 60); // Ajustando o tamanho do botão +
	        Button menos = new Button("-");
	        menos.setPrefSize(60, 60); // Ajustando o tamanho do botão -
	        Button mult = new Button("*");
	        mult.setPrefSize(60, 60); // Ajustando o tamanho do botão /

	        gridPane.add(mais, 3, 0);
	        gridPane.add(menos, 3, 1);
	        gridPane.add(mult, 3, 2);
	        
	        
	        
	        Button zeroButton = new Button("0");
	        zeroButton.setPrefSize(60, 60);
	        Button dotButton = new Button(".");
	        dotButton.setPrefSize(60, 60);
	        Button equalsButton = new Button("=");
	        equalsButton.setPrefSize(60, 60);
	        Button divButton = new Button("/");
	        divButton.setPrefSize(60, 60);
	        
	        gridPane.add(zeroButton, 1, 3);
	        gridPane.add(dotButton, 2, 3);
	        gridPane.add(equalsButton, 0, 3);
	        gridPane.add(divButton, 3, 3);

	        // Organizando os botões em uma VBox
	        VBox buttonBox = new VBox(10);
	        buttonBox.getChildren().addAll(gridPane);

	        // Adicionando os layouts ao Tab
	        VBox vbox = new VBox(10);
	        vbox.getChildren().addAll(hbox, buttonBox);
	        tab1.setContent(vbox);

	        // Adicionando as abas ao TabPane
	        tabPane.getTabs().addAll(tab1);

	        // Criando a cena e configurando o palco
	        Scene scene = new Scene(tabPane, 250, 300);
	        primaryStage.setTitle("Calculadora");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
