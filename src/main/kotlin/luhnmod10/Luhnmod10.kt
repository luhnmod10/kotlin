package luhnmod10

fun valid(number: String): Boolean {
    var checksum: Int = 0

    for (i in number.length - 1 downTo 0 step 2) {
        checksum += number.get(i) - '0'
    }
    for (i in number.length - 2 downTo 0 step 2) {
        val n: Int = (number.get(i) - '0') * 2
        checksum += if (n > 9) n - 9 else n
    }

    return checksum%10 == 0
}
