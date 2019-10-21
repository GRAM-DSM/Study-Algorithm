import java.lang.StringBuilder


fun main() {
    print(solution("4177252841", 4))
}

fun solution(number: String, k: Int): String {
    var answer = StringBuilder()
    var max: Char
    var idx = 0

    if (number.get(0) == '0') return "0"
    for (i in 0..(number.length - k-1)) {
        max = '0'
        for (j in idx..k + i) {
            if (max < number.get(j)) {
                max = number.get(j)
                idx = j + 1
            }
        }
        answer.append(max)
    }

    return answer.toString()
}
