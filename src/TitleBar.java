import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import java.util.Arrays;

public class TitleBar extends HBox {
    private static final int height = 20;
    private static final int width = 100;
    private static final String noBorder = "-fx-border-width: 0";
    public TitleBar() {
        //set up hbox sizing and alignment
        setMaxHeight(height);
        setMaxWidth(width);
        setAlignment(Pos.CENTER_RIGHT);
        setSpacing(5);
        setPadding(new Insets(10));
        //create buttons
        ComboBox style = new ComboBox(FXCollections.observableList(Arrays.asList(Main.styles)));
        Button minimize = new Button("—");
        Button close = new Button(" X ");
        //define action for the style combobox
        style.setOnAction(e -> {
            ((ComboBox)e.getSource()).getScene().getStylesheets().clear();
            ((ComboBox)e.getSource()).getScene().getStylesheets().add(style.getValue().toString());
        });
        //define action for the minimize button
        minimize.setOnAction(e -> ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true));
        //define action for the close button
        close.setOnAction(e -> ((Stage)((Button)e.getSource()).getScene().getWindow()).close());
        //remove borders while leaving the rest of the css styling for buttons intact
        style.setStyle(noBorder);
        minimize.setStyle(noBorder);
        close.setStyle(noBorder);
        //ensure that minimize and close buttons don't have their text reduced to ...
        minimize.setMinWidth(35);
        close.setMinWidth(35);
        //add buttons to hbox
        getChildren().addAll(style, minimize, close);
    }
}
