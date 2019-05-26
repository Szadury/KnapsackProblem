package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DatasetKnapsack {
    static int capacity;
    final List<Item> items;

    public DatasetKnapsack(int cap, List<Item> items) {
        capacity = cap;
        this.items = items;
    }

    public static int getCapacity(){
        return capacity;
    }
    public static void setCapacity(int cap){
        capacity =  cap;
    }
    static List<Item> getItems(int[] sizes, int[]value){
        List<Item> items = new ArrayList<>();
        for(int i=0; i<sizes.length; i++){
            items.add(new Item());
            items.get(i).weight = sizes[i];
            items.get(i).value = value[i];
        }
        return items;
    }
    static List<Item> randItems(int len){
        List<Item> items = new ArrayList<>();

        for(int i=0; i<len; i++){
            Random rand = new Random();
            items.add(new Item());
            items.get(i).weight = rand.nextInt(15);
            items.get(i).value = rand.nextInt(15);
        }
        return items;



    }
    public static List<DatasetKnapsack> getRandomExamples(int length){

        List<DatasetKnapsack> tmp = new ArrayList<>();
        for(int i=0; i<10; i++)
        tmp.add(new DatasetKnapsack(capacity, randItems(length)));

        return tmp;
    }
    public static List<DatasetKnapsack> getExamples(){
        List<DatasetKnapsack> tmp = new ArrayList<>();
//1
        int cap = 40;
        int[] sizes ={5,12,4,9,1,5,6,10,8,1};
        int[] value = {9,2,7,6,10,9,4,13,0,7};

        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));
//2
        sizes= new int[]{11, 0, 6, 14, 2, 8, 2, 4, 11, 3};
        value = new int[]{9, 5, 5, 8, 13, 2, 13, 9, 8, 3};

        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));

//3
        sizes= new int[]{13,0,11,10,4,2,7,6,4,11};
        value = new int[]{11,10,1,9,5,7,8,0,10,6};

        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));
//4
        sizes= new int[]{3,4,13,2,6,10,0,7,14,13};
        value = new int[]{7,11,5,2,5,4,14,3,11,7};
        tmp.add(new DatasetKnapsack(cap,getItems(sizes, value)));
//5
        sizes= new int[]{8,11,13,2,1,7,1,6,9,0};
        value= new int[]{3,8,14,7,1,13,12,9,13,12};
        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));
//6
        sizes= new int[]{7,5,4,1,12,13,0,2,12,12};
        value = new int[]{13,12,6,10,8,13,2,1,7,3};
        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));
//7
        sizes= new int[]{14,0,0,0,10,9,4,1,1,3};
        value = new int[] {5,0,3,10,5,9,0,4,11,1};
        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));
//8
        sizes= new int[]{9,6,5,8,14,10,9,10,14,10};
        value = new int[] {1,6,11,9,9,14,3,5,7,1};
        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));
//9
        sizes= new int[]{11,3,3,12,6,6,10,8,11,11};
        value = new int[] {6,6,12,6,12,1,6,7,1,3};
        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));
//10
        sizes= new int[]{4,13,4,9,12,14,10,2,4,6};
        value = new int[] {5,8,13,5,11,0,12,5,14,3};
        tmp.add(new DatasetKnapsack(cap, getItems(sizes, value)));

        return tmp;
    }

}
