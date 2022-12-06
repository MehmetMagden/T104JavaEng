package day44_maps;

import day43_maps.MapStorage;

import java.util.Map;

public class C06_Maps {

    public static void main(String[] args) {

        Map<Integer,String> exampleMap= MapStorage.exampleMapCreater();
        System.out.println(exampleMap);

        // surnames should be all capitals

        exampleMap=MapStorage.makeSurnamesAllCapitals(exampleMap);
        System.out.println(exampleMap);






    }
}
