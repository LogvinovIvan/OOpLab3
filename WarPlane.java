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
public class WarPlane extends Plane{
  private String typeWeapons;
  public void setTypeWeapons(String typeWeapons)
  {
      this.typeWeapons  = typeWeapons;
  }
  
  public String getTypeWeapons()
  {
      return  this.typeWeapons;
  }
}
