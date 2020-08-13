package com.thkmon.study.hash;

import org.junit.Assert;
import org.junit.Test;

public class Hash1Test {

    @Test
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = 	{"eden", "kiki"};

        Hash1 hash = new Hash1();
        String answer = hash.solution(participant, completion);
        Assert.assertEquals("leo", answer);
    }
}
