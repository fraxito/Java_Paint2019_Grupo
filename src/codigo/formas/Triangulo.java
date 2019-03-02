/*
 * esta clase dibuja triángulos

 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Triangulo extends Forma {

    public Triangulo(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del triángulo correctamente para que guarde 3 lados
        super(_posX, _posY, 3, _color, _relleno);
    }

}
