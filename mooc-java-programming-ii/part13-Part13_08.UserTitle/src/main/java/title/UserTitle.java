package title;


import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parameters params = getParameters();
        String org = params.getNamed().get("organization");
        String course = params.getNamed().get("course");

        stage.setTitle(org);
        stage.show();
    }
}
