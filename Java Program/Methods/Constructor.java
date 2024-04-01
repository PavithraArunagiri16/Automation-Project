package Methods;

public  class Constructor {
	Constructor()
	{
		System.out.println("Im the constructor");
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method");
		Constructor P = new Constructor();
		new Constructor();

	}

}

