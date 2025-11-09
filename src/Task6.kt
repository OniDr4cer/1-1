fun main(){
    print("Поиск нечетного числа\n")
    print("Введите число a = ")
    val a = readln().toInt()

    print("Введите число b = ")
    val b = readln().toInt()

    val ab = a * 10 + b
    val ba = b * 10 + a

    if (ab % 2 == 1){
        println("a + b = $ab")}
    else if (ba % 2 == 1){
        println("b+a = $ba")
    }
    else{
        println("Нечетного числа нет")
    }
}