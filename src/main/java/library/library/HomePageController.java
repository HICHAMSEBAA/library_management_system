package library.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class HomePageController {

    @FXML
    void addBook(ActionEvent event) {

        loadWindow("/library/addBook/addBook.fxml","Add Books");

    }

    @FXML
    void updateBook(ActionEvent event) {

        loadWindow("/library/updateBook/updateBook.fxml","UpDate Book");

    }

    @FXML
    void addStudent(ActionEvent event) {

        loadWindow("/library/addStudent/addStudent.fxml","Add Student");

    }

    @FXML
    void updateStudent(ActionEvent event) {

        loadWindow("/library/updateStudent/updateStudent.fxml","Update Student");

    }


    @FXML
    void deletBook(ActionEvent event) {

    }

    @FXML
    void deletStudent(ActionEvent event) {

    }






    void loadWindow(String path,String title){
        try {
            Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(path)));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            System.err.println("loadWindow function : "+e.getMessage());
            throw new RuntimeException(e);
        }
    }


}