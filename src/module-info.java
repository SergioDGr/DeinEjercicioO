module DeinEjercicioO {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens com.dein.productolabelwidget to javafx.graphics, javafx.fxml;
}
