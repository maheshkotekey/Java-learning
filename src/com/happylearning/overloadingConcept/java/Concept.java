package com.happylearning.overloadingConcept.java;

public class Concept {
    public int learning(int e){
        System.out.println(e);
        return 0;

    }
    public String learning(int a,int b){
        System.out.println(a+b);
        return "ab";

    }
    public void learning(char d){
        System.out.println(d);
    }
}
