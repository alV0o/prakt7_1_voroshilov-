fun main(){
    try {

        val x = readLine()!!.toDouble()
        val y = readLine()!!.toDouble()
        val z = readLine()!!.toDouble()

        val e = 2.718

        when {
            ((1 + (x * x) / 2 + (y * y) / 4) == 0.0) -> println("На 0 делить нельзя")
            else -> {
                val a = (Math.sqrt(Math.abs(x - 1)) - Math.pow(Math.abs(y), (1.0 / 3.0))) / (1 + (x * x) / 2 + (y * y) / 4)
                println(String.format("%.2f", a))

                val b = x * Math.floor((Math.atan(z) + Math.pow(e, -(x + 3))))
                println(String.format("%.2f", b))
            }
        }
    }
    catch (e:Exception){
        println("неверные данные")
    }
}