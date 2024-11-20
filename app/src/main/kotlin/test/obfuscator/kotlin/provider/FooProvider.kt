package test.obfuscator.kotlin.provider

import test.obfuscator.kotlin.entity.Foo
import java.util.concurrent.atomic.AtomicInteger

internal class FooProvider(
    private val apiKey: String,
) {
    fun build(): Foo {
        val id = index.incrementAndGet()
        return Foo(
            id = id,
            text = String.format("%016d", (apiKey + id).hashCode().toLong() and 0xffffffffL),
        )
    }

    companion object {
        private val index = AtomicInteger(0)
    }
}
