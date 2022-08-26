package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    private final Human human = new Human("Leyla", "Elibeyli", 1977);

    @Test
    void equalsTest() {
        Human human2 = new Human("Leyla", "Elibeyli", 1977);
        assertEquals(human, human2);


    }

    @Test
    void notEqualsTest() {
        Human human2 = new Human("Leyla", "Elibeyli", 1980);
        assertNotEquals(human, human2);


    }

}