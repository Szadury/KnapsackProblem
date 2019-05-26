package com.company;

import java.util.LinkedList;
import java.util.List;

public class KnapsackBruteForce extends Knapsack{

    //pobierz dane do algorytmu
    //uloz algorytm w podzbiory
    //wylicz wszystkie rozmiary i wagi
    public static List<Item> findBest(DatasetKnapsack dataset){
        double bestValue = 0;
        List<Item> bestList = null;
        List<List<Item>> sub = subsets(dataset.items);

        for(List<Item> subset: sub){
            if(DatasetKnapsack.getCapacity() >= getWeight(subset)){
                double value = getValue(subset);
                if(value > bestValue) {
                    bestValue = value;
                    bestList = subset;
                }

            }
        }


        return bestList;
    }

    //Tworzenie podzbiorów
    public static List<List<Item>> subsets(List<Item> items) {

        List<List<Item>> subsets = new LinkedList<List<Item>>();
        if (items.isEmpty()) {
            subsets.add(new LinkedList<Item>());
            return subsets;
        }

        Item first = items.get(0);
        List<List<Item>> subsubsets = subsets(items.subList(1, items.size()));
        for (List<Item> subset : subsubsets) {
            subsets.add(subset);
            List<Item> augmented = new LinkedList<>(subset);
            augmented.add(0, first);
            subsets.add(augmented);
        }
        return subsets;
    }
}
