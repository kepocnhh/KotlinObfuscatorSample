package test.obfuscator.kotlin

import test.obfuscator.kotlin.module.app.Injection
import test.obfuscator.kotlin.module.foo.FooLogics
import test.obfuscator.kotlin.provider.FinalLoggers
import test.obfuscator.kotlin.provider.FooProvider
import test.obfuscator.kotlin.provider.LogicsProvider

fun main() {
    val injection = Injection(
        loggers = FinalLoggers,
        foos = FooProvider(apiKey = "26195dc3-4d61-440b-9d86-8e2b32ac831e"),
    )
    val logicsProvider = LogicsProvider(injection = injection)
    val logics = logicsProvider.getLogics<FooLogics>()
    val logger = injection.loggers.build("[App]")
    logger.debug("foo:list: ${logics.getList()}")
    logger.debug("foo:build: ${logics.build()}")
    logger.debug("foo:list: ${logics.getList()}")
    logger.debug("foo:build: ${logics.build()}")
    logger.debug("foo:list: ${logics.getList()}")
}
