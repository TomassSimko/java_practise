package oop_basics.basicSwitchingJavaFx;


// Root Controller for the whole application

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    // Should have login at the moment and after clicking button switch scene to BaseController(Fxml file with nav bar and changable content)

    @FXML
    private StackPane app_content;
    private final IStageManager stageManager1 = StageManager.getInstance();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void switchToAnotherTab(ActionEvent actionEvent) {
        AnchorPane pane = stageManager1.switchTabsWithin(FxmlView.ANOTHER.getFxmlFile());
        var test = pane.getChildren();
       // app_content.getChildren().clear();
       // app_content.getChildren().add(pane);
        System.out.println("Hello word");
    }

}
