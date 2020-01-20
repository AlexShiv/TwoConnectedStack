package main;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DEQueueTest {

    @Test
    public void pushBack() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        List<String> strings = Arrays.asList("a");
        q.pushBack("a");    // очередь: a
        assertEquals("Не соответствие значений", strings, q.getList());

        strings = Arrays.asList("a", "b");
        q.pushBack("b");    // очередь: a b
        assertEquals("Не соответствие значений", strings, q.getList());

        strings = Arrays.asList("a", "b", "c");
        q.pushBack("c");    // очередь: a b c
        assertEquals("Не соответствие значений", strings, q.getList());
    }

    @Test
    public void pushFront() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        List<String> strings = Arrays.asList("a");
        q.pushFront("a");
        assertEquals("Не соответствие значений", strings, q.getList());

        strings = Arrays.asList("b", "a");
        q.pushFront("b");
        assertEquals("Не соответствие значений", strings, q.getList());

        strings = Arrays.asList("c", "b", "a");
        q.pushFront("c");
        assertEquals("Не соответствие значений", strings, q.getList());
    }

    @Test
    public void popBack() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        List<String> strings = Arrays.asList("c", "b");
        q.pushFront("a");
        q.pushFront("b");
        q.pushFront("c");
        assertEquals("Не соответствие значений", "a", q.popBack());
        assertEquals("Не соответствие значений", strings, q.getList());

        q = new DEQueue<>();
        assertNull("Не соответствие значений", q.popBack());

    }

    @Test
    public void popFront() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        List<String> strings = Arrays.asList("b", "a");
        q.pushFront("a");
        q.pushFront("b");
        q.pushFront("c");
        assertEquals("Не соответствие значений", "c", q.popFront());
        assertEquals("Не соответствие значений", strings, q.getList());

        q = new DEQueue<>();
        assertNull("Не соответствие значений", q.popFront());
    }

    @Test
    public void back() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        q.pushFront("a");
        q.pushFront("b");
        q.pushFront("c");
        assertEquals("Не соответствие значений", "a", q.back());

        q = new DEQueue<>();
        assertNull("Не соответствие значений", q.back());
    }

    @Test
    public void front() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        q.pushFront("a");
        q.pushFront("b");
        q.pushFront("c");
        assertEquals("Не соответствие значений", "c", q.front());

        q = new DEQueue<>();
        assertNull("Не соответствие значений", q.front());
    }

    @Test
    public void size() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        q.pushFront("a");
        q.pushFront("b");
        q.pushFront("c");
        assertEquals("Не соответствие значений", 3, q.size());

        q = new DEQueue<>();
        assertEquals("Не соответствие значений", 0, q.size());

    }

    @Test
    public void clear() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        q.pushFront("a");
        q.pushFront("b");
        q.pushFront("c");

        q.clear();
        assertEquals("Не соответствие значений", new ArrayList<>(), q.getList());
    }

    @Test
    public void toArray() {
        DEQueue<String> q = new DEQueue<>();     // Создание очереди для хранения строк
        q.pushFront("a");
        q.pushFront("b");
        q.pushFront("c");

        String[] strings = Arrays.asList("c", "b", "a").toArray(new String[q.size()]);
        assertArrayEquals("Не соответствие значений", strings, q.toArray());

    }
}