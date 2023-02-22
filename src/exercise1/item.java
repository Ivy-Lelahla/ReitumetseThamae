package exercise1;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class item {
    
   private final DoubleProperty quantity=new SimpleDoubleProperty(); 
    
   
   public final double getQuantity(){
    
       return quantity.get();
}
   public final DoubleProperty quantityProperty(){
       
       return quantity;
   }
   public final void setQuantity(double quantity){
       
       this.quantity.set(quantity);
   }
}
