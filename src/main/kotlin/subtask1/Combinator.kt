package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {

        val m = array[0]
        val n = array[1]
        var answer: Int? = null

        for (i in 0..array[1]) {
            val numerator: Long = factorial(n)
            val denominator = factorial(i) * factorial(n - i)
            val number = numerator / denominator
            if (number == m.toLong()) {
                answer = i
                break
            }
        }

        return answer
    }

    private fun factorial(n: Int): Long {
        var answer = 1L
        if (n == 0) return answer
        else {
            for (i in 1..n) {
                answer *= i
            }
        }
        return answer
    }
}
