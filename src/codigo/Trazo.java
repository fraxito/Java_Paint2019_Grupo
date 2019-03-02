/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.BasicStroke;

/**
 *
 * @author xp
 */
public class Trazo extends BasicStroke{
    
    public Trazo (int _grosor){
        super(_grosor);
    }
    
    public Trazo (int _grosor, boolean rayas){
        super(_grosor, BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER,20.0f,  new float[]{10.0f,10.0f},0.0f);
    }
}
