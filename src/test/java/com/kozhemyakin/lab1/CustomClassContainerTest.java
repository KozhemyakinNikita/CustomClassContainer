package com.kozhemyakin.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author s.n.kozhemyakin
 */
public class CustomClassContainerTest {
    private CustomClassContainer<Integer> container;

    /**
     * Initialize the container before each test.
     */
    @BeforeEach
    void setupContainer() {
        container = new CustomClassContainer<>();
    }

    /**
     * Test. Add elements to the container and check the size.
     */
    @Test
    void testAdd() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(3, container.size());
    }

    /**
     * Test. Get elements by index.
     */
    @Test
    void testGet() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(1, container.get(0).intValue());
        assertEquals(2, container.get(1).intValue());
        assertEquals(3, container.get(2).intValue());
    }

    /**
     * Test. Remove an element by index and check the size and content.
     */
    @Test
    void testRemove() {
        container.add(1);
        container.add(2);
        container.add(3);
        container.remove(1);
        assertEquals(2, container.size());
        assertEquals(1, container.get(0).intValue());
        assertEquals(3, container.get(1).intValue());
    }

    /**
     * Test. Get the size of the container.
     */
    @Test
    void testSize() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(3, container.size());
    }
}