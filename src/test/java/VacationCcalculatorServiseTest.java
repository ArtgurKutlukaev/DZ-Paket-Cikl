import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationCcalculatorServise;

import static org.junit.jupiter.api.Assertions.*;

class VacationCcalculatorServiseTest {

    @Test
    public void TheModelOfTheHolidaySchedule1() {
        VacationCcalculatorServise servise = new VacationCcalculatorServise();

        int actual = servise.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TheModelOfTheHolidaySchedule2() {
        VacationCcalculatorServise servise = new VacationCcalculatorServise();

        int actual = servise.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}