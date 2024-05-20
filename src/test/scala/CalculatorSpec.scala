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
}
