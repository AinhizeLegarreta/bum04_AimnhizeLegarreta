module ehu.eus.bum04_ainhizelegarreta {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires okhttp3;

    opens ehu.eus to javafx.fxml, com.google.gson;
    exports ehu.eus;
}