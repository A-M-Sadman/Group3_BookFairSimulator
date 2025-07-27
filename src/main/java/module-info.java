//module com.groupthree.group3_bookfairsimulator {
//    requires javafx.controls;
//    requires javafx.fxml;
//
//
//    opens com.groupthree.group3_bookfairsimulator to javafx.fxml;
//    exports com.groupthree.group3_bookfairsimulator;
//}
module com.groupthree.group3_bookfairsimulator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.groupthree.group3_bookfairsimulator to javafx.fxml;
    opens com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman to javafx.fxml;

    exports com.groupthree.group3_bookfairsimulator;
    exports com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;
}
