/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryPlane;

import java.util.List;
import javaapplication21.AirLiner;
import javaapplication21.Plane;

/**
 *
 * @author Иван
 */
public class AirLinerFactory implements IFactoryPlane{
    
  

    @Override
    public Plane setInformation(List<String> str) {
       AirLiner airLiner = new AirLiner();
       airLiner.SetMaxHeight(Integer.parseInt(str.get(2)));
       airLiner.setMaxSpeed(Integer.parseInt(str.get(3)));
       airLiner.setNameCompany(str.get(1));
       airLiner.setNameConstructor(str.get(0));
       airLiner.setNumberOfSeats(Integer.parseInt(str.get(5)));
       airLiner.setTypePlane(airLiner.getClass().getSimpleName());
       return airLiner;
    }

    @Override
    public void GetInformation(Plane plane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
