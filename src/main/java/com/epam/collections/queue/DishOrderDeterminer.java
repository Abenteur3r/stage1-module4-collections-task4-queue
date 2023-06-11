package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i =1;i<=numberOfDishes; i++){
            queue.add(i);
        }
        int index = 1;
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()){
            int elem = queue.poll();
            if(index%everyDishNumberToEat==0){
                res.add(elem);
                index=0;
            }
            else {
                queue.add(elem);
            }
            index++;
        }
        return res;
    }
}
