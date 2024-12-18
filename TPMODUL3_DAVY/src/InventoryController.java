import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> albumNameColumn;
    @FXML
    private TableColumn<Album, String> artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    @FXML
    private TableColumn<Album, Integer> availableColumn;
    @FXML
    private TableColumn<Album, Integer> rentedColumn;

    @FXML
    private TextField albumNameField;
    @FXML
    private TextField artistField;
    @FXML
    private TextField totalField;
    @FXML
    private TextField availableField;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        albumList = FXCollections.observableArrayList();
        tableView.setItems(albumList);

        albumNameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        rentedColumn.setCellValueFactory(new PropertyValueFactory<>("rented"));

        tableView.setOnMouseClicked(event -> {
            Album selected = tableView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                albumNameField.setText(selected.getAlbumName());
                artistField.setText(selected.getArtist());
                totalField.setText(String.valueOf(selected.getTotal()));
                availableField.setText(String.valueOf(selected.getAvailable()));
            }
        });
    }

    @FXML
    private void handleTambah() {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());

            albumList.add(new Album(albumName, artist, total, available, 0));
            showAlert("Success", "Album berhasil ditambahkan!");
        } catch (Exception e) {
            showAlert("Error", "Data tidak valid!");
        }
    }

    @FXML
    private void handleHapus() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            albumList.remove(selected);
            showAlert("Success", "Album berhasil dihapus!");
        } else {
            showAlert("Error", "Tidak ada album yang dipilih!");
        }
    }

    @FXML
    private void handleUpdate() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                selected.setAlbumName(albumNameField.getText());
                selected.setArtist(artistField.getText());
                selected.setTotal(Integer.parseInt(totalField.getText()));
                selected.setAvailable(Integer.parseInt(availableField.getText()));
                tableView.refresh();
                showAlert("Success", "Album berhasil diperbarui!");
            } catch (Exception e) {
                showAlert("Error", "Data tidak valid!");
            }
        } else {
            showAlert("Error", "Tidak ada album yang dipilih!");
        }
    }

    @FXML
    private void handleRent() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null && selected.getAvailable() > 0) {
            selected.setAvailable(selected.getAvailable() - 1);
            selected.setRented(selected.getRented() + 1);
            tableView.refresh();
            showAlert("Success", "Album berhasil disewa!");
        } else {
            showAlert("Error", "Album tidak tersedia untuk disewa!");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
