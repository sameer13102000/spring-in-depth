package com.sameer.spring.basics.springDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class binarySearchImp {

    //Dependency of the Bean

    @Autowired
    @Qualifier("quick")
    private sortAlgorithm sortAlgorithm; // Changed the Autowiring process using Type as well as the name of the instances.
    // This is done to reslove the conflicts when we have more than one Dependency and it is used as alternative of @Primary

//    public binarySearchImp(sortAlgorithm sortAlgo) {
//        this.bubbleSort = bubbleSort;
//    }
    //No need of constructor to assign thr instance as this is named under AutoWired Spring handles it automatically.

    public int binarySearchAlgo(int[] arr, int search){
        int[] numbers = sortAlgorithm.sort(arr);
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // To avoid overflow

            // Check if target is present at mid
            if (numbers[mid] == search) {
                System.out.println(sortAlgorithm);
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
