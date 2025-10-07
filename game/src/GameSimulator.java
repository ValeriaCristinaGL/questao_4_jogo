public class GameSimulator {
    public static void main(String[] args) {
        Location amazonia = new AmazonLocation();
        Location sertao = new SertaoLocation();
        Location rio = new RioLocation();

        amazonia.enterLocation(); // Mutant animal
        sertao.enterLocation();   // Cangaceiro
        rio.enterLocation();      // Criminoso
    }
}

