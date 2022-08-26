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
   @Test
    void testCountFamily(){
       assertEquals(2,ElibeyliFamily.countFamily());
   }
    @Test
    void testAddChild(){
        Human child1 = new Human("Nadir", "Elibeyli", 200, 98,
                new String[][]{{DayOfWeek.MONDAY.name(), "go to course"}}, ElibeyliFamily);
        ElibeyliFamily.addChild(child1);
        assertEquals(1,ElibeyliFamily.getChildren().length);
    }
    @Test
    void testDeleteChild(){
        Human child1 = new Human("Nadir", "Elibeyli", 200, 98,
                new String[][]{{DayOfWeek.MONDAY.name(), "go to course"}}, ElibeyliFamily);
        ElibeyliFamily.addChild(child1);
        ElibeyliFamily.deleteChild(0);
        assertEquals(0,ElibeyliFamily.getChildren().length);

    }

    @Test
    void testDeleteChildFakeIndex(){
        Human child1 = new Human("Nadir", "Elibeyli", 200, 98,
                new String[][]{{DayOfWeek.MONDAY.name(), "go to course"}}, ElibeyliFamily);
        ElibeyliFamily.addChild(child1);
        ElibeyliFamily.deleteChild(4);
        assertEquals(1,ElibeyliFamily.getChildren().length);

    }


}