package net.ru.gui;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.stage.Stage;
import net.ru.negocio.gerenciamento.Fachada;

public class MainGUI extends Application{
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			try {
				Fachada.getInstance().conexao("root", "");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				throw new Exception(e);
			}
			ScreenManager.getInstance().setMainStage(primaryStage);
			ScreenManager.getInstance().showLogin();
			//ScreenManager.getInstance().showCardapio();
			
			//ScreenManager.getInstance().showInscricao();

		}
		public static void main(String[] args) {
			launch(args);
		} 
	}