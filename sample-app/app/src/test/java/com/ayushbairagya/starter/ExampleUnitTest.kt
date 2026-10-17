package com.ayushbairagya.starter

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Local unit test, which runs on the development machine (host) JVM.
 *
 * Exercises the pure [increment] helper that backs the counter on the home
 * screen, so the core state transition is verified without an Android device.
 */
class ExampleUnitTest {
    @Test
    fun increment_addsOne() {
        assertEquals(1, increment(0))
        assertEquals(6, increment(5))
    }

    @Test
    fun increment_isRepeatable() {
        var count = 0
        repeat(3) { count = increment(count) }
        assertEquals(3, count)
    }
}
