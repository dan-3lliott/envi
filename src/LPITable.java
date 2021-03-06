import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class LPITable extends TableView {
    public LPITable() {
        //set up table
        setEditable(true);
        getSelectionModel().cellSelectionEnabledProperty().set(true);
        //set up columns, then set up cell factory so that point objects can be directly added in
        TableColumn<Point, String> distanceColumn = new TableColumn<>("Distance");
        distanceColumn.setCellValueFactory(new PropertyValueFactory<>("distance"));
        TableColumn<Point, String> fluvialSettingColumn = new TableColumn<>("Fluvial Setting");
        fluvialSettingColumn.setCellValueFactory(new PropertyValueFactory<>("fluvialSetting"));
        TableColumn<Point, String> epifaunalSubstrateColumn = new TableColumn<>("Epifaunal Substrate");
        epifaunalSubstrateColumn.setCellValueFactory(new PropertyValueFactory<>("epifaunalSubstrate"));
        TableColumn<Point, String> speciesColumn = new TableColumn<>("Species");
        speciesColumn.setCellValueFactory(new PropertyValueFactory<>("species"));
        TableColumn<Point, String> groundCoverColumn = new TableColumn<>("Ground Cover");
        groundCoverColumn.setCellValueFactory(new PropertyValueFactory<>("groundCover"));
        TableColumn<Point, String> notesColumn = new TableColumn<>("Notes");
        notesColumn.setCellValueFactory(new PropertyValueFactory<>("notes"));
        //make all columns editable

        //add columns to table
        getColumns().addAll(distanceColumn, fluvialSettingColumn, epifaunalSubstrateColumn, speciesColumn, groundCoverColumn, notesColumn);
        //populate with data
        getItems().addAll(Data.lpiPoints);
    }
}
