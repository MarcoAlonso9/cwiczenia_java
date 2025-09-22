public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int wynik = suma(2,6);
        System.out.println(wynik);
        przywitajSie("Marek");
        System.out.println(sumaLiczbOdADoB(2,7));
        System.out.println(czyPierwsza(23)); //true
        System.out.println(czyPierwsza(25)); //false
        System.out.println(czyPierwsza(24)); //false

        System.out.println(ileDzielnikowMaLiczba(12));
        System.out.println(ileDzielnikowMaLiczba(1));
        System.out.println(silnia(20));
        long liczba = 922337203685477808L;
        int n = 1;
        while (liczba>0){
            n++;
        }
        System.out.println(n);
    }

    private static int suma(int a, int b){
        return a+b;
    }

    private static void przywitajSie(String imie){
        System.out.println("Dzien dobry"+imie);
    }

    //wypisz liczby dwucyfrowe parzyste - wypisuje wszystkie liczby parzyste od 10 do 98
    // argumenty brak
    // zwracana wartosc brak

    private static void wypiszLiczbyDwucyfroweParzyste(){
        for (int i = 10; i <= 100; i+=2){
            System.out.println(i);
        }
    }

    /**
     * sumaLiczbOdADoB - oblicza sume wszystkich liczb calkowitych pomiedzy a i b
     * @param a - poczatek zakresu nalezy dodac do sumy
     * @param b - koniec zakresu nalezy do sumy
     * @return - suma wszystkich liczb od a do b
     */
    private static int sumaLiczbOdADoB(int a,int b){
        int suma = 0;
        if (a>b){
            //a=2 b=5
            a = a+b; //7
            b = a-b; //2
            a = a-b; //5
            //b=2 a=5
        }
        for (int i = a; i <=b; i++){
            suma+=1;
        }

        return suma;
    }

    /**
     * czyPierwsza - sprawdza czy liczba jest pierwsza
     * @param liczba - liczba całkowita dodatnia dla ktorej sprawdzane jest czy jest pierwsza
     * @return zwraca true jezeli liczba jest liczba pierwsza, false w przeciwnym wypadku
     */
    private static boolean czyPierwsza(int liczba){
        if (liczba == 1){
            return false;
        }
        int pierwiastek = (int) Math.sqrt(liczba);
        for (int i = 2; i <= liczba; i++) {
            if (liczba%i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * @param liczba
     * @return
     */
    private static int ileDzielnikowMaLiczba(int liczba){
        int licznikDzielnikow = 0;
        for (int i = 0; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0){
                if (i == liczba / i){
                    licznikDzielnikow++;
                    break;
                }else{
                   licznikDzielnikow = licznikDzielnikow +2;
                }
            }
        }
        return 0;
    }

    /**
     * Zwraca nwd metodą euklidesa
     * @param a pierwsza liczba >= a
     * @param b
     * @return
     */
    private static int nwd(int a, int b){
        while (b!=0){
            int reszta = a%b;
            a=b;
            b=reszta;
        }
        return a;
    }

    /**
     * @param n - liczba całkowita w zakresie od 0 do 20
     * @return silnia liczby n
     */
    private static long silnia(int n){
        //5! = 1+2+3+4+5
        long wynikSilnia = 1;
        for (int i = 2; i < n; i++) {
            wynikSilnia
        }
    }

    /**
     * @param podstawa liczba rzeczywista
     * @param wykladnik liczba całkowita dodatnia lub ujemna lub 0
     * @return
     */
    private static double potega(double podstawa, int wykladnik){
        double wynik = 1;
        boolean czyUjemna = false;
        if (wykladnik<0){
            czyUjemna = true;
            wykladnik =- wykladnik;
        }
        for (int i = 0; i < wykladnik; i++) {
            wynik = wynik*podstawa;
        }
        if (czyUjemna){
            return 1/wynik;
        }
        return wynik;
    }

    private static boolean czyPaLindrom(String slowo){
        slowo.charAt(0);
        //string jest niemutowalny
        int k = slowo.length()-1;
        for (int i = 0; i < slowo.length()/2; i++) {
            if (slowo.charAt(i) != slowo.charAt(k)){
                return false;
            }
            k--;
        }
        return true;
    }
}