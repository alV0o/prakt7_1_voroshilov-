fun main() {
    try {
        print("Введите номер M члена - ")
        val m = readLine()!!.toInt()
        print("Введите номер N члена - ")
        val n = readLine()!!.toInt()
        print("Введите значение M члена - ")
        val numM = readLine()!!.toDouble()
        print("Введите значение N члена - ")
        val numN = readLine()!!.toDouble()

        when{
            (m>=n) -> println("Неверные номера")
            else ->{
                val S = (numM+numN)/2 * (n-m+1)
                println(S)
            }
        }

    } catch (e: Exception) {
        println("Неверный формат")
    }
}