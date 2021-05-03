
public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		Customer customer = new Customer(1,"Ahmet","Ayhan",2002,"12345678911");
		customerManager.save(customer);

	}

}
