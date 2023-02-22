fun main() {
months()
MajorCities()
    calculations()
    println( Myfamily("Bellah", "Shaturah", "Betty"))
}
fun months (){
    var specificMonths= arrayOf("December", "March", "October","January")
println(specificMonths.contentToString())

}
fun MajorCities (){
   var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    for (cities in cities)
        println( cities.capitalize())
var city= cities




}
fun calculations (){
    var numbers= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var adding= numbers.sum()
println(adding)

    var findings= numbers.indexOf(158)
println(findings)

    var AscendingOrder= numbers.sortedArray()
println(AscendingOrder.contentToString())

}

fun Myfamily (name1:String,name2:String,name3:String):String{

    var new= arrayOf(name1,name2,name3)
    return new.contentToString()

}
