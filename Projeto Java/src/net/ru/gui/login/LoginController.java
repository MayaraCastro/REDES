package net.ru.gui.login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import net.ru.negocio.beans.*;
import net.ru.negocio.gerenciamento.Fachada;
import net.ru.gui.*;
public class LoginController implements Initializable {

	private Fachada f;
	private static Usuario user;

    @FXML
    private  TextField caixa_usuario;

    @FXML
    private PasswordField caixa_senha;

    @FXML
    private Button button_logar;
    
    @FXML
    void logar(ActionEvent event) {
		try {
			this.f.login(Integer.parseInt(caixa_usuario.getText()), caixa_senha.getText());
			user = f.getLogado();
			//JOptionPane.showMessageDialog(null,"Login com sucesso!" );
			
			this.chamarTelaPrincipal();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro no Login");
		}
    }
    
    public void chamarTelaPrincipal()throws IOException{
    	ScreenManager.getInstance().showMenuPrincipal();
    }
    
    public static Usuario getUser() {
		
		return LoginController.user;
	}
    
    public static void setUser(Usuario user) {
		LoginController.user = user;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		f = Fachada.getInstance();
		try {
			this.f.conexao("root", "");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			ScreenManager.getInstance().fecharMainStage();
		}
	}

}

