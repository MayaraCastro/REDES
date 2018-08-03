package net.ru.gui.inscricao;
import	net.ru.gui.*;

import com.gluonhq.charm.glisten.control.Icon;
import com.gluonhq.charm.glisten.control.ToggleButtonGroup;
import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class InscricaoController {

    @FXML
    private JFXButton botao_salvar;

    @FXML
    private ToggleButtonGroup opcaoAlmoco;

    @FXML
    private ToggleButtonGroup opcaoJantar;

    @FXML
    void salvar(ActionEvent event) {

    }

    @FXML
    void voltar(MouseEvent event) {
    	ScreenManager.getInstance().showCardapio();
    }

}

