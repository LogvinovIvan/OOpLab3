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
public class Bomber extends WarPlane{
   protected String typeBomber;
   public void setTypeBomber( String typeBomber)
   {
       this.typeBomber = typeBomber;
   }
   
   public String getTypeBomber ()
   {
       return this.typeBomber;
   }
}
