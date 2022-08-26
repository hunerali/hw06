package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
  private final   Human mother = new Human("Leyla", "Elibeyli", 1977);
  private final   Human father = new Human("Izzet", "Elibeyli", 1973);
   private final Family ElibeyliFamily = new Family(mother, father);

   @Test
    void equalsTest(){
       Family test = new Family(mother, father);
       assertEquals(test,ElibeyliFamily);


   }
   @Test
    void notEqualsTest(){
       Human mother1 = new Human("Lela", "Elibeyli", 1987);
       Human father1 = new Human("Izet", "Elli", 1993);
       Family test = new Family(mother1, father1);
       assertNotEquals(test,ElibeyliFamily);

   }



}