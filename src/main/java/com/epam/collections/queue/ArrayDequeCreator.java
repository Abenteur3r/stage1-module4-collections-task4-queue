package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public void addFirst(ArrayDeque<Integer> arrayDeque, Queue<Integer> firstQueue){
        for(int i =0; i<2;i++){
            arrayDeque.add(firstQueue.poll());
        }
    }
    public void addSecond(ArrayDeque<Integer> arrayDeque, Queue<Integer> secondQueue){
        for(int i =0; i<2;i++){
            arrayDeque.add(secondQueue.poll());
        }
    }
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        addFirst(arrayDeque,firstQueue);
        addSecond(arrayDeque,secondQueue);
        while(!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.add(arrayDeque.pollLast());
            addFirst(arrayDeque,firstQueue);
            secondQueue.add(arrayDeque.pollLast());
            addSecond(arrayDeque,secondQueue);
        }
        return  arrayDeque;
    }
}
