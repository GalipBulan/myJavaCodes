package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_pratik {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        String[] animalsList = {"cats", "dog", "rat", "bird"};

        String[] tur = {"kanatlilar", "surungenler", "etciller"};


        for (int i = 0; i <animalsList.length; i++) {

            animals.add(animalsList[i]);

        }


        for (int j = 0; j < tur.length; j++) {

            animals.add(tur[j]);


        }
        System.out.println("");

        System.out.println(animals);

    }

}