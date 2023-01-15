import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    public void test_is_triangle_1() {
        assertTrue(Triangle.isTriangle(3,4,5));
    }
    @Test
    public void test_is_triangle_2() {
        assertTrue(Triangle.isTriangle(6,7,13));
    }
    @Test
    public void test_is_triangle_3() {
        assertTrue(Triangle.isTriangle(13,6,7));
    }
    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Triangle.isTriangle(5,9,3));
    }
    @Test
    public void test_is_NOT_triangle_5(){
        assertFalse(Triangle.isTriangle(0,9,3));
    }
    @Test
    public void test_is_NOT_triangle_6() {
        assertFalse(Triangle.isTriangle(1,-1,1));
    }

}
