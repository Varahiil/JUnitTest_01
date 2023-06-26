package by.itstep.java1022.zhukov.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorTest {

    @Test
    public void testIsVectorUnSort() {
        int[] array = {1, 6, 4, 2, 3};
        boolean expected = false;

        boolean actual = Vector.isVectorSort(array);

        assertEquals(expected, actual);

    }

    @Test
    public void testVectorSortUp() {
        int[] array = {1, 2, 3, 4, 5};
        boolean expected = true;

        boolean actual = Vector.vectorSortUp(array);

        if (expected != actual) {
            throw new AssertionError();
        }
    }

    @Test
    public void testIsVectorSortDown() {
        int[] array = {5, 4, 3, 2, 1};
        boolean expected = true;

        boolean actual = Vector.vectorSortDown(array);

        if (expected != actual) {
            fail();
        }
    }

    @Test
    public void testIsVectorSortLengthTwo() {
        int[] array = {5, 1};
        assertTrue(Vector.isVectorSort(array));
    }

    @Test
    public void testIsVectorSortEmpty() {
        int[] array = {};
        assertFalse(Vector.isVectorSort(array));
    }

    @Test
    public void testIsVectorMirrorFromMiddleMinLength() {
        assertFalse(Vector.isVectorMirrorFromMiddle(new int[]{}));
        assertFalse(Vector.isVectorMirrorFromMiddle(new int[]{1, 2}));
    }

    @Test
    public void testIsVectorMirrorFromMiddleNegative() {
        assertFalse(Vector.isVectorMirrorFromMiddle(new int[]{7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 5}));
        assertFalse(Vector.isVectorMirrorFromMiddle(new int[]{7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 6}));
        assertFalse(Vector.isVectorMirrorFromMiddle(new int[]{7, 6, 5, 4, 3, 2, 1, 4, 3, 4, 5, 6, 7}));
        assertFalse(Vector.isVectorMirrorFromMiddle(new int[]{8, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 5}));
        assertFalse(Vector.isVectorMirrorFromMiddle(new int[]{7, 6, 4, 4, 3, 2, 1, 2, 3, 4, 5, 6, 5}));
    }

    @Test
    public void testIsVectorMirrorFromMiddlePositive() {
        assertTrue(Vector.isVectorMirrorFromMiddle(new int[]{7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7}));
        assertTrue(Vector.isVectorMirrorFromMiddle(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
        assertTrue(Vector.isVectorMirrorFromMiddle(new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -8, -7, -6, -5, -4, -3, -2, -1}));
        assertTrue(Vector.isVectorMirrorFromMiddle(new int[]{-7, -6, -5, -4, -3, -2, -1, -2, -3, -4, -5, -6, -7}));
        assertTrue(Vector.isVectorMirrorFromMiddle(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        assertTrue(Vector.isVectorMirrorFromMiddle(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testIsVectorElementsUniqueMinLength() {
        int[] array = {1};
        assertFalse(Vector.isVectorElementsUnique(array));
    }

    @Test
    public void testIsVectorElementsUniqueEmpty() {
        int[] array = {};
        assertFalse(Vector.isVectorElementsUnique(array));
    }

    @Test
    public void testIsVectorElementsUniquePositive() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(Vector.isVectorElementsUnique(array));
    }

    @Test
    public void testIsVectorElementsUniqueAllDublicate() {
        int[] array = {1, 1, 1, 1, 1};
        assertFalse(Vector.isVectorElementsUnique(array));
    }

    @Test
    public void testIsVectorElementsUniqueNegative() {
        assertFalse(Vector.isVectorElementsUnique(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}));
        assertFalse(Vector.isVectorElementsUnique(new int[]{2, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertFalse(Vector.isVectorElementsUnique(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9}));
        assertFalse(Vector.isVectorElementsUnique(new int[]{1, 0, 3, 4, 5, 6, 7, 0, 9}));
    }

    @Test
    public void testVectorEvenOddisEmpty() {
        assertEquals("Value invalid", Vector.vectorCountEvenOdd(new int[]{}));
    }

    @Test
    public void testCountEven() {
        assertEquals("Even 5, Odd 0", Vector.vectorCountEvenOdd(new int[]{2, 2, 2, 2, 2}));
        assertEquals("Even 6, Odd 0", Vector.vectorCountEvenOdd(new int[]{2, 4, 6, 8, 10, 12}));
        assertEquals("Even 8, Odd 0", Vector.vectorCountEvenOdd(new int[]{2, 4, 2, 8, 2, 34, 22, 88}));
    }

    @Test
    public void testCountOdd() {
        assertEquals("Even 0, Odd 5", Vector.vectorCountEvenOdd(new int[]{1, 3, 5, 7, 9}));
        assertEquals("Even 0, Odd 6", Vector.vectorCountEvenOdd(new int[]{13, 9, 7, 5, 3, 1}));
        assertEquals("Even 0, Odd 7", Vector.vectorCountEvenOdd(new int[]{3, 3, 3, 3, 3, 3, 3}));
    }

    @Test
    public void testCountEvenOddPositive() {
        assertEquals("Even 7, Odd 6", Vector.vectorCountEvenOdd(new int[]{1, 2, 3, 4, 5, 6, 0, 8, 6, 5, 4, 3, 2, 1}));
        assertEquals("Even 5, Odd 7", Vector.vectorCountEvenOdd(new int[]{1, 2, 2, 2, 5, 6, 0, 6, 3, 3, 3, 3, 1}));
        assertEquals("Even 1, Odd 1", Vector.vectorCountEvenOdd(new int[]{1, 0, 0, 0, 0, 0, 0, 2}));
        assertEquals("Even 0, Odd 0", Vector.vectorCountEvenOdd(new int[]{0, 0, 0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void testcountMarkPositive() {
        assertEquals(1, Vector.countMark(new int[]{1, 2, 3, 4, 5, 0, 4, 3, 2, 1}, 5));
        assertEquals(2, Vector.countMark(new int[]{1, 2, 3, 4, 5, 0, 4, 3, 2, 1}, 4));
        assertEquals(3, Vector.countMark(new int[]{1, 2, 3, 3, 5, 0, 4, 3, 2, 1}, 3));
        assertEquals(4, Vector.countMark(new int[]{1, 2, 2, 4, 2, 0, 4, 3, 2, 1}, 2));
        assertEquals(5, Vector.countMark(new int[]{1, 3, 1, 4, 5, 0, 1, 1, 2, 1}, 1));
        assertEquals(6, Vector.countMark(new int[]{1, 0, 0, 0, 5, 0, 4, 0, 0, 1}, 0));
    }

    @Test
    public void testcountMarkNegative() {
        assertEquals(-1, Vector.countMark(new int[]{1, 2, 3, 4, 5, 0, 4, 3, 2, -1}, 5));
        assertEquals(-1, Vector.countMark(new int[]{1, 2, 3, 4, -5, 0, 4, 3, 2, 1}, 4));
        assertEquals(-1, Vector.countMark(new int[]{-1, 2, 3, 3, 5, 0, 4, 3, 2, 1}, 3));
        assertEquals(-1, Vector.countMark(new int[]{-1, 2, 3, 3, 5, 0, 4, 3, 2, 1}, 2));
        assertEquals(-1, Vector.countMark(new int[]{-1, 2, 3, 3, 5, 0, -4, 3, 2, 1}, 1));
        assertEquals(-1, Vector.countMark(new int[]{-1, 2, 3, 3, -5, 0, 4, 3, 2, 1}, 0));
    }

    @Test
    public void testRate() {
        assertEquals(30.0, Vector.rate(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5}, 9), 1);
        assertEquals(33.3, Vector.rate(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5}, 10), 1);
        assertEquals(23.3, Vector.rate(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5}, 7), 1);
        assertEquals(3.3, Vector.rate(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5}, 1), 1);
        assertEquals(6.7, Vector.rate(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5}, 2), 1);
        assertEquals(3.3, Vector.rate(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5}, 1), 1);
        assertEquals(0, Vector.rate(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5}, 0), 1);
    }

    @Test
    public void testVectorRatingNegative() {
        assertEquals("Invalid value", Vector.vectorRating(new int[]{-1, 4, 4, 5, 3, 4, 3, 4, 1, 3, 4, 4, 3, 1, 4, 3, 5, 3, 0, 4, 5, 5, 5, 5, 4, 0, 1, 1, 2, 5}));
        assertEquals("Invalid value", Vector.vectorRating(new int[]{1, 4, 4, 5, 3, 4, 3, 4, 1, 3, 4, 4, 3, -1, 4, 3, 5, 3, 0, 4, 5, 5, 5, 5, 4, 0, 1, 1, 2, 5}));
        assertEquals("Invalid value", Vector.vectorRating(new int[]{-1, 4, 4, 5, 3, 4, 3, 4, 1, 3, 4, 4, 3, 1, 4, 3, 5, 3, 0, 4, 5, 5, 5, 5, 4, 0, 1, 1, 2, -5}));
    }

    @Test
    public void testVectorRatingPositive() {
        assertEquals("Exam Result Handling " + "\n"
                + "Marks: " + "5 4 4 5 3 4 3 4 1 3 4 4 3 1 4 3 5 3 0 4 5 5 5 5 4 0 1 1 2 5 " + "\n"
                + "Exam Result: " + "\n"
                + "fives 26,7% (8)" + "\n"
                + "fours 30,0% (9)" + "\n"
                + "triplets 20,0% (6)" + "\n"
                + "deuces 3,3% (1)" + "\n"
                + "units 13,3% (4)" + "\n"
                + "zeros 6,7% (2)", Vector.vectorRating(new int[]{5, 4, 4, 5, 3, 4, 3, 4, 1, 3, 4, 4, 3, 1, 4, 3, 5, 3, 0, 4, 5, 5, 5, 5, 4, 0, 1, 1, 2, 5}));
        assertEquals("Exam Result Handling " + "\n"
                + "Marks: " + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 " + "\n"
                + "Exam Result: " + "\n"
                + "fives 0,0% (0)" + "\n"
                + "fours 0,0% (0)" + "\n"
                + "triplets 0,0% (0)" + "\n"
                + "deuces 0,0% (0)" + "\n"
                + "units 0,0% (0)" + "\n"
                + "zeros 100,0% (14)", Vector.vectorRating(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}