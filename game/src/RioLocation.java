public class RioLocation extends Location {
    @Override
    public Enemy createEnemy() {
        return new Criminoso();
    }
}
