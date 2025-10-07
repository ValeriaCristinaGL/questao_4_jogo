public class SertaoLocation extends Location {
    @Override
    public Enemy createEnemy() {
        return new Cangaceiro();
    }
}
