package com.ogemray.sort;

/**
 * 依次排序前边若干数据,在剩余未排序的数据中取出第一个，然后对比之前的数据选择插入位置
 *
 * @author yxl
 * @Date 2018/9/9
 */
public class InsertSort {
    public void sort(int[] datas) {
        for (int i = 1; i < datas.length; ++i) {
            int j = 0;
            int temp = datas[i];
            for (j = i; j > 0; --j) {
                if (temp > datas[j - 1]) {
                    break;
                } else {
                    datas[j] = datas[j - 1];
                }
            }
            datas[j] = temp;
        }
    }

    private void swap(int datas[], int xIndex, int yIndex) {
        int temp = datas[xIndex];
        datas[xIndex] = datas[yIndex];
        datas[yIndex] = temp;
    }
}
