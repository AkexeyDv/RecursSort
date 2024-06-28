package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListShortTest {

    Integer[] array2={1};
    Integer[] array3={1,2};
    Integer[] array4={1,0,2};
    Integer[] array5={-2,1,3,8,10,16,25};
    ArrayListShort out=new ArrayListShort();

    @Test
    void add() {
        out.add(1);
        Assertions.assertArrayEquals(array2,out.toArray());
        out.add(2);
        Assertions.assertArrayEquals(array3,out.toArray());
    }

    @Test
    void testAdd() {
        Assertions.assertThrows(ExceptionApp.class,()->out.add(1,2));
        out.add(1);
        out.add(2);
        out.add(1,0);
        Assertions.assertArrayEquals(array4,out.toArray());

    }

    @Test
    void size() {
        Assertions.assertEquals(0,out.size());
        out.add(1);
        out.add(0);
        out.add(2);
        out.add(12);
        Assertions.assertEquals(4,out.size());
    }

    @Test
    void delete() {
        out.add(1);
        out.add(0);
        out.add(2);
        Assertions.assertThrows(ExceptionApp.class,()->out.delete(8));
        out.delete(1);
        Assertions.assertArrayEquals(array3,out.toArray());

    }

    @Test
    void sort() {
        //array5={-2,1,3,8,10,16,25};
        out.add(16);
        out.add(10);
        out.add(-2);
        out.add(25);
        out.add(8);
        out.add(3);
        out.add(1);
        out.sort();
        Assertions.assertArrayEquals(array5,out.toArray());

    }
}