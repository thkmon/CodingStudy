package com.thkmon.study.sort;

import org.junit.Assert;
import org.junit.Test;

public class Sort1Test {

    @Test
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Sort1 target = new Sort1();
        int[] answer = target.solution(array, commands);
        int[] expected = {5, 6, 3};

        Assert.assertEquals(expected[0], answer[0]);
        Assert.assertEquals(expected[1], answer[1]);
        Assert.assertEquals(expected[2], answer[2]);
    }
}
