package oop_basics.dao_pattern.GUI;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop_basics.better_dep_injection.CarService;
import oop_basics.better_dep_injection.MyModule;
import oop_basics.dao_pattern.ServiceModule;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author pgn
 */
public final class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Injector injector = Guice.createInjector(new ServiceModule());
        //The FXMLLoader is instantiated the way Google Guice offers - the FXMLLoader instannce is built in a separated Provider<FXMLLoader> called FXMLLoaderProvider.
        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);
        fxmlLoader.setLocation(getClass().getResource("../resources2/loginView.fxml"));
        Parent root = fxmlLoader.load();
            stage.setScene(new Scene(root));
            stage.setTitle("JavaFX 8 Dependency injection");
            stage.show();
            stage.setOnCloseRequest(e -> {
                System.exit(0);
            });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}