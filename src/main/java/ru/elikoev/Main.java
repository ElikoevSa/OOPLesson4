package ru.elikoev;

import ru.elikoev.customarraylist.GbList;
import ru.elikoev.customarraylist.impl.GbArrayList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> gbList = new GbArrayList<>();
        gbList.add(55);
        gbList.add(22);
        gbList.add(23);
        System.out.println(gbList);
        System.out.println(gbList.get(1));
        gbList.remove(1);
        System.out.println(gbList);
    }
}