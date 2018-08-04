package net.ru.gui.menuPrincipal;
import net.ru.gui.*;
import net.ru.negocio.*;
import net.ru.negocio.gerenciamento.Fachada;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;

import com.gluonhq.charm.glisten.control.CardPane;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MenuPrincipalController {
	private Fachada f;

	private static Calendar data;

    @FXML
    private CardPane<?> lista_dias_da_semana;

    @FXML
    private Label segunda;

    @FXML
    private Label terca;

    @FXML
    private Label quarta;

    @FXML
    private Label quinta;

    @FXML
    private Label sexta;

    Calendar calendar = Calendar.getInstance();
    int day = calendar.get(Calendar.DAY_OF_WEEK); 
    
    public MenuPrincipalController() throws IOException 
	{
    	this.f = Fachada.getInstance();
	}

    @FXML
    void quarta(MouseEvent event) {
    	int sub = calendar.get(Calendar.DAY_OF_WEEK) - Calendar.WEDNESDAY; 
  
    	calendar.set(Calendar.getInstance().getWeekYear(),calendar.getTime().getMonth(), Calendar.DAY_OF_MONTH - sub);
    	System.out.println(calendar.getTime());
    	//System.out.println(Calendar..WEEK_OF_YEAR);
    	MenuPrincipalController.setData(Calendar.getInstance());

    	ScreenManager.getInstance().showCardapio();

    	
    }

    @FXML
    void quinta(MouseEvent event) {
    	MenuPrincipalController.setData(Calendar.getInstance());
    	ScreenManager.getInstance().showCardapio();
    }

    @FXML
    void segunda(MouseEvent event) {
    	MenuPrincipalController.setData(Calendar.getInstance());
    	ScreenManager.getInstance().showCardapio();

    }

    @FXML
    void sexta(MouseEvent event) {
    	MenuPrincipalController.setData(Calendar.getInstance());
    	ScreenManager.getInstance().showCardapio();

    }

    @FXML
    void terca(MouseEvent event) {
    	MenuPrincipalController.setData(Calendar.getInstance());
    	ScreenManager.getInstance().showCardapio();

    }
    
    public static Calendar getData() {
    	return data;
    }
    public static void setData(Calendar date) {
    	data = date;
    }

}
