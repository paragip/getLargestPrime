public class getLargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {

        int largestPrime = -1;

        if (number < 2) {
            return -1;
        } else {

            for (int i = 2; i <= number; i++) {
                if (number % i == 0) { // megnézzük, hogy az i osztója-e a számnak
                    boolean isPrime = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) { // ha i osztó, akkor megnézzük, hogy az osztó (i) prímszám-e, vagyis van-e 1-en és önmagán kívül más osztója
                            isPrime = false; // ha találunk legalább egy számot ami osztója az i-nek, akkor nem prím, tehát ugrunk
                            break;
                        }
                    }
                    if (isPrime) {
                        largestPrime = i; // ha i prím, akkor felülírjuk vele a largestPrime változó értékét és megyünk tovább az ellenőrzéssel, hogy van-e ennél nagyobb
                    }
                }
            }

        }
        return largestPrime;
    }

}
