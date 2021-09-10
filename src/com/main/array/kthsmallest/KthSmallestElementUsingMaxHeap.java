package com.main.array.kthsmallest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElementUsingMaxHeap {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;
        System.out.println("find kth largest element:"+findKthSmallest(A,k));
    }

    private static int findKthSmallest(List<Integer> A, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(A.subList(0,k));

        for (int i = k; i < A.size();  i++){
            if (A.get(i) < pq.peek()){
                pq.poll();
                pq.add(A.get(i));
            }
        }
        return pq.peek();
    }
}
