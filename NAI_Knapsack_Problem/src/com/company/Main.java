package com.company;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DatasetKnapsack> datasets = DatasetKnapsack.getExamples();
        List<DatasetKnapsack> randData = DatasetKnapsack.getRandomExamples(10);

            //Dla kazdego zbioru danych
            for (DatasetKnapsack data : randData) {

                long timeStart = System.nanoTime();
                List<Item> tmp = KnapsackBruteForce.findBest(data);
                long timeStop = System.nanoTime();
                System.out.println(timeStop - timeStart);
                System.out.println(tmp);
                System.out.println("Its value: " + KnapsackBruteForce.getValue(tmp));
                System.out.println("Its weight: " + KnapsackBruteForce.getWeight(tmp) + "\n");

                long timeStart2 = System.nanoTime();
                List<Item> greedy = GreedyKnapsack.findBest(data);
                long timeStop2 = System.nanoTime();
                System.out.println(timeStop2 - timeStart2);
                System.out.println(greedy);
                System.out.println("Its value: " + GreedyKnapsack.getValue(greedy));
                System.out.println("Its weight: " + GreedyKnapsack.getWeight(greedy) + "\n");

                System.out.println("==========================================================================================================");

            }

        }
    }

