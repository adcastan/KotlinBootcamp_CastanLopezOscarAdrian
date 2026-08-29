import java.util.Calendar

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {

    diaDeLaSemana()

    println("\nTu fortuna es: ${obtenerGalletaDeFortuna()}")




}

fun diaDeLaSemana(){
    println("¿Qué día es hoy?")
    val dia= Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (dia){
        1-> "Domingo"
        2-> "Lunes"
        3-> "Martes"
        4-> "Miercoles"
        5-> "Jueves"
        6-> "Viernes"
        7-> "Sabado"
        else-> "Error"
    })

}

fun obtenerGalletaDeFortuna(): String{

    var fortuna1 = "Tendrás un buen día";
    var fortuna2 = "Todas las bendiciones llegarán a ti"
    var fortuna3 = "Eres radiante"
    var fortuna4= "Confundir rival para vencer enemigo"
    var fortuna: String;
    for (i in 1..10) {
        fortuna = (getCumpleanios()/fortuna1.length)
    }
    return fortuna;
}

fun getCumpleanios(): Int{
    print("Ingresa tu cumpleaños: ")
    var birthday = readLine()?.toIntOrNull() ?: 1
 return birthday;
}