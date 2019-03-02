/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;


/**
 *
 * @author xp
 */
public class Circulo extends Forma{
       
    public Circulo(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del círculo correctamente para que guarde 100 lados
        super(_posX, _posY, 5000, _color, _relleno);
    }
}
