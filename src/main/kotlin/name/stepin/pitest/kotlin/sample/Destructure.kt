package name.stepin.pitest.kotlin.sample

data class Result(val a: Int, val b: Int)

class Destructure2 {
    fun foo(r: Result): Int {
        val (a, b) = r
        return a + b
    }
}

data class DestructureMe(val a: Int, val b: String, val c: Int)

class Destructure {
    fun foo(d: DestructureMe) {
        val (a, b, c) = d
        println("" + a + b + c)
    }
}

class NotDestructuring {
    fun foo(i: Int) {
        component1(i)
    }

    private fun component1(i: Int) {
        println("hello$i")
    }
}

class HasNullCast {
    fun foo(maybeS: String?) {
        val s = maybeS!!
        println(s)
    }
}

class HasSafeNullCall {
    fun foo(b: String?): String? {
        println(b?.length)
        return b
    }
}

class HasElvisWithStringM1 {
    fun foo(b: String?): Int? {
        val l = b?.length ?: -1
        println(l)
        return l
    }
}

class HasElvisWithString0 {
    fun foo(b: String?): Int? {
        val l = b?.length ?: 0
        println(l)
        return l
    }
}

class HasElvisWithSIPUSH {
    fun foo(b: String?): Int? {
        val l = b?.length ?: 10000
        println(l)
        return l
    }
}

class HasElvisWithLDC {
    fun foo(b: LongReturn?): Long? {
        val l = b?.getALong() ?: Long.MAX_VALUE
        println(l)
        return l
    }
}

class HasElvisWithMethodCall {
    fun foo(b: LongReturn?): Long? {
        val l = b?.getALong() ?: aLong()
        println(l)
        return l
    }

    fun aLong(): Long {
        return 42
    }
}

class HasSafeCast {
    fun foo(o: Any): String? {
        return o as? String
    }
}

interface LongReturn {
    fun getALong(): Long
}
