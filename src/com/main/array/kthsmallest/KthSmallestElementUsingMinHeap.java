package com.main.array.kthsmallest;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElementUsingMinHeap {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;
        System.out.println("find kth largest element:"+findKthSmallest(A,k));
    }

    private static int findKthSmallest(List<Integer> A, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);
        while (--k > 0){
            pq.poll();
        }
        return pq.peek();
    }
}
