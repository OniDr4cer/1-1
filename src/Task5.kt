fun main(){
    print("Число n = ")
    val n = readln().toInt()

    print("Основание x = ")
    val x = readln().toInt()

    var y = 0
    var proverka = 1

    while (proverka < n){
        proverka *= x
        y++
    }

    if(proverka == n){
        println("Степень = $y")
    } else {
        println("Целочисленного показателя не существует")
    }
}