/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/* Clase que permite obtener el texto del radio button seleccionado dentro
 * de un grupo de radio buttons para el tipo de colegio
 * @return null
 */
public class GroupButtonUtils {
    public String getSelectedButtonText(ButtonGroup btnButtonGroup) {
        for (Enumeration<AbstractButton> buttons = btnButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
}
