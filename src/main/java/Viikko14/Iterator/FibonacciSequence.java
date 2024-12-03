package Viikko14.Iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }

    // Tössö käytetään tehtyä iteraattoria ja tulostetaan haluttu määrä Fibonaccin lukuja.
    // Laskeminen on piilotettu iteroottoriin
    public void firstFibo(int n) {
        Iterator<Integer> iterator = iterator();
        for (int i = 0; i < n; i++) {
            if (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
        System.out.println();
    }
}
