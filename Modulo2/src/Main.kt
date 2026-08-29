//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var pescados = 2.plus(71).plus(233).minus(13).div(30).plus(1)

    println(pescados)

    var rainbowColor : String = "Morado"

    println(rainbowColor)


    rainbowColor = "Amarillo"

    println(rainbowColor)


    val blackColor : String = "Negro"

    println(blackColor)

    //    blackColor = "azul"; Este da error.

    // rainbowColor = null; Causa error. Intencional como el de arriba.
    var greenColor : String? = null
    var blueColor = null;

    println(greenColor)
    println(blueColor)



    listOf(null,null)
    var lista = listOf(null,null)
    // var lista2:List,? = null

    println(lista)


    // println(nullTest?.inc() ?:0)

    var trout: String = "trucha"
    var haddock: String = "eglefino"
    var snapper: String = "pargo"
    println("Me gustan los tres, la $trout, el $snapper y el $haddock, el $snapper sabe muy bien frito")

  /*  when (fishName.length){
        0-> println("El nombre de pez no puede estar vacio")
        in 3..12-> println("Buen nombre de pez")
        else -> println("nombre de pez decenton")
    }
*/

    when (trout.length){
        0-> println("El nombre de pez no puede estar vacio")
        in 3..12-> println("Buen nombre de pez")
        else -> println("nombre de pez decenton")
    }



    var listaNumeros  = mutableListOf<Int>()
    for(i in 0..100 step 8) listaNumeros.add(i)
    print(listaNumeros)

}