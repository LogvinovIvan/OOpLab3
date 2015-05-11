/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryPlane;

import java.util.List;
import javaapplication21.Bomber;
import javaapplication21.Plane;

/**
 *
 * @author Иван
 */
public class BomberFactory implements IFactoryPlane{

    @Override
    public Plane setInformation( List<String> str) {
        Bomber bomber = new Bomber();
        bomber.SetMaxHeight(Integer.parseInt(str.get(2)));
        bomber.setMaxSpeed(Integer.parseInt(str.get(3)));
        bomber.setNameCompany(str.get(1));
        bomber.setNameConstructor(str.get(0));
        bomber.setTypeBomber(str.get(5));
        bomber.setTypePlane(bomber.getClass().getSimpleName());
        return bomber;
    }

    @Override
    public void GetInformation(Plane plane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
