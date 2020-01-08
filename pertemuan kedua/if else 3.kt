fun main(){
    print("Masukan Usia Anda = ")
    val age = readLine()?. toInt()
//    val output = if (age!! > 18) ("Boleh")
//    else ("Tidak Boleh")
//    print(output)
    val output = when(age){
        in 18..100 -> {
            "Boleh"
        }
        in 0..17 -> {
            "Tidak Boleh"
        }
        else -> {
            "zz"
        }
    }
    print(output)
}