package Outsystems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSumTest {


    String inputTest = "23Tzzrty";
    String justText = "this is just text";
    String justNumerical = "2222";
    StringSum strSum = new StringSum();

    @Test
    void sumWithALoop() {

        assertEquals(5, strSum.sumWithALoop(inputTest));
        assertEquals(0, strSum.sumWithALoop(justText));
        assertEquals(8, strSum.sumWithALoop(justNumerical));
    }

    @Test
    void recursiveSumFunction() {

        assertEquals(5, strSum.recursiveSumFunction(inputTest));
        assertEquals(0, strSum.recursiveSumFunction(justText));
        assertEquals(8, strSum.recursiveSumFunction(justNumerical));
    }
}