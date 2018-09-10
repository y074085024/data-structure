package com.ogemray.sort;

/**
 * 每趟选择把最小的/最大的数的索引找出来
 *
 * @author yxl
 * @Date 2018/9/8
 */
public class SelectSort {
    public void sort(int[] datas) {
        for (int i = 0; i < datas.length; ++i) {
            int min = i;
            for (int j = i + 1; j < datas.length; ++j) {
                if (datas[min] > datas[j]) {
                    min = j;
                }
            }
            int temp = datas[min];
            datas[min] = datas[i];
            datas[i] = temp;
        }
    }
}
