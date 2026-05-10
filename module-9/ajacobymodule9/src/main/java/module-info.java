module ajacoby.ajacobymodule9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens ajacoby.ajacobymodule9 to javafx.fxml;
    exports ajacoby.ajacobymodule9;
}
