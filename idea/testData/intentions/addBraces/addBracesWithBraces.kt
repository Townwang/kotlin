// IS_APPLICABLE: false

fun <T> doSomething(a: T) {}

fun foo() {
    <caret>if (true) {
        doSomething("test")
    }
}
