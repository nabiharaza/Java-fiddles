public class Id {

    private String name;
    private int number;

    public Id(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public String toString() {
	return "my name is: " + name + "/" + number;
    }
    public String getName() {
	return name;
    }
    public int getNumber() {
	return number;
    }
    public void printNumber() {
	System.out.println(" 	" + number);
    }
    public void printName() {
	System.out.println(" 	" + name);
    }
}