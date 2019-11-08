class Solution {
    var longest: Int = 0
    var word: String = ""
    var wordsize: Int = 0

    fun oddlengthCheck(position: Int) {
        var count = 1
        for (i in 1 .. wordsize) {
            if ((position - i < 0) or (position + i >= wordsize))
                break
            if (word[position - i] == word[position + i])
                count += 2
            else
                break
        }
        if (count > longest) {
            println("odd count값 : $count")
            longest = count
        }
    }

    fun evenlengthCheck(position: Int) {
        var count = 0
        for (i in 0 until wordsize) {
            if ((position - i < 0) or (position + i >= wordsize - 1))
                break
            if (word[position - i] == word[position + i + 1])
                count += 2
            else
                break
        }
        if (count > longest) {
            println("even count값 : $count")
            longest = count
        }
    }

    fun solution(s: String): Int
    {
        longest = 1
        word = s
        wordsize = s.length

        for (i in 0 until wordsize) {
            oddlengthCheck(i)
            evenlengthCheck(i)
        }
        return longest
    }

}