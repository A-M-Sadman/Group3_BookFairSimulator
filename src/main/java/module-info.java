module com.groupthree.group3_bookfairsimulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.groupthree.group3_bookfairsimulator to javafx.fxml;
    exports com.groupthree.group3_bookfairsimulator;
}