

fun main() {
    println("Introduce la palabra")
    var palabra = readLine()?.toCharArray()?: charArrayOf(' ')
    var oculta = Array (palabra?.size){"*"}
    repeat(20){
        println(" ")
    }
    var word = Array (palabra?.size){" "}
    for (i in 0..word.size-1){
        word[i] = palabra[i].toString()
    }
    for (i in 0..oculta.size-1){
        print(oculta[i])
    }
    println(" ")
    var continuar = true
    var errores = 0
    while(continuar&&errores<10){
    println("Introduce una letra:")
    var letra = readLine()
        if(letra !in word){
            errores += 1
        }
        else{
    for(i in 0..oculta.size-1){
        if(word[i]==letra){
            oculta[i] = letra
        }
    }}
        for (i in 0..oculta.size-1){
            print(oculta[i])
        }
        var palabra2 = ""
        var palabraoculta = ""
        for(i in 0..oculta.size-1){
            palabra2 = palabra2+word[i]
            palabraoculta = palabraoculta+oculta[i]
        }
        if(palabra2 == palabraoculta){
            continuar = false
        }
    println(" ")
    println("Intentos = "+errores)}
}