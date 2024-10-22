package com.telran.prof.org.algoritms.homeworksix;

//1. Приведите пример использования амортизированного анализа в практике.
// Примером может быть расчет времени, которое потребуется для заполнения имеющейся базы данных.

//2. Написать код, который принимает на вход массив и число элементов,
//и возвращает новый массив, который содержит все элементы исходного массива и заданное число новых элементов.

import java.util.Arrays;

public class ArrayOne {
    private static int[] newArray;
    public static int[] arrayOne(int[] arrayTwo, int newElements) {

        newArray = new int[arrayTwo.length + newElements];

        for (int i = 0; i < arrayTwo.length; i++) {
        newArray[i] = arrayTwo[i];
        }
        return newArray;
    }
    public static int[] getNewArray() {
        return newArray;
    }
}
