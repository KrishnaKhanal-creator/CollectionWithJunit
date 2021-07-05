package com.kk.question.one;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class InsertServiceTest {

    InsertService insertService;
    Client client;

    @BeforeEach
    void init(){
        insertService = new InsertService();
        client = new Client();

    }
    @Test
    void testAskElement() {
        String input1 = "raM";
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in1);
        assertEquals("raM", client.askElement());
    }

    @Ignore
    void testAskDesireLocation() {
        String input2 = "5";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);
        assertEquals(5, Client.askDesireLocation());
    }

    @Test
    void testReverseCase() {
        assertEquals("raM",insertService.reverseCase("RAm"));
        assertEquals("",insertService.reverseCase(""));
        assertEquals("KRISH1NA",insertService.reverseCase("krish1na"));
    }

}