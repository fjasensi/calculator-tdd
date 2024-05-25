import scala.io.StdIn._

object Main extends App {
  val calculator = new Calculator
  var continue = true

  while (continue) {
    println(
      """
        |Seleccione una opción:
        |1. Sumar
        |2. Restar
        |3. Multiplicar
        |4. Dividir
        |5. Raíz cuadrada
        |6. Salir
          """.stripMargin
    )
    val choice = readInt()

    choice match {
      case 1 =>  // Suma
        println("Ingrese el primer número:")
        val a = readDouble()
        println("Ingrese el segundo número:")
        val b = readDouble()
        println(s"Resultado: ${calculator.add(a, b)}")

      case 2 =>  // Resta
        println("Ingrese el primer número:")
        val a = readDouble()
        println("Ingrese el segundo número:")
        val b = readDouble()
        println(s"Resultado: ${calculator.subtract(a, b)}")

      case 3 =>  // Multiplicación
        println("Ingrese el primer número:")
        val a = readDouble()
        println("Ingrese el segundo número:")
        val b = readDouble()
        println(s"Resultado: ${calculator.multiply(a, b)}")

      case 4 =>  // División
        println("Ingrese el primer número:")
        val a = readDouble()
        println("Ingrese el segundo número:")
        val b = readDouble()
        try {
          println(s"Resultado: ${calculator.divide(a, b)}")
        } catch {
          case e: ArithmeticException => println(e.getMessage)
        }

      case 5 =>  // Raíz cuadrada
        println("Ingrese el número:")
        val a = readDouble()
        try {
          println(s"Resultado: ${calculator.sqrt(a)}")
        } catch {
          case e: ArithmeticException => println(e.getMessage)
        }

      case 6 =>
        println("Saliendo...")
        continue = false

      case _ => println("Opción no válida, intente de nuevo.")
    }
  }
}
