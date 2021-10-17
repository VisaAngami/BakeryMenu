public class Cake {

	String name;
	float price;
	String flavour;

	 public String getname(){
		return name;
	}

	public void setname(String name){
		 this.name=name;
	}

	public float getprice(){
		 return price;
	}

	public void setprice(float price){
		 this.price=price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public void display(){
		System.out.println(name+ ":" + "\u20B9" + price+ " per piece");
	}
}
