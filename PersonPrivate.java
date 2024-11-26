public class PersonPrivate 
{
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonPrivate (String name, int age, double height,double weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight; 
    }
    
    public void displayDetails()
    {
        double bmi = height / (weight+age);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) 
    {
        PersonPrivate person = new PersonPrivate ("Goh",22,177,64);  
        person.displayDetails();
    }
}