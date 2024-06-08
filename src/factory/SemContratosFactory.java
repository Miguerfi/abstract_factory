package factory;

/**
 * SemContratosFactory
 */
public class SemContratosFactory extends Factory {

  @Override
  Car retrieveCar(String requestedGrade) {
    if ("A".equals(requestedGrade)) {
      return new Brasilia(50, "metade", "amarela");
    }
    return null;
  }

}
