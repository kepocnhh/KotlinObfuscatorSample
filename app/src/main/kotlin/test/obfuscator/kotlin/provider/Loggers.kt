package test.obfuscator.kotlin.provider

internal interface Loggers {
    fun build(tag: String): Logger
}

internal interface Logger {
    fun debug(message: String)
}
