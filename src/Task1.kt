fun main(){
    print("Введите строку: ")
    val input = readln()
    if (input == "") {
        println("Cтрока не может быть пустой!")
        return
    }
    val result = obrabotka(input)
    println("Результат: $result")
}

fun obrabotka (input: String): String {

    val result = StringBuilder()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) {
                result.append(count)
            }
            currentChar = input[i]
            count = 1
        }
    }
        result.append(currentChar)
        if (count > 1) {
            result.append(count)
    }
    return result.toString()
}
