/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GraphicsElements;

import java.awt.Choice;
import java.awt.TextField;
import javafx.scene.control.Label;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Иван
 */
public  class BomberGraphicsElements implements IAddGraphicsElements{

    @Override
    public void addElements(JPanel jPanel) {
       
      
       JLabel label[] = new JLabel[6];
       label[0] = new JLabel("Имя конструктора");
       label[1] = new JLabel("Марка");
       label[2]= new JLabel("Максимальная высота");
       label[3] = new JLabel("Максимальная скорость");
       label[4] = new JLabel("Тип вооружения");
       label[5]= new JLabel("Тип бомбардтровщика");
       
       
        for(int i=0; i<6; i++)
       {
           label[i].setSize(150, 20);
           label[i].setLocation(20, i*45);
           jPanel.add(label[i]);
           
       }
    jPanel.repaint();
                
    }
    
}
