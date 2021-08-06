package task_2;

public class Main {

    public static void main(String[] args) {
        SportsmenRepository repository = new SportsmenRepository();
        new Main().sportsmenRepositoryInitialization(repository);

        System.out.println(repository.inMap(3));
        System.out.println(repository.inMap(8));

        Sportsmen sportsmen = new Sportsmen("Adam", true, true);
        System.out.println(repository.getCountSameSportsmen(sportsmen));
    }

    public void sportsmenRepositoryInitialization(SportsmenRepository repository) {
        Sportsmen sportsmen = new Sportsmen("Bob", true, false);
        Sportsmen sportsmen1 = new Sportsmen("Mike", true, true);
        Sportsmen sportsmen2 = new Sportsmen("Rick", false, false);
        Sportsmen sportsmen3 = new Sportsmen("Jacob", false, true);
        Sportsmen sportsmen4 = new Sportsmen("James", true, false);
        Sportsmen sportsmen5 = new Sportsmen("William", true, true);
        Sportsmen sportsmen6 = new Sportsmen("Thomas", false, true);
        repository.addToSportsmenHashMap(sportsmen, sportsmen1, sportsmen2, sportsmen3, sportsmen4,
                sportsmen5, sportsmen6);
    }
}
