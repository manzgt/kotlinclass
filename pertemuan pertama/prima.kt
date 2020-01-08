fun main(){
    print("Masukan Bilangan : ")
    val bil = readLine()?.toInt()
    if (bil!! >= 2){
        if((bil==2)||(bil==3)||(bil==5)){
            print("Bilangan Prima")
        }else{
            if((bil%2==0)||(bil%3==0)||(bil%5==0)){
                print("Bukan Prima")
            }else{
                print("Bilangan Prima")
            }
        }
    }
}