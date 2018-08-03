package net.ru.gui.menuPrincipal;
import net.ru.gui.*;
import net.ru.negocio.*;
import com.gluonhq.charm.glisten.control.CardPane;
import javafx.fxml.FXML;

public class MenuPrincipalController {

    @FXML
    private CardPane<?> lista_dias_da_semana;
    
    public void pegar() {
    	System.out.println("iii");
    	System.out.println(this.lista_dias_da_semana.getOnMouseClicked());
    	}

}
