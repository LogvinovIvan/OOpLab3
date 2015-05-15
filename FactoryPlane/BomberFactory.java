/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryPlane;

import java.util.List;
import javaapplication21.AirFreigther;
import javaapplication21.Bomber;
import javaapplication21.Plane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Иван
 */
public class BomberFactory implements IFactoryPlane{

    @Override
    public Plane setInformation() {
        Bomber bomber = new Bomber();
        return bomber;
    }

    
    
}
