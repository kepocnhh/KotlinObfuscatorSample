package test.obfuscator.kotlin.module.foo

import test.obfuscator.kotlin.entity.Foo
import test.obfuscator.kotlin.module.app.Injection
import test.obfuscator.kotlin.provider.Logics

internal class FooLogics(
    private val injection: Injection,
) : Logics() {
    private val items = mutableListOf<Foo>()

    fun getList(): List<Foo> {
        return items.toList()
    }

    fun build(): Foo {
        val item = injection.foos.build()
        items.add(item)
        return item
    }
}
