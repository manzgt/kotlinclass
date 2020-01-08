fun main() {
    for (bil in 1..100) {
        if (bil!! >= 2) {
            if ((bil == 2) || (bil == 3) || (bil == 5)|| (bil == 7)) {
                println("$bil Bilangan Prima")
            } else {
                if ((bil % 2 == 0) || (bil % 3 == 0) || (bil % 5 == 0)||(bil % 7 ==0)) {
                } else {
                    println("$bil Bilangan Prima")
                }
            }
        }
    }
}