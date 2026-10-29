import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanColorDistanceTest {

    private final EuclideanColorDistance finder =
            new EuclideanColorDistance();

    @Test
    public void sameColorReturnsZero() {
        assertEquals(
                0.0,
                finder.distance(0x123456, 0x123456),
                0.000001
        );
    }

    @Test
    public void blackToRedReturns255() {
        assertEquals(
                255.0,
                finder.distance(0x000000, 0xFF0000),
                0.000001
        );
    }
}