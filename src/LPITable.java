import javafx.scene.control.TableView;

public class LPITable extends TableView {
    public LPITable() {
        //set up table
        setEditable(true);
        //set up columns, then set up cell factory so that point objects can be directly added in

        //add columns
        getColumns().addAll();
        //populate with data from save file

    }
}
