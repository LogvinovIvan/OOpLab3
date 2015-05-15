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
public class AirLiner extends CivilPlane{
  private int numberOfSeats;
  public void setNumberOfSeats( int numberOfSeats)
  {
      this.numberOfSeats = numberOfSeats;
  }

  public int getNumberOfSeats()
  {
      return this.numberOfSeats;
  }
}
