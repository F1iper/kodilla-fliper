package javastart.arrays;

import sun.security.util.ArrayUtil;

public class Company {


    public static double resultTab (int[] tab1, int[] tab2) {
        int tab1Counter = 0;
        int tab2Counter = 0;
        for(Integer num : tab1) {
            tab1Counter += num;
        }
        for(Integer num : tab2) {
            tab2Counter += num;
        }

        double tab1Sum = tab1Counter;
        double tab2Sum = tab2Counter;
        double tabsSum = tab1Counter + tab2Counter;
        double average1Tab = tab1Counter / tab1.length;
        double average2Tab = tab2Counter / tab2.length;
        double averageOfTabs = (tab1Counter + tab2Counter ) / (tab1.length + tab2.length);

        System.out.println("sum of tab1 [" + tab1Sum + "] and tab2 [" + tab2Sum + "] = " + tabsSum);
        System.out.println("average of tab1 : " + average1Tab);
        System.out.println("average of tab2 : " + average2Tab);
        System.out.println("Average of 2 tabs added: " + averageOfTabs);
        return tabsSum;
    }

    public static void main(String[] args) {
        int[] tab = {5, 7, 21};
        int[] tab2 = {12, 37, 25};
        double result = resultTab(tab, tab2);
        System.out.println("Result from method: " + result);

        ArraysUtils arraysUtils = new ArraysUtils();
        int sum = arraysUtils.sumArrays(tab, tab2);
        System.out.println(sum );


    }
}