package library.addBook;

import DataBase.DBInfo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.sql.SQLException;

public class AddBookController {

    @FXML
    private TextField author;

    @FXML
    private TextField bookId;

    @FXML
    private TextField publisher;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField title;


    public void save(ActionEvent actionEvent) throws SQLException {

        String bookID = bookId.getText();
        String bookTitle = title.getText();
        String bookAuthor = author.getText();
        String bookPublisher = publisher.getText();

        if (bookID.isEmpty() || bookAuthor.isEmpty() || bookTitle.isEmpty() || bookPublisher.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error occured");
            alert.setHeaderText("fill all the field");
            alert.setContentText("fill all the field");
            alert.showAndWait();
            return;
        }
        String qu = "INSERT INTO `BOOK`(`id`, `title`, `author`, `publisher`) VALUES " +
                "(" +
                "'"+bookID+"'" +
                ",'"+bookTitle+"'" +
                ",'"+bookAuthor+"'" +
                ",'"+bookPublisher+"'" +
                ")";
        if (DBInfo.saveOrUpdate(qu)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("INFORMATION");
            alert.setHeaderText("Add book");
            alert.setContentText("Success");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Save Error");
            alert.setContentText("there is Error in Query !");
            alert.showAndWait();
        }

    }



    public void cancel(ActionEvent actionEvent) {
        Stage stage = (Stage) rootPane.getScene().getWindow();
        stage.close();
    }
}
