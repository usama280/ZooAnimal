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
        return age;
    }
        public void setAge(int x)
    {
        age = x;
    }
    public String getGender()
    {
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
        isMale = y;
    }
    public double getWeight()
    {
        return Math.round(weight * 100)/100.0;
    }
        public void setWeight(double z)
    {
        weight = z;

    }
    public String getName()
    {
        return name;
    }
        public void setName(String c)
    {
