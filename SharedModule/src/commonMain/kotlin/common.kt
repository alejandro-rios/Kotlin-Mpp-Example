package com.alejandrorios.sharedmodule

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Hello World, from ${platformName()}"
}
