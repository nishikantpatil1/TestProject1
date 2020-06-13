
public class Test {
	
	
	
	
	
	 public static void main(String[] args)
	 
	{ 
		 Person pp = new Person(); //[creates object of Person class]
	pp.eat();
	Person p = new Ratan();//[creates object of Ratan class]
	p.eat(); //compile time: Person runtime:Ratan
	Person p1 = new RatanKid();//[creates object of RatanKid class]
	p1.eat(); //compile time: Person runtime:RatanKid
	Ratan r = new RatanKid();//[creates object of RatanKid class]
	r.eat(); //compile time: Ratan runtime:RatanKid
	}


}
