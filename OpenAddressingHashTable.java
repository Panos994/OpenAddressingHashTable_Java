/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import com.mycompany.app.Dictionary.Entry;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author JohnBaizanis
 */
public class OpenAddressingHashTable<K,V> implements Dictionary<K,V> {
    
    private Integer b=4; 
    private Integer u=32;
    private int size=0;
    private static final int INITIAL_SIZE=16;
    private int[][] h;
    private Object[] hashTable;
    Random random = new Random();
    
    public OpenAddressingHashTable(int b, int u){
        h= new int[b][u];
        for (int i=0; i<b; i++){ // 0<4
            for (int j=0; j<u; j++){ // 0<32 0
                //h[i][j]=random.nextInt(2);
                h[i][j]= (int) (10*Math.random()) & 1; // generates 1 and 0 with equal propability If rand()generates odd number, the function will return 1 else it will return 0.
            }
        }
        this.size=0;
        this.hashTable= new Object[INITIAL_SIZE];
        
        System.out.println(hashTable.length);
        System.out.println(b);
        System.out.println(u);
        
        for (int i=0; i<b; i++){
            for (int j=0; j<u; j++){
                System.out.println(j);
                System.out.printf("PASSED:[%d][%d]", i,j);
                System.out.print(h[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public OpenAddressingHashTable(){
        this(4,32);
    }
    

    @Override
    public void put(K key, V value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public V get(K key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean contains(K key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        
        return size;
    }

    @Override
    public void clear() {
        
        this.size=0;
        for (int i=0; i<hashTable.length; i++){
            hashTable[i]=null;
        }
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private static class EntryImpl<K,V> implements Dictionary.Entry<K,V>{
            
            private K key;
            private V value;

            public EntryImpl(K key, V value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public K getKey() {

                return key;
            }

            @Override
            public V getValue() {

                return value;
            }
        }
    
}
