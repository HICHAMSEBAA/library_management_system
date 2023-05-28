module library.library {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens library.library to javafx.fxml;
    exports library.library;
}