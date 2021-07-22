package main;

public class TimeDiffCalculator {

    /**
     * Considering 24 hr format
     * start is always smaller than end
     * <p>
     * <p>
     * To Test run TimeDiffCalculatorTest class, with custom inputs
     */

    int MAX_TIME_LIMIT = 24;
    int MIN_TIME_LIMIT = 0;

    public boolean timeIsPresentInRange(int givenTime, int startTime, int endTime) {

        //Invalid input
        if (givenTime < MIN_TIME_LIMIT && startTime < MIN_TIME_LIMIT && endTime < MIN_TIME_LIMIT) {
            return false;
        }

        //Invalid input
        if (givenTime > MAX_TIME_LIMIT && startTime > MAX_TIME_LIMIT && endTime > MAX_TIME_LIMIT) {
            return false;
        }

        return givenTime >= startTime && givenTime <= endTime;
    }
}
