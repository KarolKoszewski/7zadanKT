import kotlin.random.Random
object Quotes{
    val quotes = mutableListOf(
        "Technika się siły boi",
        "You tell me 'Good Luck'. I don't need luck to perform. I decide when to perform good. I'm playing to win and to win. I will destory you",
        "Ty to chyba Chińczyk jesteś",
        "Anastazja przestańpisac",
    )

    fun getRandomquote(): String
    {
        if(quotes.isEmpty())
        {
            return "Brak dostępnych cytatów"
        }
        val randomQuote=Random.nextInt(quotes.size)
        return quotes[randomQuote]
    }
    fun addQuote(quote:String){
        quotes.add(quote)
    }
}
fun main()
{
    println("Losowy Cytat: ${Quotes.getRandomquote()}")

    println("Dodawanie nowego cytatu")
    Quotes.addQuote("sento wymyslisz ksywe dla otylego kuzyna macka? - Big mac")

    println("Losowy cytat po dodaniu : ${Quotes.getRandomquote()}")
}