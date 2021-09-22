package pl.alex.javaStart.lessons.collection.collections;

import java.util.*;

public class Lotto {
    private static final int NO_OF_NUMBERS = 49;
    public static final int MAX_NUMBERS = 6;

    private final List<Integer> numbers = new ArrayList<>();
    private List<Integer> lottoResult;

    public Lotto() {
        generate();
        randomize();
    }

    public void generate() {
        for (int i = 1; i <= NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    public void randomize() {
        Collections.shuffle(numbers);
        lottoResult = numbers.subList(0, 6);
    }

    public List<Integer> getLottoResult() {
        return lottoResult;
    }

    public int checkResult(List<Integer> numbers) {
        int found = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (lottoResult.contains(numbers.get(i))) {
                found++;
            }
        }
        return found;
    }

}
