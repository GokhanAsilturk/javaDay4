public abstract class GameCalculator {
//abstract classlarda abstract void veya final void kullanılmalıdır.
//bir abstract classı implement/inherit eden classlar abstract voidleri kullanırken Override etmek zorundadır.
//final void, Override edilemez!.
    public abstract void hesapla();

    public final void gameOver() {
        System.out.println("Oyun bitti!");
    }

}
