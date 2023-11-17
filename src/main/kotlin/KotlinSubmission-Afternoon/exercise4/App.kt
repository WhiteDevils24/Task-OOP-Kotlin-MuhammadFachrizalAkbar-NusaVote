package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val numerator = 10
    val denominator = 0

    try {
        val result = divide(numerator, denominator)
        // If the division is successful, this block will be executed
        println("Result of division: $result")
    } catch (e: ArithmeticException) {
        // If an ArithmeticException occurs (e.g., division by zero), this block will be executed
        println("Error: ${e.message}")
    }
}

private fun divide(numerator: Int, denominator: Int): Int {
    if (denominator == 0) {
        throw ArithmeticException("Cannot divide by zero")
    }
    return numerator / denominator
}


