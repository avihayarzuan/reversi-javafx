/*
 * Kfir Ventura
 * Avihay Arzuan
 */



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

/**
 * the main class of the game
 * runs the main screen as anchor pane
 *
 */
public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {

    try {
      AnchorPane start = (AnchorPane) FXMLLoader.load(getClass().getResource("Menu.fxml"));
      Scene sceneStart = new Scene(start, 600, 600);
      primaryStage.setScene(sceneStart);
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
