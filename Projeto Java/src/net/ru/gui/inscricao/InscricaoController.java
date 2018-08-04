package net.ru.gui.inscricao;
import	net.ru.gui.*;
import net.ru.gui.menuPrincipal.MenuPrincipalController;
import net.ru.negocio.gerenciamento.Fachada;

import java.io.IOException;

import com.gluonhq.charm.glisten.control.Icon;
import com.gluonhq.charm.glisten.control.ToggleButtonGroup;
import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;

public class InscricaoController {
	Fachada f;
	
    @FXML
    private JFXButton botao_salvar;

    @FXML
    private ToggleButtonGroup opcaoAlmoco;

    @FXML
    private ToggleButtonGroup opcaoJantar;
    
    @FXML
    private RadioButton dieta_jantar;
    
    @FXML
    private RadioButton dietaAlmoco;
    
    @FXML
    private RadioButton vegetarianoAlmoco;

    @FXML
    private RadioButton vegetarianoJantar;

    
    public InscricaoController() throws IOException 
	{
    	this.f = Fachada.getInstance();
	}

    
    @FXML
    void salvar(ActionEvent event) throws Exception {
    	if (dieta_jantar.isSelected()) {
        	f.adicionaUsuarioDietaJantar(f.getLogado(), MenuPrincipalController.getData());

    	}else if(dietaAlmoco.isSelected()) {
        	f.adicionaUsuarioDietaAlmoco(f.getLogado(), MenuPrincipalController.getData());

    	}
    	
    	if(vegetarianoJantar.isSelected()) {
        	f.adicionaUsuarioVegetarianoJantar(f.getLogado(), MenuPrincipalController.getData());
    	}else if(vegetarianoAlmoco.isSelected()) {
        	f.adicionaUsuarioVegetarianoAlmoco(f.getLogado(), MenuPrincipalController.getData());
    	}
    }

    @FXML
    void voltar(MouseEvent event) {
    	ScreenManager.getInstance().showCardapio();
    }

}

