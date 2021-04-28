package javaPro.sort;

import java.util.Comparator;

//Comparator 인터페이스 사용 역순정렬
public class ReverseNumericalOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
    // equals omitted
}
