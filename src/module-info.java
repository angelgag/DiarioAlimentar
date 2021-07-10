module FXMLDiarioAlimentar {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens gui to javafx.graphics, javafx.fxml;
}
