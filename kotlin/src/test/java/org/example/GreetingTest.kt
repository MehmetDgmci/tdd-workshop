package org.example

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class GreetingTest {

    @Test
    fun shouldGreetHelloWorld() {
        assertThat(greeting()).isEqualTo("Hello, World!")
    }
}
