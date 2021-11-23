//bizim çalışanımız
public class Worker implements IWokrable,IEatable,IPayble{

    @Override
    public void work() {
        System.out.println("Personel Çalıştırılıyor!");
    }

    @Override
    public void eat() {

    }

    @Override
    public void pay() {

    }
}
