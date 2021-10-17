package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return reverseAndSum(firstNumber) + reverseAndSum(secondNumber);
    }

    public Integer reverseAndSum(List<Integer> list) {
        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum *= 10;
            sum = (sum + list.get(i));
        }
        return sum;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i / 2 != 0 || i == 0) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> newList1 = new ArrayList<>();
        if (list.get(0).equals(list.get(list.size() - 1))) {
            newList1.add(list.get(0));
        } else {
            newList1.add(list.get(0));
            newList1.add(list.get(list.size() - 1));
        }
        return newList1;
    }
}
