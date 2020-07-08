fun main() {
    print(solution(20))
}

fun solution(n: Int): Long {

    var first: Long = 1
    var second: Long = 2
    return when(n) {
        1 -> first
        2 -> second
        else -> {
            var fibo: Long = first + second
            for (num in 3..n) {
                fibo = (first + second) % 1234567
                first = second
                second = fibo
            }
            fibo
        }
    }
}
