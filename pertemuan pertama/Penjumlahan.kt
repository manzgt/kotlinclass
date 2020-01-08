fun main(){
    print("Masukan Nilai A =")
    val a = readLine()?.toInt()
    print("Masukan Nilai B =")
    val b = readLine()?.toInt()

    val hasil = a!!+b!!
    println("Nilai dari penjumlahan Adalah $hasil")
}