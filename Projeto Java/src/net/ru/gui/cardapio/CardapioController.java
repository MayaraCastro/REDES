package net.ru.gui.cardapio;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import net.ru.gui.ScreenManager;
import net.ru.gui.menuPrincipal.MenuPrincipalController;
import net.ru.negocio.gerenciamento.Fachada;

public class CardapioController implements Initializable {

	private Fachada f;

	@FXML
	private Label texto_almoco;

	@FXML
	private Label texto_jantar;

	public CardapioController() throws IOException {
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
