/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inforamtion;

import java.util.List;
import javaapplication21.AirLiner;
import javaapplication21.Plane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Иван
 */
public class AirLinerInformation implements IInformation{
    @Override
    public void GetInformation(Plane plane1, JPanel jPanel) {
       jPanel.removeAll();
       AirLiner plane = (AirLiner)plane1;
       JLabel label[] = new JLabel[6];
       label[0] = new JLabel("Имя конструктора "+plane.getNameConstructor());
       label[1] = new JLabel("Марка "+plane.getNameCompany());
       label[2]= new JLabel("Максимальная высота "+String.valueOf(plane.getMaxHeight()));
       label[3] = new JLabel("Максимальная скорость "+String.valueOf(plane.getMaxSpeed()));
       label[4] = new JLabel("Тип линии " + plane.getTypeLine());
       label[5]= new JLabel("грузоподъёмность " + String.valueOf(plane.getNumberOfSeats())); 
       
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
       label[0] = new JLabel("Имя конструктора");
       label[1] = new JLabel("Марка");
       label[2]= new JLabel("Максимальная высота");
       label[3] = new JLabel("Максимальная скорость");
       label[4] = new JLabel("Тип линии");
       label[5]= new JLabel("грузоподъёмность"); 
       
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
       AirLiner airLiner =  (AirLiner)plane;
       airLiner.SetMaxHeight(Integer.parseInt(str.get(2)));
       airLiner.setMaxSpeed(Integer.parseInt(str.get(3)));
       airLiner.setNameCompany(str.get(1));
       airLiner.setNameConstructor(str.get(0));
       airLiner.setNumberOfSeats(Integer.parseInt(str.get(5)));
       airLiner.setTypePlane(airLiner.getClass().getSimpleName());
       airLiner.setTypeLine(str.get(4));
       return airLiner;
    }
    }





