package com.dein.productolabelwidget;
	
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ProductoLabel extends GridPane{
	
	@FXML
	protected Label nombreProductoLabel;
	@FXML
	protected Label stockProductoLabel;
	@FXML
	private ImageView imagenProductoImageView;

	public ProductoLabel() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/dein/productolabelwidget/fxml/ProductoLabel.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	

	
}
