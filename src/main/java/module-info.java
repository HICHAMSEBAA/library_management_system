module library.library {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens library.library to javafx.fxml;
    exports library.library;
    opens library.addBook to javafx.fxml;
    exports library.addBook;
    opens library.updateBook to javafx.fxml;
    exports library.updateBook;
    opens library.addStudent to javafx.fxml;
    exports library.addStudent;
    opens library.updateStudent to javafx.fxml;
    exports library.updateStudent;
}