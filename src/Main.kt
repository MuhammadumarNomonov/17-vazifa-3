fun main() {
val Umar = GenericUser("n1","Muhammadumar")

}
class GenericUser<T>(val id:T,val name:T){
    init {
        println("id:$id, name:$name")
    }
}
//vazifa 3