public class Die{

    //fields
    private int num1;
    private int num2;

    //constructor
    public Die(){

        num1= (int)(Math.random()* 6) + 1;
        num2 = (int)(Math.random()* 6) + 1;

    }


    //methods
    public int roll(){

        num1= (int)(Math.random()* 6) + 1;
        num2= (int)(Math.random()* 6) + 1;

        return num1+num2;

        

    }


}