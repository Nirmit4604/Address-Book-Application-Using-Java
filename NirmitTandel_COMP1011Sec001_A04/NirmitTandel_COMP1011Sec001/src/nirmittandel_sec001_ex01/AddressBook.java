package nirmittandel_sec001_ex01;
// Fig. X: AddressBook.java
// Main application class that loads and displays the AddressBook's GUI.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddressBook extends Application {
   @Override
   public void start(Stage stage) {
	   try {
      Parent root = 
         FXMLLoader.load(getClass().getResource("AddressBook.fxml"));
      
      Scene scene = new Scene(root);
      stage.setTitle("Address Book");
      stage.setScene(scene);
      stage.show();
	   }catch(Exception excep) {
		   excep.printStackTrace();
	   }
   }

   public static void main(String[] args) {
      launch(args);
   }
}

