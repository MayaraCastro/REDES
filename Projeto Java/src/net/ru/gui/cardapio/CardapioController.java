package net.ru.gui.cardapio;
import	net.ru.gui.*;
import net.ru.gui.menuPrincipal.MenuPrincipalController;
import net.ru.negocio.beans.Almoco;
import net.ru.negocio.gerenciamento.Fachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXListView;

public class CardapioController implements Initializable {
	private Fachada f;
	
	private Calendar data;
	
	  @FXML
	    private Label texto_almoco;

	    @FXML
	    private Label texto_jantar;

	public void setdata(Calendar data) {
		this.data = data;
	}
	
	public CardapioController() throws IOException 
	{
    	this.f = Fachada.getInstance();
    	
	}
   
    @FXML
    void inscriver_cardapio(ActionEvent event) {
    	ScreenManager.getInstance().showInscricao();
    }

    @FXML
    void voltar(MouseEvent event) {
    	ScreenManager.getInstance().showMenuPrincipal();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String almoco = f.getAlmoco(MenuPrincipalController.getData()).toString();
    	String jantar = f.getJantar(MenuPrincipalController.getData()).toString();
    	texto_almoco.setText(almoco);
    	texto_jantar.setText(jantar);
		
	}

}
