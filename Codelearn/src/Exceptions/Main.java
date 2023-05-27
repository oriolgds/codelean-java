package Exceptions;

import java.util.NoSuchElementException;

interface Set {
    boolean isEmpty();
    Object extract();
    Object first();
    boolean add(Object o);
}

class Stack implements Set {
    private final Object[] array;
    private int counter;
    private final int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.array = new Object[maxSize];
        this.counter = 0;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public Object extract() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        counter--;
        Object element = array[counter];
        array[counter] = null;
        return element;
    }

    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return array[counter - 1];
    }

    public boolean add(Object o) {
        if (counter >= maxSize) {
            return false;
        }

        array[counter] = o;
        counter++;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = counter - 1; i >= 0; i--) {
            sb.append(array[i]);
            sb.append("\n");
        }
        int length = sb.length();
        sb.deleteCharAt(length - 1);
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.add(1);
        s.add(10);
        s.add(100);
        s.add(1000);

        System.out.println(s);

        System.out.println("The first element of the stack is " + s.first());

        s.extract();
        s.extract();

        System.out.println("The first element of the stack is " + s.first());

        System.out.println(s);
    }
}
