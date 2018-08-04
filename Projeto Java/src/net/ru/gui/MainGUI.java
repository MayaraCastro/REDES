package net.ru.gui;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.stage.Stage;
import net.ru.negocio.gerenciamento.Fachada;

public class MainGUI extends Application{
		
		@Override
		public void start(Stage primaryStage) {
			ScreenManager.getInstance().setMainStage(primaryStage);
			//ScreenManager.getInstance().showLogin();
			ScreenManager.getInstance().showCardapio();
			
			//ScreenManager.getInstance().showInscricao();

		}
		public static void main(String[] args) {
			try {
				Fachada.getInstance().conexao("abc", "");
				launch(args);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} 
	}