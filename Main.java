package com.telran.prof.org.algoritms.homeworksix;

import java.util.Arrays;
import static com.telran.prof.org.algoritms.homeworksix.ArrayOne.arrayOne;

public class Main {

    public static void main(String[] args) {
        int[] arrayTwo = {1, 2, 3, 4, 5};
        int newElements = 3;

         int[] newArray = arrayOne(arrayTwo, newElements);

        System.out.println(Arrays.toString(newArray));
    }
}

