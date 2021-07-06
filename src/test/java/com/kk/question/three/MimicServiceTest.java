package com.kk.question.three;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MimicServiceTest {
    MimicService mimicService;
    MimicEntity mimicEntity;
    Object[] testArr;

    @BeforeEach
    void init(){
        mimicService = new MimicService();
        testArr= new Object[]{1,5,3,59};
    }

    @Test
    void testAdd() {
        assertEquals(testArr[0],mimicService.add(59));
        assertEquals(1,mimicService.add(null));
        assertEquals(-1,mimicService.add(5));
    }

    @Test
    void testRemove() {
        assertTrue(mimicService.remove(5));
    }

    @Test
    void testShowAll() {
        assertTrue(mimicService.showAll());
    }
}