package net.ru.gui.inscricao;
import	net.ru.gui.*;
import net.ru.gui.menuPrincipal.MenuPrincipalController;
import net.ru.negocio.gerenciamento.Fachada;

import java.io.IOException;

import javax.swing.JOptionPane;

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
    void salvar(ActionEvent event)  {
    	
    	if (this.dieta_jantar.isSelected()) {
        	try {
				f.adicionaUsuarioDietaJantar(f.getLogado(), MenuPrincipalController.getData());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}

    	}else if(dietaAlmoco.isSelected()) {
        	try {
				f.adicionaUsuarioDietaAlmoco(f.getLogado(), MenuPrincipalController.getData());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());

			}

    	}
    	
    	if(vegetarianoJantar.isSelected()) {
        	try {
				f.adicionaUsuarioVegetarianoJantar(f.getLogado(), MenuPrincipalController.getData());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());

			}
    	}else if(vegetarianoAlmoco.isSelected()) {
        	try {
				f.adicionaUsuarioVegetarianoAlmoco(f.getLogado(), MenuPrincipalController.getData());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());

			}
    	}
    	
    	ScreenManager.getInstance().showMenuPrincipal();
    }

    @FXML
    void voltar(MouseEvent event) {
    	ScreenManager.getInstance().showCardapio();
    }

}

