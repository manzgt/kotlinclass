fun main(){
    print("Masukan Nilai A =")
    val a = readLine()?.toFloat()
    print("Masukan Nilai B =")
    val b = readLine()?.toFloat()

    val hasil = a!!+b!!
    val hasil2 = a!!-b!!
    val hasil3 = a!!*b!!
    val hasil4 = a!!/b!!
    val hasil5 = a!!%b!!
    println("Nilai dari penjumlahan Adalah $hasil")
    println("Nilai dari pengurangan Adalah $hasil2")
    println("Nilai dari perkalian Adalah $hasil3")
    println("Nilai dari pembagian Adalah $hasil4")
    println("Nilai dari modulus Adalah $hasil5")
}