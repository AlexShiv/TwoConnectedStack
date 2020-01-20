package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEQueue<T> {

    private List<T> list = new ArrayList<>();

    public void pushBack(T value) {
        list.add(value);
    }

    public void pushFront(T value) {
        list.add(0, value);
    }

    public T popBack() {
        if (size() != 0) {
            int index = size() - 1;
            T result = list.get(index);
            list.remove(index);
            return result;
        }
        return null;
    }

    public T popFront() {
        if (size() != 0) {
            T result = list.get(0);
            list.remove(0);
            return result;
        }
        return null;
    }

    public T back() {
        if (size() != 0) {
            return list.get(size()-1);
        }
        return null;
    }

    public T front() {
        if (size() != 0) {
            return list.get(0);
        }
        return null;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list = new ArrayList<>();
    }

    public Object[] toArray() {
        T[] arr = (T[]) new Object[size()];
        return list.toArray(arr);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
