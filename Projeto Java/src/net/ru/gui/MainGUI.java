package net.ru.gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainGUI extends Application{
		
		@Override
		public void start(Stage primaryStage) {
			ScreenManager.getInstance().setMainStage(primaryStage);
			//ScreenManager.getInstance().showLogin();
			ScreenManager.getInstance().showCardapio();
			
			//ScreenManager.getInstance().showInscricao();

		}
		public static void main(String[] args) {
			launch(args);
		} 
	}