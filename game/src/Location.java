public abstract class Location {
    public abstract Enemy createEnemy();

    public void enterLocation() {
        Enemy enemy = createEnemy();
        System.out.println("Player enters location...");
        enemy.attack();
    }
}

