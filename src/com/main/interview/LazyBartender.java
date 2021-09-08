package com.main.interview;

import java.util.*;

public class LazyBartender {
    public static void main(String[] args) {

        HashMap<String, Set<String>> custMap = new HashMap<String, Set<String>>();
        custMap.put("cust1", new HashSet<String>(Arrays.asList("n3,n7,n5,n2,n9")));
        custMap.put("cust2", new HashSet<String>(Arrays.asList("n5")));
        custMap.put("cust3", new HashSet<String>(Arrays.asList("n2", "n3")));
        custMap.put("cust4", new HashSet<String>(Arrays.asList("n4")));
        custMap.put("cust5", new HashSet<String>(Arrays.asList("n3", "n4", "n5", "n7")));
        System.out.println("Total number of drinks required:"+countDrinks(custMap));
     }

    private static int countDrinks(HashMap<String, Set<String>> custMap) {
        int count = 0;
        HashMap<String, ArrayList<String>> customerDrinksMap;
        Iterator cusItr = custMap.entrySet().iterator();
        while (cusItr.hasNext()){
            Map.Entry pairs = (Map.Entry)cusItr.next();
            String customer = (String) pairs.getKey();
            Set<String>drinksSet = (Set<String>)pairs.getValue();

            String maxDrinks = new String();
            int maxDrinksCount = 0;

            customerDrinksMap = new HashMap<String, ArrayList<String>>();

            for (String set : drinksSet){
                customerDrinksMap.put(set, new ArrayList<>(Arrays.asList(customer)));

                if (customerDrinksMap.get(set).size()> maxDrinksCount){
                    maxDrinksCount = customerDrinksMap.get(set).size();
                    maxDrinks = set;
                }
                Iterator internalCusIte = custMap.entrySet().iterator();
                while (internalCusIte.hasNext()){
                    Map.Entry  internalPairs = (Map.Entry) internalCusIte.next();
                    String internalCustomer =  (String) internalPairs.getKey();

                    if(!internalCustomer.equals(customer)){

                        Set<String> internalDrinkSet = (Set<String>)internalPairs.getValue();
                        if(internalDrinkSet.contains(set)){
                            customerDrinksMap.get(set).add(internalCustomer);
                            if (customerDrinksMap.get(set).size() > maxDrinksCount){
                                maxDrinksCount = customerDrinksMap.get(set).size();
                                maxDrinks = set;

                            }

                        }

                    }
                }
            }

            ArrayList customerList = customerDrinksMap.get(maxDrinks);
            if (customerList !=  null && customerList.size() > 0){
                count ++;
                for (int index = 0;index < customerList.size(); index ++){
                    custMap.remove(customerList.get(index));
                }
            }
            cusItr = custMap.entrySet().iterator();

        }
        return  count;

    }

}
