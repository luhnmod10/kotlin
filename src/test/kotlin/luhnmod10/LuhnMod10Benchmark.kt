package luhnmod10

import kotlin.system.measureTimeMillis

import org.junit.Test

class Luhnmod10Benchmark {
    @Test fun benchmarkValid() {
        val iterations = 100_000_000
        val deltaMs = measureTimeMillis { 
	    for (i in 1..iterations) {
	        valid("4242424242424242")
	    }
	}
	val deltaPerOpMs = deltaMs.toDouble() / iterations
	val deltaPerOpNs = deltaPerOpMs * 1_000_000
        println("valid is %.0fns per op".format(deltaPerOpNs))
    }
}
