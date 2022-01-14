package scripts;

import Escena.Menu;
import Escenario.Escenario;

public class Main {

    public static void main(String[] args) {
        Escenario frm = new Escenario();
        Menu menu = new Menu(frm);
        frm.setSize(menu.getWidth(), menu.getHeight());
        frm.add(menu, 0, 0);
        frm.setResizable(false);
        frm.setLocationRelativeTo(menu);
        frm.setTitle("3 en Rayas");
        frm.setVisible(true);
    }

}
