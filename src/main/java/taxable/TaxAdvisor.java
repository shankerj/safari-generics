package taxable;

import java.util.ArrayList;
import java.util.List;

public class TaxAdvisor {
  public static void calculateTaxes(Taxable t) {}
  public static void calculateBatchTaxes(List<Taxable> lt) {
    Taxable tx = lt.get(0);
    lt.add(new Taxable());
    lt.add(new Corporation());
    for (Taxable t : lt) {
      calculateTaxes(t);
    }
  }

  public static void main(String[] args) {
    List<Taxable> clients = new ArrayList<>();
    clients.add(new Corporation());
    clients.add(new Corporation());
    clients.add(new Individual());
    clients.add(new Corporation());
    clients.add(new Individual());

    calculateBatchTaxes(clients);

    List<Individual> joesClients = new ArrayList<>();
    joesClients.add(new Individual());
    joesClients.add(new Individual());
    joesClients.add(new Individual());

    calculateBatchTaxes(joesClients);
  }
}
