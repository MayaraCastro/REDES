package net.ru.gui;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.stage.Stage;
import net.ru.negocio.gerenciamento.Fachada;
import net.ru.teste.PovoaBanco;

public class MainGUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Fachada.getInstance().conexao("superuser", "12345");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			throw new Exception(e);
		}
		PovoaBanco.main(null);
		ScreenManager.getInstance().setMainStage(primaryStage);
		ScreenManager.getInstance().showLogin();
		// ScreenManager.getInstance().showCardapio();

		// ScreenManager.getInstance().showInscricao();

	}

	public static void main(String[] args) {
		launch(args);
	}
}