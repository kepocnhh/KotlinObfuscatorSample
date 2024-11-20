package test.obfuscator.kotlin.provider

import test.obfuscator.kotlin.module.app.Injection

internal class LogicsProvider(
    private val injection: Injection,
) {
    private val map = mutableMapOf<Class<*>, Logics>()
    inline fun <reified T : Logics> getLogics(): T {
        return map.getOrPut(T::class.java) {
            T::class.java.getConstructor(Injection::class.java).newInstance(injection)
        } as T
    }
}
