/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryPlane;

import java.util.List;
import javaapplication21.Plane;

/**
 *
 * @author Иван
 */
public interface IFactoryPlane {
    public Plane setInformation(List<String> str);
    public void GetInformation (Plane plane);
}
