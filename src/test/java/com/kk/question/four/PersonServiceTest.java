package com.kk.question.four;

import com.oracle.tools.packager.mac.MacAppBundler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

        List<Person> listOfPerson;
        PersonService personService;
        Map<Float,Person> map= null;

    @BeforeEach
    void init(){
        personService = new PersonService();
        listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person(1, "ankur", 20000f));
        listOfPerson.add(new Person(1, "ravi", 30000f));
        listOfPerson.add(new Person(1, "prem", 50000f));
        map = new HashMap<>();
        map.put(1.0F,new Person(1,"ankur",20000f));
    }

    @Test
    void testGenerateList() {
        assertEquals(listOfPerson.size(),personService.generateList().size());
        assertEquals(listOfPerson.get(0).getName(),personService.generateList().get(0).getName());
    }

    @Test
    void testTransformList() {
        assertNull(personService.transformList(listOfPerson).get(0));
    }

    @Test
    void testShowList() {
        assertTrue(personService.show(listOfPerson));
    }

    @Test
    void testShowMap() {
        assertTrue(personService.show(map));
    }
}