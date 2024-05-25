class Calculator {
  def add(a: Double, b: Double): Double = a + b

  def subtract(a: Double, b: Double): Double = a - b

  def multiply(a: Double, b: Double): Double = a * b

  def divide(a: Double, b: Double): Double = {
    if (b == 0) throw new ArithmeticException("Division by zero")
    a / b
  }

  // Calcula la raíz cuadrada con la aproximación de Newton-Raphson
  def sqrt(a: Double): Double = {
    if (a < 0) throw new ArithmeticException("Raíz de número negativo")

    val precision = 0.001
    var guess = divide(a, 2.0)
    var difference = 1.0

    while (difference > precision) {
      val newGuess = divide(add(guess, divide(a, guess)), 2.0)
      difference = abs(subtract(newGuess, guess))
      guess = newGuess
    }

    guess
  }

  // Devuelve el valor absoluto de un número
  private def abs(value: Double): Double = {
    if (value < 0) -value else value
  }
}
