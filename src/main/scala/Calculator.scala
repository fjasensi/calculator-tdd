class Calculator {
  def add(a: Float, b: Float): Float = a + b

  def subtract(a: Float, b: Float): Float = a - b

  def multiply(a: Float, b: Float): Float = a * b

  def divide(a: Float, b: Float): Float = {
    if (b == 0) throw new ArithmeticException("Division by zero")
    a / b
  }
}
