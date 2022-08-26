package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
   private final Pet dog = new Pet(Species.DOG, "koko", 3, 50, new String[]{"eating", "sleeping"});
   @Test
    void equalsTest(){
     Pet dog2 = new Pet(Species.DOG, "koko", 3, 50, new String[]{"eating", "sleeping"});
     assertEquals(dog,dog2);
   }

   @Test
   void notEqualsTest(){
      Pet dog2 = new Pet(Species.DOG, "koko", 5, 50, new String[]{"eating", "sleeping"});
      assertNotEquals(dog,dog2);

   }

}