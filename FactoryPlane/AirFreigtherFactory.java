/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryPlane;

import java.awt.TextField;
import java.util.List;
import javaapplication21.AirFreigther;
import javaapplication21.Plane;

/**
 *
 * @author Иван
 */
public class AirFreigtherFactory implements IFactoryPlane{

    @Override
    public Plane setInformation(List<String> str) {
        AirFreigther airFreigther = new AirFreigther();
        airFreigther.SetMaxHeight(Integer.parseInt(str.get(2)));
        airFreigther.setMaxSpeed(Integer.parseInt(str.get(3)));
        airFreigther.setNameCompany(str.get(1));
        airFreigther.setNameConstructor(str.get(0));
        airFreigther.setCargoWeight(Integer.parseInt(str.get(5)));
        airFreigther.setTypePlane(airFreigther.getClass().getSimpleName());
        return airFreigther;
    }

    @Override
    public void GetInformation(Plane plane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
