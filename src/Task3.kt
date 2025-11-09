fun main() {
    print("Введите число чтобы перевести в двоичную систему: ")
    var input = readln().toInt()
    val binaryChislo = StringBuilder()

    while (input > 0) {
        if (input % 2 == 0) {
            binaryChislo.append(0)
            input /= 2  }
        else {
            binaryChislo.append(1)
            input /= 2
        }
    }
    when(binaryChislo.length % 4){
        1 -> binaryChislo.append("000")
        2 -> binaryChislo.append("00")
        3 -> binaryChislo.append("0")
     }
    val binnum : String = binaryChislo.reversed().toString()
    println("Число в двоичной : $binnum")
}