package day19_Arrays;

import java.util.Arrays;

public class C08_AddingNewValue {

    public static void main(String[] args) {

        // how to add another element to array


        int [] abc = { 3,5,3,6,8,5,3,6};

        int numberToAdd =10;

        addNewValueToArray(abc,numberToAdd);

    }

    public static void addNewValueToArray(int [] arr,int numberToAdd){

        int[] longerArr = new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {
            longerArr[i]=arr[i];

        }
        longerArr[longerArr.length-1]=numberToAdd;
        System.out.println(Arrays.toString(longerArr));
    }

}
