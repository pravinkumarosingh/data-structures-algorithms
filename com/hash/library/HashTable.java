package com.hash.library;

import java.util.LinkedList;

public class HashTable<Integer, String> {
    private class Entry{
        private int key;

        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }


    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        int index = hash(key);
        if(entries[index]==null)
            entries[index] = new LinkedList<>();


        LinkedList<Entry> bucket = entries[index];
        for(Entry entry:bucket){
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key,value));
    }

    public String get(int key){
        Entry entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }

    public void remove(int key){
        Entry entry = getEntry(key);
        if(entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private Entry getEntry(int key){
        LinkedList<Entry> bucket = getBucket(key);
        if(bucket != null){
            for (Entry entry:bucket){
                if(entry.key==key)
                    return entry;
            }
        }
        return  null;
    }

    private int hash(int key) {
        return key%entries.length;
    }
}
