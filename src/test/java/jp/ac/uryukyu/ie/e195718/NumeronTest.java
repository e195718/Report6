package jp.ac.uryukyu.ie.e195718;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeronTest extends Numeron {

    @Test
    void testJudge() {
        int answer[] = new int[3];
        int exeption[] = new int[3];
        answer[0] = 1;
        answer[1] = 2;
        answer[2] = 3;

        exeption[0] = 1;
        exeption[1] = 2;
        exeption[2] = 3;

        assertEquals(answer[0],exeption[0]);
        assertEquals(answer[1],exeption[1]);
        assertEquals(answer[2],exeption[2]);
    }

}