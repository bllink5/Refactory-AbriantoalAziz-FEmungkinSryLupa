fun mask(input: String): String? {
    return input.replace(".(?=.{4})".toRegex(), "X")
}
fun main(){
    var str = "23dn3ir30fd2eddd"
    println(mask(str))
}