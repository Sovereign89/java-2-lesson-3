package ru.geekbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(15);
        /*1*/stringList.add("Fork");
        /*2*/stringList.add("Knife");
        /*3*/stringList.add("Plate");
        /*4*/stringList.add("Knife");
        /*5*/stringList.add("Plate");
        /*6*/stringList.add("Table");
        /*7*/stringList.add("Fork");
        /*8*/stringList.add("Spoon");
        /*9*/stringList.add("Fork");
        /*10*/stringList.add("Ladle");
        /*11*/stringList.add("Plate");
        /*12*/stringList.add("Knife");
        /*13*/stringList.add("Kettle");
        /*14*/stringList.add("Ladle");
        /*15*/stringList.add("Spoon");

        HashMap<String, Integer> countWords = new HashMap<>();

        ArrayList<String> uniqueList = new ArrayList<>();
        for (String element:stringList) {
            if (!uniqueList.contains(element))
                uniqueList.add(element);
            if (!countWords.containsKey(element)) {
                countWords.put(element,1);
            } else {
                int count = countWords.get(element);
                countWords.put(element,count+1);
            }
        }

        stringList = null;

        for (String element:uniqueList) {
            System.out.println(element);
        }

        uniqueList = null;
        System.out.println();

        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            System.out.println(entry.getKey()+" repeats "+entry.getValue()+" times");
        }

        countWords = null;
        System.out.println();

        PhoneDictionary pd = new PhoneDictionary();

        String person1 = "Лапин";
        String person2 = "Сырец";
        String person3 = "Плюшкин";

        ArrayList<String> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        pd.add(person1,"8(913)3453232");
        pd.add(person2,"8(876)1983277");
        pd.add(person1,"8(982)9832763");
        pd.add(person3,"8(924)2879425");
        pd.add(person3,"8(573)8715249");
        pd.add(person3,"8(118)5351761");

        for (String person:persons) {
            ArrayList<String> phones;

            phones = pd.get(person);

            System.out.println(person+" has the following phone numbers:");

            for (String element:phones) {
                System.out.println(element);
            }

            System.out.println();
        }

    }
}
