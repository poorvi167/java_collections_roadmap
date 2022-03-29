module io.github.dbc.java_collections_roadmap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens io.github.dbc.java_collections_roadmap to javafx.fxml;
    exports io.github.dbc.java_collections_roadmap;
    exports io.github.dbc.java_collections_roadmap.controller;
    opens io.github.dbc.java_collections_roadmap.controller to javafx.fxml;
}