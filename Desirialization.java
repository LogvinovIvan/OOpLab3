/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Иван
 */
public class Desirialization {
    Map<String,Class> haMap = new HashMap();

    public Desirialization() {
    haMap.put("Bomber", Bomber.class);
    haMap.put("AirLiner",  AirLiner.class);
    haMap.put("AirFreigther",  AirFreigther.class);
    haMap.put("Fighter",  Fighter.class);
       }
    
    public List<Plane> desirialize(String json)
    {
        List<Plane> list = new ArrayList<>();
        Pattern p = Pattern.compile("\\{.+?\\}");
        Matcher m = p.matcher(json);
        Object plane = new Object();
        while(m.find())
        {
            String str =m.group();
            String str1 = getTypeObject(str);
            Gson gson = new Gson();
            plane =  gson.fromJson(str, haMap.get(str1));
            list.add((Plane)plane);
        }
        return list;
    }
    
    
    private String getTypeObject(String token)
    {
        String str = token;
        Pattern p1 = Pattern.compile("\\\"type\\\"\\:\\\".+?\\\"");
        Matcher m1 = p1.matcher(str);
        m1.find(); 
         token = m1.group();
        token = token.replace("\"", "");
        token = token.replace("type:", "");
        return token;
    }
}
