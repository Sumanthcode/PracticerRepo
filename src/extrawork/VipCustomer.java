package extrawork;

public class VipCustomer {
	String name;
	double creditlimit;
	String email;
	
	public VipCustomer()
	{
		this("default name",5000,"default email");
		
	}
	
	public VipCustomer(double creditlimit,String email)
	{
		this("name",creditlimit,email);
	}
	
	public VipCustomer(String name,double creditlimit,String email)
	{
		this.name=name;
		this.creditlimit=creditlimit;
		this.email=email;
	}

	public String getName() {
		return name;
	}

	public double getCreditlimit() {
		return creditlimit;
	}

	public String getEmail() {
		return email;
	}
	
	

}
