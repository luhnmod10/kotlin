package luhnmod10

import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test

class Luhnmod10Test {
    @Test fun testValid() {
        assertTrue(valid("0"))
        assertTrue(valid("00"))
        assertTrue(valid("18"))
        assertTrue(valid("0000000000000000"))
        assertTrue(valid("4242424242424242"))
        assertTrue(valid("42424242424242426"))
        assertTrue(valid("424242424242424267"))
        assertTrue(valid("4242424242424242675"))
        assertTrue(valid("000000018"))
        assertTrue(valid("99999999999999999999"))
        assertTrue(valid("99999999999999999999999999999999999999999999999999999999999999999997"))

        assertFalse(valid("4242424242424240"))
        assertFalse(valid("4242424242424241"))
        assertFalse(valid("4242424242424243"))
        assertFalse(valid("4242424242424244"))
        assertFalse(valid("4242424242424245"))
        assertFalse(valid("4242424242424246"))
        assertFalse(valid("4242424242424247"))
        assertFalse(valid("4242424242424248"))
        assertFalse(valid("4242424242424249"))
    }
}
