package by.itacademy.hw10.task1;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static Set<?> union(Set<?> set1, Set<?> set2){
        Set<Object> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public static Set<?> intersect(Set<?> set1, Set<?> set2){

        Set<Object> intersectSet = new HashSet<>();
        for (Object set : set1){
            if(set2.contains(set)) intersectSet.add(set);
        }
        return intersectSet;
    }

    public static void main(String[] args) {
        Set<MyObject> set1 = new HashSet<>();
        Set<MyObject> set2 = new HashSet<>();

        set1.add(new MyObject(1));
        set1.add(new MyObject(2));
        set1.add(new MyObject(3));
        set1.add(new MyObject(4));
        set1.add(new MyObject(5));

        set2.add(new MyObject(3));
        set2.add(new MyObject(4));
        set2.add(new MyObject(5));
        set2.add(new MyObject(6));
        set2.add(new MyObject(7));

        System.out.println("множество 1: " + set1);
        System.out.println("множество 2: " + set2);

        System.out.println("объединение множеств: " + union(set1, set2));
        System.out.println("пересечение множеств: " + intersect(set1, set2));


    }

}
