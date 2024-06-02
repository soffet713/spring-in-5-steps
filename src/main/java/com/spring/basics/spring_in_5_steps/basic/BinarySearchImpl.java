package com.spring.basics.spring_in_5_steps.basic;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SortAlgorithm sortAlgorithm;

    /*
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
    */

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //Implementing sorting logic
        //Bubble Sort Algorithm - if this is implemented here, it would be tightly coupled
        //Quick Sort Algorithm - if we want to also use Quick Sort, we need to modify to make them loosely coupled

        return 3;
    }
    //Sorting an array
    //Search the array
    //Return the result
/*
    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }

 */

}
