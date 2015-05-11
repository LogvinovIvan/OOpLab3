/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryPlane;

import java.util.List;
import javaapplication21.Fighter;
import javaapplication21.Plane;

/**
 *
 * @author Иван
 */
public class FighterFactory implements IFactoryPlane{

    @Override
    public Plane setInformation( List<String> str) {
        Fighter figther = new Fighter();
        figther.SetMaxHeight(Integer.parseInt(str.get(2)));
        figther.setMaxSpeed(Integer.parseInt(str.get(3)));
        figther.setNameCompany(str.get(1));
        figther.setNameConstructor(str.get(0));
        figther.setAfterburner(Integer.parseInt(str.get(5)));
        figther.setTypePlane(figther.getClass().getSimpleName());
        return figther;
    }

    @Override
    public void GetInformation(Plane plane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
