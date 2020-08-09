import java.util.Scanner

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Masukan nilai anda")

    // nextInt() reads the next integer from the keyboard
    var nilai:Int = reader.nextInt()
    if (nilai >= 75 && nilai < 100){
        print ("Nilai kamu $nilai, selamat ya!")

    }
    else if(nilai > 100 || nilai < 0)
    {
        print("invalid Number")
    }
    else{
        print("Nilai kamu $nilai, silakan ikut remidial!")
    }
}