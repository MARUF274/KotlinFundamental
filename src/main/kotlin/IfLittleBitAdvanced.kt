import java.util.Scanner

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Masukan nilai anda")

    // nextInt() reads the next integer from the keyboard
    var nilai:Int = reader.nextInt()
    var out =
    if (nilai >= 90 && nilai < 100){
        "A"
    }
    else if(nilai >= 80 && nilai < 100)
    {
        "B"
    }
    else if(nilai >= 70 && nilai < 100)
    {
        "C"
    }
    else if(nilai >= 60 && nilai < 100)
    {
        "D"
    }
    else if( nilai > 100 || nilai < 0)
    {
        "Invalid"
    } else {
        "E"
    }
    print(out)
}