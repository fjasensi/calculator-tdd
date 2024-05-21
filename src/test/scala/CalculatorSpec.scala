import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorSpec extends AnyFlatSpec with Matchers {
  "Calculator" should "sumar dos números correctamente" in {
    val calculator = new Calculator
    calculator.add(2, 3) shouldEqual 5
  }

  it should "restar dos números correctamente" in {
    val calculator = new Calculator
    calculator.subtract(10.5, 4.5) shouldEqual 6
  }

  it should "multiplicar dos números correctamente" in {
    val calculator = new Calculator
    calculator.multiply(2, 5) shouldEqual 10
  }

  it should "dividir dos números correctamente" in {
    val calculator = new Calculator
    calculator.divide(10, 2) shouldEqual 5
  }

  it should "lanzar ArithmeticException cuando dividimos por 0" in {
    val calculator = new Calculator
    an[ArithmeticException] should be thrownBy calculator.divide(10, 0)
  }

  it should "calcular la raíz cuadrada de un número con precisión 0.001" in {
    val calculator = new Calculator
    val result = calculator.sqrt(2)
    val expectedResult = 1.414213562
    
    result shouldEqual expectedResult +- 0.001
  }
  
  it should "lanzar ArithmeticException cuando calculamos la raíz cuadrada de un número negativo" in {
    val calculator = new Calculator
    an[ArithmeticException] should be thrownBy calculator.sqrt(-2)
  }
}
