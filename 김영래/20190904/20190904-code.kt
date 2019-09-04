fun main() {
    var arr = intArrayOf(2, 6, 8 ,14)

    print(solution(arr))

}

fun solution(arr: IntArray): Int {
    var answer = arr[0]
    for (i in 1..arr.size-1) {
        answer = answer * arr[i] / gcd(answer, arr[i])
    }

    return answer
}

fun gcd(a: Int, b: Int): Int {
    var m = if (a > b) a else b
    var n = if (a > b) b else a

    var r = m % n
    while (r > 0) {
        m = n
        n = r
        r = m % n
    }
    return n
}