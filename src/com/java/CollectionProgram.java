package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionProgram {
public static void main (String arg[]) {
 ArrayList list= new ArrayList();
 Collections.addAll(list, "B","A","C");
 list.forEach(System.out::print);
}
}
