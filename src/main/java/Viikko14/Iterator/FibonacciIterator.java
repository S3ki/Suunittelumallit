package Viikko14.Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    //Alustetaan ensimmäiset luvut Fibonaccissa jotka ovat 0 ja 1
    private int prev1 = 0;
    private int prev2 = 1;


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int current = prev1 + prev2;
        prev1 = prev2;
        prev2 = current;
        return prev1; // Palauttaa edellisen numeron aina 1 ja tallentaa yhteenlaskun 2 seuraava lukua varten
    }
}