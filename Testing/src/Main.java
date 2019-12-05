class Main {
    public static void main(String[] args) {
        greet(new Company("Foo inc.", "Hello"));
        greet(new Person("John", "Doe", "Hello"));
        greet(new Alien("BarBaz", "Hello"));
    }

    public static void greet(Greeting greetee) {
        greetee.greet();
    }
}

interface Greeting{
	public void greet();
}

class Company implements Greeting{
    private String name;
    private String salutation;

    public Company(String name, String salutation) {
        this.name = name;
        this.salutation = salutation;
    }

    public String getName() {
        return name;
    }

    public String formGreeting() {
        return salutation + " employees of " + getName();
    }

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		String message = this.formGreeting() + ", How are you today?";
		System.out.println(message);
		
	}
}

class Person implements Greeting{
    private String firstName;
    private String lastName;
    private String salutation;

    public Person(String firstName, String lastName, String salutation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String formGreeting() {
        return salutation + " " + getName();
    }

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		String message = this.formGreeting() + ", How are you today?";
		System.out.println(message);
	}
}

class Alien implements Greeting{
    private String blorp;
    private String salutation;

    public Alien(String blorp, String salutation) {
        this.blorp = blorp;
        this.salutation = salutation;
    }

    public String getName() {
        return "&#^" + blorp; 
    }

    public String formGreeting(String blip) {
        return blip + "%^&" + salutation;
    }

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		String message = this.formGreeting("Quark") + ", How are you today?";
		System.out.println(message);
		
	}
}