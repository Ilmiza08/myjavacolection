import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.TableView;

/**
 * Write a description of JavaFX class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator extends Application
{
      // We keep track of the count, and label displaying the count:
    private int count = 0;
    
    private TextField hasilLabel1 = new TextField();
    private TextField op1Tf = new TextField();
    private TextField op2Tf = new TextField();
    private Kalculator calc = new Kalculator();
    

    /**
     * The start method is the main entry point for every JavaFX application. 
     * It is called after the init() method has returned and after 
     * the system is ready for the application to begin running.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage)
    {
        // Create a Button or any control item
        Button myButton = new Button("+");
        Button btnKurang = new Button("-");
        Button btnKali = new Button("x");
        Button btnBagi = new Button("/");
        Label op1Label = new Label("OP1");
        Label op2Label = new Label("OP2");
        
        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(400, 400);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        myButton.setOnAction(this::buttonClick1);
        btnKurang.setOnAction(this::buttonClick2);
        btnKali.setOnAction(this::buttonClick3);
        btnBagi.setOnAction(this::buttonClick4);
       
        // Add the button and label into the pane
        pane.add(op1Label, 0, 0);
        pane.add(op1Tf, 1, 0);
        pane.add(op2Label, 0, 1);
        pane.add(op2Tf, 1, 1);
        
        pane.add(myButton, 0, 2);
        pane.add(btnKurang, 1, 2);
        pane.add(btnKali, 0, 3);
        pane.add(btnBagi, 1, 3);
        
        pane.add(hasilLabel1, 1, 4);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 400,200);
        stage.setTitle("Kalkulator ");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    private void buttonClick1(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        int hasil  = calc.jumlah(numop1,numop2);
        hasilLabel1.setText(Integer.toString(hasil));
        hasilLabel1.getText();
    }
    
    private void buttonClick2(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        int hasil = calc.kurang(numop1,numop2);
        hasilLabel1.setText(Integer.toString(hasil));
        //int hasil = Integer.parseInt(HasilTf.getText());
    }
    
    private void buttonClick3(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        int hasil = calc.kali(numop1,numop2);
        hasilLabel1.setText(Integer.toString(hasil));
        hasilLabel1.getText();
    }
    
    private void buttonClick4(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        int hasil = calc.bagi(numop1,numop2);
        hasilLabel1.setText(Integer.toString(hasil));
        hasilLabel1.getText();
    }
}