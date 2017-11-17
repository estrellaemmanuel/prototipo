/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilidades;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author aehtiopicus
 */
public class LimpiaCampos {

    public static void limpiar(javax.swing.JFrame jf) {
        clean(jf);
    }

    public static void limpiar(javax.swing.JDialog jd) {
        clean(jd);
    }

    public static void limpiar(javax.swing.JPanel jp) {
        clean(jp);
    }

    public static void limpiar(javax.swing.JSplitPane jsp) {
        clean(jsp);
    }

    public static void limpiar(javax.swing.JDesktopPane jdp) {
        clean(jdp);
    }

    public static void limpiar(javax.swing.JInternalFrame jif) {
        clean(jif);

    }

    private static void clean(Object contenedor) {

        for (Field f : contenedor.getClass().getDeclaredFields()) {
            try {
                f.setAccessible(true);
                if (f.get(contenedor) instanceof JTextComponent) {
                    Method m = f.getType().getMethod("setText", String.class);
                    m.invoke( f.get(contenedor), "");//le paso el contenedor para que vea que ese atributo esta dentro del contenedor y me lo castee a jtextfield
                }
            } catch (Exception ex) {
                Logger.getLogger(LimpiaCampos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
