fun main() {
    val idade: Int = 18
    val nome: String = "Rayane"
    var endereco: String = "rua"

    var profissao: String = " professora"
    profissao ="dentista"
    profissao = "medico"

    var peso: Double = 45.5
   // peso = 52.5


    if (peso > 50.0){
        println("voçê esta acima do peso")
    } else if (peso< 46.0) {
        println("voçê esta abaixo do peso")
    } else {
        println("voçê esta dentro do peso")
    }

    if (idade > 18){
        println("possui mais de 18 anos")
    } else if (idade == 18){
        println("possui 18 anos")
    } else {
        println("possui menos de 18 anos")
    }

    if (nome == "Rayane"){
        println("Essa sou eu")
    } else {
        println("não sou eu")
    }

    if (profissao == "professora"){
        println("É professora")
    } else if (profissao == "dentista"){
        println("É dentista")
    } else if (profissao == "medico"){
        println("É medico")
    }

    val a = 1
    val b = 5
    val c = a + b // 6
    val d = a * b // 5
    val e = c + d // 11

    if ( e > 10){
        println("É maior que 10")
    }else if (e < 10){
        println("É menor que 10")
    }else{
        println("É igual a 10")
    }

}
