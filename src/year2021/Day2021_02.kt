fun main() {

    fun part1(input: List<String>): Int {
        var x = 0
        var y = 0
        for (item in input) {
            val parts = item.split(" ")
            val direction = parts.first()
            val distance = parts.last().toInt()
            when (direction) {
                "forward" -> x += distance
                "down" -> y += distance
                "up" -> y -= distance
            }
        }
        return x * y

    }

    fun part2(input: List<String>): Int {
        var x = 0
        var y = 0
        var aim = 0
        for (item in input) {
            val parts = item.split(" ")
            val direction = parts.first()
            val X = parts.last().toInt()
            when (direction) {
                "down" -> aim += X
                "up" -> aim -= X
                "forward" -> {x += X; y += aim * X}
            }
        }
        return x * y
    }

    val input = readInput("2021/day2")
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}
