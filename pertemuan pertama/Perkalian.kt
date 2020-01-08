fun main(){
    print("Masukan Nilai A =")
    val a = readLine()?.toInt()
    print("Masukan Nilai B =")
    val b = readLine()?.toInt()
    var hasil = a!!*b!!
    println("Nilai Hasil Perkalian Adalah = $hasil")
}