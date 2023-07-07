package front_end;
/**
 * Desarrolado por Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import java.util.Objects;
public class JcomBoxRender extends JLabel implements ListCellRenderer {
    Hashtable<Object, ImageIcon> Elementos;
    //imagen por defecto encaso que no carque ninguna
    ImageIcon mImag = new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/porDefecto.png")))
            .getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH));

    public JcomBoxRender (Hashtable <Object,ImageIcon> Elemontos){
        this.Elementos=Elemontos;
    }
    //valido el texto y las imagenes que le voy a colocar en el Combobox
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if(Elementos.get(value)==null){
            setIcon(mImag);
        }else{
            setIcon(Elementos.get(value));
        }
        setText(value.toString());

        return this;
    }
}
