package net.ru.gui;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ScreenManager {
	
	private static ScreenManager instance;
	private Stage mainStage;
	
	//private FXMLLoader 
	private Scene mainLogin, mainInscricao,mainCardapio, mainMenuPrincipal;
	
	
	
	public static ScreenManager getInstance()  {
		if(instance == null){
			instance = new ScreenManager();
		}
		return instance;
	}
	
	
	//Load scenes
	public void loadLogin(){
		try {
			Pane telaLogin = FXMLLoader.load(this.getClass().getResource("login/TelaLogin.fxml"));
			this.mainLogin = new Scene(telaLogin);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void loadInscricao(){
		try {
			Pane telaInscricao = FXMLLoader.load(this.getClass().getResource("inscricao/TelaInscricao.fxml"));
			this.mainInscricao = new Scene(telaInscricao);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void loadMenuPrincipal(){
		try {
			Pane telaMenuPrincipal = FXMLLoader.load(this.getClass().getResource("menuPrincipal/TelaMenuPrincipal.fxml"));
			this.mainMenuPrincipal = new Scene(telaMenuPrincipal);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void loadCardapio(){
		try {
			Pane telaCardapio = FXMLLoader.load(this.getClass().getResource("cardapio/TelaCardapio.fxml"));
			this.mainCardapio = new Scene(telaCardapio);

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public Stage getMainStage(){
		return mainStage;
	}
	
	public void setMainStage(Stage mainStage){
		this.mainStage = mainStage;
		this.mainStage.setTitle("R.U. Digital");
		this.mainStage.setResizable(false);
		//this.mainStage.initStyle(StageStyle.UNDECORATED);
	}

	// CHAMADA DE TELAS
	
	public void showLogin(){
		this.loadLogin();
		this.mainStage.setScene(mainLogin);
		this.mainStage.show();
	}
	public void showInscricao(){
		this.loadInscricao();
		this.mainStage.setScene(mainInscricao);
		//this.mainStage.show();
	}
	public void showMenuPrincipal(){
		this.loadMenuPrincipal();
		this.mainStage.setScene(mainMenuPrincipal);
		//this.mainStage.show();

	}
	public void showCardapio(){
		this.loadCardapio();
		this.mainStage.setScene(this.mainCardapio);
		this.mainStage.show();

	}

	
	//show stages
	public void showMainStage(){
		this.mainStage.show();
	}

	//close stages
	public void fecharMainStage(){
		this.mainStage.close();
	}

	public void minimizarMainStage(){
		this.mainStage.setIconified(true);
	}
	
}
