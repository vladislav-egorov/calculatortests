import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideOperationTest {
    @Test
    void validateFirstNumber(){
        DivideOperation testOperation = new DivideOperation();
        testOperation.operation("characters", "999");
        assertTrue(testOperation.firstNumberIsWrong);
    }

    @Test
    void validateSecondNumber(){
        DivideOperation testOperation = new DivideOperation();
        testOperation.operation("2017", "characters");
        assertTrue(testOperation.secondNumberIsWrong);
    }

    @Test
     void divideOnZero(){
        DivideOperation testOperation = new DivideOperation();
        testOperation.operation("512", "0");
        assertTrue(testOperation.divisionByZero);
    }

    @Test
    void simpleDivide(){
        DivideOperation testOperation = new DivideOperation();
        float actual = testOperation.operation("2313", "771");
        float expected = 3f;

        assertEquals(expected, actual);
    }
}