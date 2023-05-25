package Exceptions;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack implements Set {
    private Object[] array;
    private int counter;
    private int maxSize;

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public Object extract() {
        // Si la pila esta vacia
        if(array.length == 0){
            throw new NoSuchElementException();
        }
        counter--;
        return array[counter];
    }

    @Override
    public Object first() {
        // Si la pila esta vacia
        if(array.length == 0){
            throw new NoSuchElementException();
        }
        return array[counter - 1];
    }

    @Override
    public boolean add(Object o) {
        if(array.length < maxSize){
            array[counter] = 0;
            counter++;
            return true;
        }
        return false;
    }
    String toString(){

    }

}
