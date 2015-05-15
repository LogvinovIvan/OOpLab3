/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

/**
 *
 * @author Иван
 */
public class CivilPlane extends Plane{
    private String typeLine;
    
    public void setTypeLine(String typeLine)
    {
       this.typeLine = typeLine; 
    }


    public String getTypeLine ()
    {
        return  this.typeLine;
    }
}
