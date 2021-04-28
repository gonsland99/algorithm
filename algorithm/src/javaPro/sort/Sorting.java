package javaPro.sort;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Sorting {
	//int 오름차순 정렬
    @Test
    public void sortInts() {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers); //오름차순 정렬
        assertArrayEquals(expected, numbers); //두개의 int변수 값이 동일함 지정
//        for(int i=0; i<6; i++) {
//        	System.out.print(numbers[i]+" ");	//{-5, -3, -2, 1, 4, 7}
//        }
//        System.out.println();
//        for(int i=0; i<6; i++) {
//        	System.out.print(expected[i]+" ");	//{-5, -3, -2, 1, 4, 7}
//        }
    }

    //객체 오름차순 정렬
    @Test
    public void sortObjects() {
        final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};

        Arrays.sort(strings);
        assertArrayEquals(expected, strings);
    }

    //Comparable 인터페이스 없이 정렬
    private static class NotComparable {
        private int i;
        private NotComparable(final int i) {
            this.i = i;
        }
    }
    @Test
    public void sortNotComparable() {
        final List<NotComparable> objects = new ArrayList<>();
        for (int i=0; i<10; i++) {
            objects.add(new NotComparable(i));
        }

        try {
            Arrays.sort(objects.toArray()); //toArray(): 배열값 그대로 가져오기
        } catch (Exception e) {
            // correct behavior – cannot sort
            return;
        }

        fail();
    }
    //사용자 지정순 정렬
    @Test
    public void customSorting() {
        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1); 
        //asList: ArrayList의 주소값을 그대로 가져옴
        //ArrayList는 private 정적클래스로서 add와 같이 데이터 추가 불가능

        Collections.sort(numbers, new ReverseNumericalOrder());
        //ReverseNumericalOrder: 역정렬
        assertEquals(expected, numbers);
    }
}
