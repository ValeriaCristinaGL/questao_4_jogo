public class AmazonLocation extends Location {
    @Override
    public Enemy createEnemy() {
        return new MutantAnimal();
    }
}
