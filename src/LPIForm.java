import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class LPIForm extends GridPane {
    private static final int height = 200;
    public LPIForm(LPITable lpiTable) {
        //set up gridpane sizing, alignment, and spacing
        setMaxHeight(height);
        setAlignment(Pos.TOP_CENTER);
        setHgap(5);
        setVgap(5);
        //declare form elements
        Label projectLabel = new Label("Project:");
        TextField projectField = new TextField();
        Label transectLabel = new Label("Transect:");
        TextField transectField = new TextField();
        Label dateLabel = new Label("Date:");
        DatePicker datePicker = new DatePicker();
        Label leftEndLabel = new Label("GPS WPT Left End:");
        TextField leftEndField = new TextField();
        Label rightEndLabel = new Label("GPS WPT Right End:");
        TextField rightEndField = new TextField();
        Label unitLabel = new Label("Distance Unit:");
        TextField unitField = new TextField();
        Label startTimeLabel = new Label("Start Time:");
        TextField startTimeField = new TextField();
        Label endTimeLabel = new Label("End Time:");
        TextField endTimeField = new TextField();
        Button addPointButton = new Button("Add Point");
        Button removePointButton = new Button("Remove Point");
        HBox buttonBox = new HBox(addPointButton, removePointButton);
        buttonBox.setSpacing(5);
        //button actions
        addPointButton.setOnAction(e -> {
            lpiTable.getItems().add(new Point());
        });
        //add form elements to grid
        add(projectLabel, 0, 0);
        add(projectField, 1, 0);
        add(transectLabel, 0, 1);
        add(transectField, 1, 1);
        add(dateLabel, 0, 2);
        add(datePicker, 1, 2);
        add(leftEndLabel, 2, 0);
        add(leftEndField, 3, 0);
        add(rightEndLabel, 2, 1);
        add(rightEndField, 3, 1);
        add(unitLabel, 2, 2);
        add(unitField, 3, 2);
        add(startTimeLabel, 4, 0);
        add(startTimeField, 5, 0);
        add(endTimeLabel, 4, 1);
        add(endTimeField, 5, 1);
        add(buttonBox, 5, 2);
    }
}
