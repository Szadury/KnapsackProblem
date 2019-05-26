package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GreedyKnapsack extends Knapsack{
    public static List<Item> findBest(DatasetKnapsack dataset){
        List<Item> bestList = new ArrayList<Item>();
        List<Item> allItems = dataset.items;

        Collections.sort(allItems, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                return Double.compare(item2.getRatio(), item1.getRatio());
            }
        });

            int capasityLeft = DatasetKnapsack.getCapacity();
        for(Item item: allItems){
            if(capasityLeft-item.weight>=0){
                capasityLeft -= item.weight;
                bestList.add(item);
            }
            else break;
        }
        return bestList;
    }

}
