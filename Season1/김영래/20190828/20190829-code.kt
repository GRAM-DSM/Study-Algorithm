fun main() {
    println(solution(3))
}

fun solution(n: Int): String {
    var gap: Int
    var subac = "수박"
    var answer = ""
    gap = n / 2
    for (i in 1..gap) {
        answer += subac
    }

    if (n % 2 == 1) {
        answer += "수"
    }

    return answer
}
