import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class LPIForm extends HBox {
    private static final int height = 200;
    public LPIForm() {
        //set up hbox sizing and alignment
        setMaxHeight(height);
        setAlignment(Pos.TOP_CENTER);
        setSpacing(5);
        //create gridpane with project, transect, date
        GridPane ptdPane = new GridPane();
        Label projectLabel = new Label("Project:");
        TextField projectField = new TextField();
        Label transectLabel = new Label("Transect:");
        TextField transectField = new TextField();
        Label dateLabel = new Label("Date:");
        DatePicker datePicker = new DatePicker();
        ptdPane.add(projectLabel, 0, 0);
        ptdPane.add(projectField, 1, 0);
        ptdPane.add(transectLabel, 0, 1);
        ptdPane.add(transectField, 1, 1);
        ptdPane.add(dateLabel, 0, 2);
        ptdPane.add(datePicker, 1, 2);
        //add panes to hbox
        getChildren().addAll(ptdPane);
    }
}
