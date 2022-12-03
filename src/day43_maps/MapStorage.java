package day43_maps;

import java.util.HashMap;
import java.util.Map;

public class MapStorage {


    public static Map<Integer, String> exampleMapCreater (){

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101,"Ali-Can-10-H");
        studentMap.put(102,"Veli-Cem-11-M");
        studentMap.put(103,"Ali-Cem-11-H");
        studentMap.put(104,"Ayse-Can-10-H");
        studentMap.put(105,"Ayse-Cem-11-M");
        studentMap.put(106,"Fatma-Han-10-K");

        return studentMap;
    }


    public static String returnNameOfStudentBySchoolNo(Map<Integer, String> exampleMap, int studentNo) {

        // get method gets the value of the key (101)
        String valueOfElement = exampleMap.get(studentNo); // "Ali-Can-10-H"

        // we splited the value ("Ali-Can-10-H") to use it as an array
        String [] studentValues =valueOfElement.split("-"); // [Ali, Can, 10, H] an array

        // we created our return value: name (space) surname
        String nameAndSurname = studentValues[0]+ " "+ studentValues[1]; // Ali Can

        return nameAndSurname;
    }

    public static Map<Integer,String> ClassEditor(Map<Integer, String> exampleMap, int studentNumber, String newClass) {

       //by get method, we took the value of the key (107)
        String studentValue= exampleMap.get(studentNumber); //"Hasan-Son-12-J"

        // we splited the value ("Hasan-Son-12-J") to use it as an array
        String [] studentArray = studentValue.split("-"); // [Hasan, Son, 12, J]

        //we changed the class letter
        studentArray[3]=newClass;

        // We have created the new String value (order should be followed) to add the map again
        String requestedValue = studentArray[0]+"-"+
                                studentArray[1]+"-"+
                                studentArray[2]+"-"+
                                studentArray[3];

        //we have added the changed value to same map again
        exampleMap.put(studentNumber,requestedValue);

        // returned the map where it is called
        return exampleMap;
    }

    public static Map<Integer,String> studentNameEditor(Map<Integer, String> exampleMap, int studentNumberToChangeName, String newName, String newSurname) {

        // get method is used to reach the value of the key
        String keyValue=exampleMap.get(studentNumberToChangeName); //"Ali-Firtina-10-C"

        // an array is created from the value by splitting (-)
        String [] valueArray = keyValue.split("-");  // [Ali, Firtina, 10, C]

        // name and surname are assigned to the array
        valueArray[0]=newName;
        valueArray[1]=newSurname;

        //RequestedString is created to add to map
        String requestedValue = valueArray[0]+"-"+
                                valueArray[1]+"-"+
                                valueArray[2]+"-"+
                                valueArray[3];

        // new value is added to the map with the school number
        exampleMap.put(studentNumberToChangeName,requestedValue);

        // returned updated map to where it is called
        return exampleMap;
    }

    public static Map<Integer,String > classUpdate(Map<Integer, String> exampleMap, int studentNumber, String newClassLetter) {

        String keyValue=exampleMap.get(studentNumber); //Veli-Cem-11-M

        String [] valueArray = keyValue.split("-");
        valueArray[3]=newClassLetter;
        String classNumber = valueArray[2];
        int classNumberInt = Integer.parseInt(classNumber)+1;
        classNumber=""+classNumberInt;
        valueArray[2]=classNumber;

        String requestedValue = valueArray[0]+"-"+
                                valueArray[1]+"-"+
                                valueArray[2]+"-"+
                                valueArray[3];

        exampleMap.put(studentNumber,requestedValue);


        return exampleMap;


    }
}
