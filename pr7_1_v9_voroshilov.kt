fun main() {
    try {
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()

        when{
            (a*b*c<0) -> println("Неверные данные")
            else ->{
                val p = (a + b + c) / 3
                val q = Math.pow((a * b * c), (1.0/3.0))
                println(p)
                println(q)
            }
        }
    }
    catch (e:Exception){
        println("Неверный формат")
    }
}