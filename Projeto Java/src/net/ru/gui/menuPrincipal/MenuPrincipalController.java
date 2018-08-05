package net.ru.gui.menuPrincipal;

import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.CardPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import net.ru.gui.ScreenManager;

@SuppressWarnings("deprecation")
public class MenuPrincipalController implements Initializable {

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

	private Calendar calendar;

	@FXML
	void quarta(MouseEvent event) {
		if (Calendar.getInstance().getTime().getDay() == 6)
			calendar.add(Calendar.DAY_OF_MONTH, 4);
		else
			calendar.add(Calendar.DATE, 3 - Calendar.getInstance().getTime().getDay());

		MenuPrincipalController.setData(calendar);

		ScreenManager.getInstance().showCardapio();

	}

	@FXML
	void quinta(MouseEvent event) {
		if (Calendar.getInstance().getTime().getDay() == 6)
			calendar.add(Calendar.DAY_OF_MONTH, 5);
		else
			calendar.add(Calendar.DATE, 4 - Calendar.getInstance().getTime().getDay());

		MenuPrincipalController.setData(calendar);
		ScreenManager.getInstance().showCardapio();

	}

	@FXML
	void segunda(MouseEvent event) {

		if (Calendar.getInstance().getTime().getDay() == 6)
			calendar.add(Calendar.DAY_OF_MONTH, 2);
		else
			calendar.add(Calendar.DATE, 1 - Calendar.getInstance().getTime().getDay());

		MenuPrincipalController.setData(calendar);
		ScreenManager.getInstance().showCardapio();
	}

	@FXML
	void sexta(MouseEvent event) {
		if (Calendar.getInstance().getTime().getDay() == 6)
			calendar.add(Calendar.DAY_OF_MONTH, 6);
		else
			calendar.add(Calendar.DATE, 5 - Calendar.getInstance().getTime().getDay());

		MenuPrincipalController.setData(calendar);
		ScreenManager.getInstance().showCardapio();
	}

	@FXML
	void terca(MouseEvent event) {

		if (Calendar.getInstance().getTime().getDay() == 6)
			calendar.add(Calendar.DAY_OF_MONTH, 3);
		else
			calendar.add(Calendar.DATE, 2 - Calendar.getInstance().getTime().getDay());

		MenuPrincipalController.setData(calendar);
		ScreenManager.getInstance().showCardapio();

	}

	public static Calendar getData() {
		return data;
	}

	public static void setData(Calendar date) {
		data = date;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.calendar = Calendar.getInstance();
	}

}
