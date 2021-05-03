
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheck_Service;
	
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		customerCheck_Service = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		
		if(customerCheck_Service.checkIfRealPerson(customer)) {
			
		System.out.println("Veri tabanýna kaydedildi");
			
		}else {
				throw new Exception("Not a valid person");
		}

		
	}
}
