package test.obfuscator.kotlin.provider

internal object FinalLoggers : Loggers {
    override fun build(tag: String): Logger {
        return SystemLogger(tag = tag)
    }
}

private class SystemLogger(
    private val tag: String,
) : Logger {
    override fun debug(message: String) {
        println("$tag: $message")
    }
}
