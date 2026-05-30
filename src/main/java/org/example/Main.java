package org.example;

import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("a");
        v.add("b");

        for(int i = 0 ;i < v.size(); i++){
            v.add(String.valueOf(i));
            System.out.println(v);

        }
    }
}