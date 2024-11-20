package test.obfuscator.kotlin.module.app

import test.obfuscator.kotlin.provider.FooProvider
import test.obfuscator.kotlin.provider.Loggers

internal class Injection(
    val loggers: Loggers,
    val foos: FooProvider,
)
