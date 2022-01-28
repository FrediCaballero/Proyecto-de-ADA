/*
    EQUIPO 2: 
Arango Quispe, Esmeralda (19200300)
Caballero Leon, Fredi Alexander (18200076)
Magallanes Quiroz, Claudia Carolina (18200331)
Rivas Rodriguez, Catherine Lesly (18200289)
Rojas Rojas, Mauro Alexander (18200318)
======================================TRES EN RAYA========================================= 
 Clase principal (Main) 
*/
package scripts;

import Escena.Menu;
import Escenario.Escenario;

public class Main {

    public static void main(String[] args) {
        Escenario frm = new Escenario(); //creando escenario
        Menu menu = new Menu(frm); 
        frm.setSize(menu.getWidth(), menu.getHeight());
        frm.add(menu, 0, 0);
        frm.setResizable(false);
        frm.setLocationRelativeTo(menu);
        frm.setTitle("3 en Rayas");
        frm.setVisible(true);
    }

}
