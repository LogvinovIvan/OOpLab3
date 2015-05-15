/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inforamtion;

import java.util.List;
import javaapplication21.Plane;
import javax.swing.JPanel;

/**
 *
 * @author Иван
 */
public interface IInformation {
   public void GetInformation (Plane plane , JPanel jPanel);
   public void GetInformation (JPanel jPanel);
   public Plane SetInformation (List<String> str , Plane plane);
}
