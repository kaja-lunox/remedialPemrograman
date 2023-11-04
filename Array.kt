package remed

fun main() {
    //Buat contoh array min. 20 lalu print
    var absen: Array<String> = arrayOf(
        "abdul ",
        "Hanif ",
        "Ilyas ",
        "Fadhil ",
        "Ardan ",
        "FaizA ",
        "FaizK ",
        "Hadid ",
        "Irsyad ",
        "Aji ",
        "Rezvan ",
        "abdul  ",
        "Hanif  ",
        "Ilyas  ",
        "Fadhil  ",
        "Ardan ",
        "FaizA  ",
        "FaizK  ",
        "Hadid  ",
        "Irsyad  ",
        "Aji  ",
        "Rezvan  ",
    )
    absen.forEachIndexed { index, absen ->
        println(absen)
    }
}