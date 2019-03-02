/*
 * esta clase dibuja triángulos

 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Estrella extends Forma {

    public Estrella(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del triángulo correctamente para que guarde 3 lados
        super(_posX, _posY, 256, _color, _relleno);
    }

    
    @Override 
    public void calculaVertices(int _radio, double _giro){
        int n = 20; 
        for(int i=0; i<npoints; i++){
            //this.xpoints[i] = (int) (x + _radio*Math.cos((2*Math.PI * i + _giro)/npoints));
            this.xpoints[i] = (int) (x + (_radio/(i%n +1))*Math.cos((2*Math.PI * i + _giro/(i%n +1))/npoints));
            //this.xpoints[i+2] = (int) (x + (_radio/3)*Math.cos((2*Math.PI * i + _giro/3)/npoints));
            
            //this.ypoints[i] = (int) (y + _radio*Math.sin((2*Math.PI * i + _giro)/npoints));
            this.ypoints[i] = (int) (y + (_radio/(i%n +1))*Math.sin((2*Math.PI * i + _giro/(i%n +1))/npoints));
            //this.ypoints[i+2] = (int) (y + (_radio/3)*Math.sin((2*Math.PI * i + _giro/3)/npoints));
            //i++;i++;
        }
    }
    
}
