import arytmetykaPackage.DzieleniePrzezZero;

public class ArytmetykaServant extends _arytmetykaImplBase {
    double s1,s2,wynik;

    @Override
    public double s1() {
        return s1;
    }

    @Override
    public void s1(double newS1) {
        s1 = newS1;
    }

    @Override
    public double s2() {
        return s2;
    }

    @Override
    public void s2(double newS2) {
        s2 = newS2;
    }

    @Override
    public double wynik() {
        return wynik;
    }

    @Override
    public void wynik(double newWynik) {
        wynik = newWynik;
    }

    @Override
    public void Suma() {
        wynik = s1 + s2;
    }

    @Override
    public void Roznica() {
        wynik = s1 - s2;
    }

    @Override
    public void Iloczyn() {
        wynik = s1 * s2;
    }

    @Override
    public void Iloraz() throws DzieleniePrzezZero {
        if (s1 == 0 || s2 == 0) {
            throw new DzieleniePrzezZero();
        }
        wynik = s1 / s2;
    }
}
