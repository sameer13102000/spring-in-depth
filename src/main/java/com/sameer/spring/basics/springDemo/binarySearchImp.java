package com.sameer.spring.basics.springDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class binarySearchImp {

    //Dependency of the Bean
    @Autowired
    private sortAlgorithm sortAlgo;

    public binarySearchImp(sortAlgorithm sortAlgo) {
        this.sortAlgo = sortAlgo;
    }

    public int binarySearchAlgo(int[] arr, int search){
        int[] numbers = sortAlgo.sort(arr);
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // To avoid overflow

            // Check if target is present at mid
            if (numbers[mid] == search) {
                return (mid+1);
            }

            // If target is greater, ignore left half
            if (numbers[mid] < search) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
