package remed

fun main() {
    //Buat rumus untuk menghitung aritmatka menggunakan range
    val aritmatika = 2..20 step 5
    aritmatika.forEachIndexed { index, angka1 ->
        println(angka1)
    }

}