fun main(){
    print("Masukan Nilai A =")
    val nilai1 = readLine()?.toInt()
    val output = if (nilai1!! % 2 == 0)("Bilangan Genap")
    else if (nilai1 % 2 == 1)("Bilangan Ganjil")
    else("Nilai Kurang tepat")
    print(output)
}