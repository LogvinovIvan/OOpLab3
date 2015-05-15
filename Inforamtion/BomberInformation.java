/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inforamtion;

import java.util.List;
import javaapplication21.Bomber;
import javaapplication21.Plane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Иван
 */
public class BomberInformation implements IInformation{
    @Override
    public void GetInformation(Plane plane1, JPanel jPanel) {
       jPanel.removeAll();
       Bomber plane = (Bomber)plane1;
       JLabel label[] = new JLabel[6];
       label[0] = new JLabel("Имя конструктора "+plane.getNameConstructor());
       label[1] = new JLabel("Марка "+plane.getNameCompany());
       label[2]= new JLabel("Максимальная высота "+String.valueOf(plane.getMaxHeight()));
       label[3] = new JLabel("Максимальная скорость "+String.valueOf(plane.getMaxSpeed()));
       label[4] = new JLabel("Тип оружия " + plane.getTypeWeapons());
       label[5]= new JLabel("грузоподъёмность " + String.valueOf(plane.getTypeBomber())); 
       
       for(int i=0; i<6; i++)
       {
           label[i].setSize(200, 20);
           label[i].setLocation(10, i*45);
           jPanel.add(label[i]);
           
       }
    jPanel.repaint();
    }

    @Override
    public void GetInformation(JPanel jPanel) {
         jPanel.removeAll();
      
       JLabel label[] = new JLabel[6];
       label[0] = new JLabel("Имя конструктора ");
       label[1] = new JLabel("Марка ");
       label[2]= new JLabel("Максимальная высота ");
       label[3] = new JLabel("Максимальная скорость ");
       label[4] = new JLabel("Тип оружия " );
       label[5]= new JLabel("грузоподъёмность "); 
       
       for(int i=0; i<6; i++)
       {
           label[i].setSize(200, 20);
           label[i].setLocation(10, i*45);
           jPanel.add(label[i]);
           
       }
    jPanel.repaint();
    }

    @Override
    public Plane SetInformation(List<String> str, Plane plane) {
        Bomber bomber = (Bomber)plane;
        bomber.SetMaxHeight(Integer.parseInt(str.get(2)));
        bomber.setMaxSpeed(Integer.parseInt(str.get(3)));
        bomber.setNameCompany(str.get(1));
        bomber.setNameConstructor(str.get(0));
        bomber.setTypeBomber(str.get(5));
        bomber.setTypePlane(bomber.getClass().getSimpleName());
        bomber.setTypeWeapons(str.get(4));
        return bomber;
    }
    
}
