package com.main.java8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ParallelSort {
    public static void main(String[] args) {
        int numbers[] = {22, 89, 1, 32, 19, 5};
        /* Specifying the start and end index. The start index is
         * 1 here and the end index is 5. which means the the elements
         * starting from index 1 till index 5 would be sorted.
         */
        Arrays.parallelSort(numbers,1,3);
        Arrays.stream(numbers).forEach(n -> System.out.println(n+" "));
    }
}
