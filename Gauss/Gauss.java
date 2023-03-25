
package Gauss;

public class Gauss 
{
    public static void main(String[] args) 
    {
            Macierz m = new Macierz(3,3);
            Macierz w = new Macierz(3,1);
            //          .setWartosc(wartosc,wiersz,kolumna)
            m.setWartosc(-1, 0, 0);m.setWartosc(2, 0, 1); m.setWartosc(1, 0, 2);
            m.setWartosc(1, 1, 0); m.setWartosc(-3, 1, 1);m.setWartosc(-2, 1, 2);
            m.setWartosc(3, 2, 0); m.setWartosc(-1, 2, 1);m.setWartosc(-1, 2, 2);
            w.setWartosc(-1, 0, 0);
            w.setWartosc(-1, 1, 0);
            w.setWartosc(4, 2, 0);
            System.out.print("Macierz:\n"+m + "Wyniki równań:\n" + w);
            Oblicz.gauss(m,w);
    }      
}
