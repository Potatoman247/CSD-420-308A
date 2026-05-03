module ajacoby.module7discussion {
    requires javafx.controls;
    requires javafx.fxml;

    opens ajacoby.module7discussion to javafx.fxml;
    exports ajacoby.module7discussion;
}
