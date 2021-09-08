package com.main.array;

public class SplitStringToArray {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String objectId = "siddharth,sonwane,dehugoan";

        String objectType = "Issue";
        sb.append("AND");

        String[] array = objectId.split(",");

        int count = 0;

        for (String val : array){

            count ++;
            sb.append("[");
            sb.append(objectType);
            sb.append("].[Name] LIKE' ");
            sb.append(val);
            sb.append("% '");

            if(count != array.length){
                sb.append("OR");
            }
       }

        /*sb.append("[");
        sb.append(objectType);
        sb.append("].[Name] LIKE' ");
        sb.append(objectId);
        sb.append("% '");
*/

        System.out.println("::::::"+sb);


    }


}
