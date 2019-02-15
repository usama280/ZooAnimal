public class Animal extends Food
{
    /*
    private int age = 21;
    private boolean isMale = true;
    private String name = "Melman";
    private double weight = 1800.01;
    private final String COLOR = "Yellow with brown polka-dots";
    **/
    public static void main(String[] args)
    {
        int age = 21;
        boolean isMale = true;
        String name = "Melman";
        double weight = (double)(Math.random()*1600.0 + 600.0);
        final String COLOR = "Yellow with brown polka-dots";
        
        Food food = new Food (age, isMale, name, weight);

        Food food2 = new Food();
        food2.setAge(age);
        food2.setGender(isMale);
        food2.setWeight(weight);
        food2.setName(name);

        
        System.out.println(food.finalStatement());
        
        
    }
    
}
