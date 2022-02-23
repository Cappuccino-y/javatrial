package Map61B;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMap<K, V> implements Iterable<K> {
    int size;
    private K[] keys;
    private V[] values;

    public ArrayMap() {
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    private int keyIndex(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(K key) {
        int index = keyIndex(key);
        return index > -1;
    }

    public void put(K key, V value) {
        int index = keyIndex(key);
        if (index == -1) {
            keys[size] = key;
            values[size] = value;
            size = size + 1;
            return;
        }
        values[index] = value;
    }

    public V get(K key) {
        int index = keyIndex(key);
        if (index == -1) {
            throw new IllegalArgumentException("The key provided " + key + " was not in the ArrayMap.");
        }
        return values[index];
    }

    public int size() {
        return size;
    }

    public List<K> keys() {
        List<K> keylist = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            keylist.add(keys[i]);
        }
        return keylist;
    }

    @Test
    public void test() {
        ArrayMap<String, Integer> am = new ArrayMap<>();
        am.put("asdwe", 5);
        am.put("lyy", 5);
        am.put("asdwe", 10);
        am.put("nobody", 0);
        int expected = 5;
        assertEquals((Integer) expected, am.get("lyy"));
        for (String each : am) {
            System.out.println(each);
        }

    }

    @Override
    public Iterator<K> iterator() {
        return new keyIterator();
    }

    private class keyIterator implements Iterator<K> {
        int wizardposition;

        keyIterator() {
            wizardposition = 0;
        }

        @Override
        public boolean hasNext() {
            return wizardposition < size;
        }

        @Override
        public K next() {
            int temp = wizardposition;
            wizardposition += 1;
            return keys[temp];
        }

    }
}
