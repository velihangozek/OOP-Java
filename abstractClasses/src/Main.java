public class Main {

    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

//        GameCalculator gameCalculator = new GameCalculator(); // It's abstract, so it's not newable nor can be instantiated.
        // Abstract classes can be instantiated like in the example below; BUT NOT AN EFFICIENT USAGE - TRY TO AVOID.
//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void hesapla() {
//
//            }
//        };

        GameCalculator[] gameCalculators = new GameCalculator[] {
                new ManGameCalculator(),
                new WomanGameCalculator(),
                new ChildGameCalculator(),
                new ElderGameCalculator()
        };

        for (GameCalculator gameCalculator : gameCalculators) {
            gameCalculator.hesapla();
            gameCalculator.gameOver();
        }

    }
}
