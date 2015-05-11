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
public class Plane {
    private int maxHeight, maxSpeed;
    protected String nameConstructor, nameCompany;
    protected String type;
    public void SetMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;

    }
    
    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed=maxSpeed;
    }

    public void setNameConstructor(String name)
    {
        this.nameConstructor=name;
    }

    public void setNameCompany(String nameCompany)
    {
        this.nameCompany=nameCompany;
    }

    
    public void setTypePlane(String type)
    {
        this.type=type;
    }
    
    public int getMaxHeight()
    {
        return this.maxHeight;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }


    public String getNameConstructor()
    {
        return this.nameConstructor;
    }

    public String getNameCompany()
    {
        return this.nameCompany;
    }
    
    public String getType()
    {
        return this.type;
    }
}
