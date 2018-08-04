package net.ru.gui.login;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import net.ru.negocio.beans.*;
import net.ru.negocio.gerenciamento.Fachada;
import net.ru.gui.*;
public class LoginController {

	private Fachada f;
	private static Usuario user;

    @FXML
    private  TextField caixa_usuario;

    @FXML
    private PasswordField caixa_senha;

    @FXML
    private Button button_logar;
   
    public LoginController() throws IOException 
	{
    	this.f = Fachada.getInstance();
	}
    
    @FXML
    void logar(ActionEvent event) {
    	this.f = Fachada.getInstance();

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

}

