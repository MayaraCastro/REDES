package net.ru.gui.cardapio;
import	net.ru.gui.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import com.jfoenix.controls.JFXListView;

public class CardapioController {

    @FXML
    private JFXListView<?> lista_do_cardapio;

    @FXML
    void inscriver_cardapio(ActionEvent event) {
    	ScreenManager.getInstance().showInscricao();
    }

    @FXML
    void voltar(MouseEvent event) {
    	ScreenManager.getInstance().showMenuPrincipal();
    }

}
