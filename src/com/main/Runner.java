package com.main;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        MarketJSON marketJSON = new MarketJSON(); 

        PlushData plushData1 = new PlushData();

        plushData1.setPlush("RedBird");
        plushData1.setPrice(80);


        PlushData plushData2 = new PlushData();
        plushData2.setPlush("Stell");
        plushData2.setPrice(90);


        PlushData plushData3 = new PlushData();
        plushData3.setPlush("Pig");
        plushData3.setPrice(75);


        List<PlushData> plushDataList = new ArrayList<>();

        plushDataList.add(plushData1);
        plushDataList.add(plushData2);
        plushDataList.add(plushData3);

        marketJSON.setPlushDataList(plushDataList);

String s=marketJSON.toString();
        System.out.println(":::::::"+marketJSON.toString());
        System.out.println(":::::::"+s);




    }

}
