package com.ogemray.sort;

/**
 * 每趟冒泡都会排序好剩余数据的其中一个，排好序到最后一个位置
 * 变种：每次把剩余数据的其中一个，排好序到第一个位置
 * 效率最低O（N的平方）
 *
 * @author yxl
 * @Date 2018/9/8
 */
public class BubbleSort {
    public void sort(int[] datas) {
        // 冒泡次数
        for (int i = 0; i < datas.length; ++i) {
            for (int j = 0; j < datas.length - i - 1; ++j) {
                if (datas[j] > datas[j + 1]) {
                    swap(datas, j, j + 1);
                }
            }
        }
    }

    public void sortVariant(int[] datas) {
        // 每次排剩余数据并放入到剩余位置的第一个位置
        for (int i = 0; i < datas.length; ++i) {
            for (int j = i + 1; j < datas.length; ++j) {
                if (datas[i] > datas[j]) {
                    swap(datas, i, j);
                }
            }
        }
    }

    private void swap(int datas[], int xIndex, int yIndex) {
        int temp = datas[xIndex];
        datas[xIndex] = datas[yIndex];
        datas[yIndex] = temp;
    }
}
