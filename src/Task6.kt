fun main(){
    print("Поиск нечетного числа\n")
    print("Введите число a = ")
    val a = readln().toString()

    print("Введите число b = ")
    val b = readln().toString()

    val ab = (a + b).toInt()
    val ba = (b + a).toInt()

    if (ab % 2 == 1){
        println("a + b = $ab")}
    else if (ba % 2 == 1){
        println("b+a = $ba")
    }
    else{
        println("Нечетного числа нет")
    }
}