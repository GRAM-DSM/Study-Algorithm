fun main() {
    print(solution(11))
}

fun solution(x: Int):Boolean {
    var answer = true
    var sum = 0
    var same = x
    while (same > 0) {
        sum += same % 10
        same = same / 10
    }

    if (x % sum == 0)
        answer = true
    else
        answer = false

    return answer
}