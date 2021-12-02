fun main() {
    fun part1(input: List<String>): Int {
        return input
            .map { it.toInt() }
            .windowed(2)
            .filter { it[1] > it[0] }
            .size

    }

    fun part2(input: List<String>): Int {
        return input
            .map { it.toInt() }
            .windowed(3)
            .windowed(2)
            .filter { it[1].sum() > it[0].sum() }.size
    }

    val input = readInput("2021/day1")
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}
