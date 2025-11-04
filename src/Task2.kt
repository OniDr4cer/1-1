fun main() {
    print("Введите строку: ")
    val input = readln()
    if (input == "") {
        println("Cтрока не может быть пустой!")
        return
    }
    val result = countSym(input)
    println("Результат: $result")
}


fun countSym(input: String): List<String>{
    val Symcount = mutableMapOf<Char, Int>()
    for (char in input) {
        Symcount[char] = Symcount.getOrDefault(char, 0) + 1
    }
    val SymSort = Symcount.toList().sortedBy { it.first }
    val result = mutableListOf<String>()
    for((char, count)in SymSort){
        result.add("$char - $count")

    }
    return result
}