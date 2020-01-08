fun main(){
    print("Masukan Nilai A = ")
    val a = readLine()?.toFloat()
    print("Masukan Nilai B = ")
    val b = readLine()?.toFloat()

    val hasil = a!! / b !!
    println("Hasil dari Pembagian adalah = $hasil")
}