public abstract class GameCalculator {
//    public void hesapla() {
//        System.out.println("Puanınız : 100");
//    }
    public abstract void hesapla(); // must be overridden

    public final void gameOver() { // cannot be overridden due to the "final" keyword.
        System.out.println("Oyun bitti!");
    }
}
