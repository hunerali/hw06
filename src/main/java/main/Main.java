package main;

public class Main {
    public static void main(String[] args) throws Throwable {

        Pet dog = new Pet(Species.DOG, "koko", 3, 50, new String[]{"eating", "sleeping"});
        Human mother = new Human("Leyla", "Elibeyli", 1977);
        Human father = new Human("Izzet", "Elibeyli", 1973);

        Family ElibeyliFamily = new Family(mother, father);

        Human child1 = new Human("Nadir", "Elibeyli", 200, 98,
                new String[][]{{DayOfWeek.MONDAY.name(), "go to course"}}, ElibeyliFamily);

        ElibeyliFamily.addChild(child1);
        ElibeyliFamily.setPet(dog);
        ElibeyliFamily.finalize();



    }

    public static void humanGarbageCollector() {
        for (int i = 0; i < 2000000; i++) {
            Human human = new Human();
        }
    }
}
