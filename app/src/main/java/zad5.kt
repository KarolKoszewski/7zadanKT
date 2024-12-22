class Krokomierz{
    companion object{
        var liczbaKroków=0

        fun zresetujLicznik(){
            liczbaKroków=0
        }
    }
    fun zrobKrok(){
        liczbaKroków++
    }
}

fun main(){
    val krokomierz=Krokomierz()
    krokomierz.zrobKrok()
    krokomierz.zrobKrok()
    krokomierz.zrobKrok()
    println("Liczba kroków: ${Krokomierz.liczbaKroków}")

}