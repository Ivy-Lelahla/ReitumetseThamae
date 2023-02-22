
package exercise1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
      
     @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button decrease;
    
    @FXML
    private Button increase;
    
    @FXML
    private Label label;

    
     @FXML
    private ProgressBar  pbQuantity;
     
     @FXML
    private ProgressIndicator  pQuantity;
     
    private item itemm= new item();
    int progress;

       
  @FXML
  void increase(ActionEvent event){
      itemm.setQuantity(itemm.getQuantity() +0.01);
      pbQuantity.setProgress(progress);
      label.setText(Integer.toString((int)Math.round(progress*100)));
      
      
  }
  
  @FXML
  void decrease(ActionEvent event){
      itemm.setQuantity(itemm.getQuantity() -0.01);
      pQuantity.setProgress(progress);
      label.setText(Integer.toString((int)Math.round(progress*100)));
      
  }
    
   @FXML
    void Exit(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("ARE YOU SURE YOU  WANT TO EXIT");
        if(alert.showAndWait().get()==ButtonType.OK)
        System.exit(0); 
    }
 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        itemm.setQuantity(0);
        
        itemm.quantityProperty().addListener( new ChangeListener<Number> (){

@Override
        public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue){
            
            pbQuantity.progressProperty().bind(itemm.quantityProperty());
           pQuantity.progressProperty().bind(itemm.quantityProperty());
         }
    });  
}
}
