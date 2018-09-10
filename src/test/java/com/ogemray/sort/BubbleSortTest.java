package com.ogemray.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author yxl
 * @Date 2018/9/8
 */
public class BubbleSortTest {
    @Test
    public void sortTest() {
        int[] datas = {5, 8, 3, 9, 4, 7, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(datas);
        bubbleSort.sortVariant(datas);
        String collect = Arrays.stream(datas).boxed().collect(Collectors.mapping(Object::toString, Collectors.joining(",")));
        System.out.println(collect);
    }
}
