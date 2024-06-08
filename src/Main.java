import factory.ContratosFactory;
import factory.Customer;
import factory.Factory;
import factory.SemContratosFactory;

public class Main {
  public static void main(String[] args) {
    Customer cliente = new Customer("A", false);
    Factory factory = getFactory(cliente);
    factory.create(cliente.getGradeRequest());
  }

  private static Factory getFactory(Customer cliente) {
    if (cliente.hasCompanyContract()) {
      return new ContratosFactory();
    }
    return new SemContratosFactory();
  }

}
