module FXMLDiarioAlimentar {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens gui to javafx.graphics, javafx.fxml;
}
