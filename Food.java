public class Food
{
    // instance variables - replace the example below with your own
    private int age;
    private boolean isMale;
    private String name;
    private double weight;
    final String COLOR = "yellow and brown polka-dots";
    /**
     * Constructor for objects of class Food
     */
    public Food()
    {
        age = 0;
        isMale = false;
        name = "";
        weight = 0.0;
    }
    public Food(int age, boolean isMale, String name, double weight)
    {
        // initialise instance variables
        this.age = age;
        this.isMale = isMale;
        this.name = name;
        this.weight = weight;
    }
    public int getAge()
    {
        // put your code here
        return age;
    }
        public void setAge(int x)
    {
        // put your code here
        age = x;
    }
    public String getGender()
    {
        // put your code here
        if (isMale == true)
        {
            return "male";
        }
        else {
            return "female";
        }
    }
        public void setGender(boolean y)
    {
        // put your code here
        isMale = y;
    }
    public double getWeight()
    {
        // put your code here
        return Math.round(weight * 100)/100.0;
    }
        public void setWeight(double z)
    {
        // put your code here
        weight = z;

    }
    public String getName()
    {
        // put your code here
        return name;
    }
        public void setName(String c)
    {
        // put your co