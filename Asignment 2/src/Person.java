public class Person implements Payable{
    private static int idCounter = 1;
    private int id = 0;
    private String name;
    private String surname;
    public Person(String name, String surname){
        this.name = this.name;
        this.surname = this.surname;
        this.id = idCounter++;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    @Override
    public String toString(){
        String s = getId() + "." + getName() + " " + getSurname();
        return s;
    }
    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
    @Override
    public int compareTo(Person other) {
        double thisPayment = this.getPaymentAmount();
        double otherPayment = other.getPaymentAmount();

        return Double.compare(thisPayment, otherPayment);
    }
}
