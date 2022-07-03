package name.stepin.pitest.kotlin.sample

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Destructure2Test {

    @Test
    fun a() {
        val destructure2 = Destructure2()

        val r = destructure2.foo(Result(10, 20))

        assertEquals(30, r)
    }
}
