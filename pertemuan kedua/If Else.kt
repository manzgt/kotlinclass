fun main(){
    val a = 10
    var b = 9

    if (a ==10) {
        print("Niai A = $a")
    }else if(a!=10){
        print (" Bukan 10")
    }else if (a>b){
        print(" Nilai A lebih besar dari B adalah $a")
    }else if(b<a){
        print(" Nilai b $b")
    }else if ((a===b)&&(a>b)) {
        print(" Nilai A dan B adalah $a , $b ")
    }else if ((a===b)||(a>b)) {
        print(" Nilai A dan B adalah $a , $b ")
    }else if (b<=a){
        print(" Nilai B $b")
    }else if (a>=b){
        print("Nilai A = $a")
    }else{
        print(" Tidak ada Nilai")
    }
}