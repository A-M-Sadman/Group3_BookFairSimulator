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
    requires java.desktop;

    opens com.groupthree.group3_bookfairsimulator to javafx.fxml;
    opens com.groupthree.group3_bookfairsimulator.Sami to javafx.fxml;
    opens com.groupthree.group3_bookfairsimulator.Fahim to javafx.fxml;
    opens com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman to javafx.fxml;
    opens com.groupthree.group3_bookfairsimulator.Reya to javafx.fxml;

    exports com.groupthree.group3_bookfairsimulator;
    exports com.groupthree.group3_bookfairsimulator.Sami;
    exports com.groupthree.group3_bookfairsimulator.Fahim;
    exports com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;
    exports com.groupthree.group3_bookfairsimulator.Reya;
}
