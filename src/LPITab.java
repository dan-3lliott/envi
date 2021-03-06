import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Tab;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class LPITab extends Tab {
    public LPITab() {
        //set up tab
        setText("line-point intercept");
        //create table
        LPITable lpiTable = new LPITable();
        VBox.setVgrow(lpiTable, Priority.ALWAYS);
        //create form
        LPIForm lpiForm = new LPIForm(lpiTable);
        VBox.setVgrow(lpiForm, Priority.NEVER);
        //set up vbox
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        vBox.setAlignment(Pos.TOP_CENTER);
        //add components to vbox
        vBox.getChildren().addAll(lpiForm, lpiTable);
        //set content of tab to vbox
        setContent(vBox);
    }
}
