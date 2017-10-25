/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Santosh Goteti
 */
public class LinkedHashDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LinkedHashMap lhm = new LinkedHashMap<String, Double>();

        lhm.put("Zara", 233.66);

        lhm.put("jolain", 546.5);

        lhm.put("kristin", 345.6);

        lhm.put("zweiefel", 444.44);

        lhm.put("trcicia", 23.89);

        Set set = lhm.keySet();

        Iterator itr = set.iterator();

        while (itr.hasNext()) {

            //  Map.Entry me = (Map.Entry) itr.next();
            String s1 = (String) itr.next();
            System.out.println("Name of Person is  " + s1 + " Balance is " + lhm.get(s1));
            //System.out.println(me.getValue());
        }

        double balance = ((Double) lhm.get("Zara")).doubleValue();
        lhm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + lhm.get("Zara"));

    }

}
