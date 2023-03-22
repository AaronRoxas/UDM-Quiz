import javax.swing.JOptionPane;

public class Act4 
{
    //declaring and initializing static variable
    static int result=1; 
    static int getNum = 0; 
    public final String username = "user";
    public final String password = "admin123";
    
    public static void main(String[] args)
    {
        //creating an object of class Act4
        
        String u = JOptionPane.showInputDialog("Enter username: ");
        String p = JOptionPane.showInputDialog("Enter password: ");

        if(isPassValid(p) && isUserValid(u))
        {
            display();
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid username or password!"); 
    }
    
  //USED TO DISPLAY THE OPTIONS
    
    public static void display(){
        int dialogBox;
        do{
        getNum = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        
        String input = JOptionPane.showInputDialog("-------------------------------------"
       +"\n[F]Factorial of a Number"
       +"\n[R]Number in reverse" 
       +"\n[C]Count Number of Digit(s)" 
       +"\n[E]Exit"
        +"\n-------------------------------------");
        
        if(input.equalsIgnoreCase("F"))
        {
            factorial();
            
        }
        
        else if (input.equalsIgnoreCase("R"))
        {
            reverseNum();
        }
        
        else if (input.equalsIgnoreCase("C"))
        {
            numOfDigits();
        }
        
        else if (input.equalsIgnoreCase("E"))
        {
            System.exit(0);
        }
         getNum = 0;
         result = 1;
        dialogBox = JOptionPane.showConfirmDialog(null,"Try Again?","Exit",JOptionPane.YES_NO_OPTION);
        
        
        
        }while(dialogBox == JOptionPane.YES_OPTION);
        
    }
    
    // USED FOR VALIDATION OF USER AND PASSWORD
    public static boolean isPassValid(String password)
    {
        return password.equals("admin123");
        
    }
    public static boolean isUserValid(String username)
    {
        return username.equals("user");
        
    }

    
    //DIFFERENT FUNCTIONS AND METHODS TO BE CALLED LATER ON
    public static void factorial ()
    {
        //loop to calculate factorial of the input number
        for(int i = 1; i <=getNum; i++)
        {
          //multiplying each number in the loop to get the factorial value
          result *= i;
         
        }
        JOptionPane.showMessageDialog(null, "The factorial of " +getNum + " is "+ result);
    }
    
    public static void reverseNum()
    {
        int reversed=0;
        int num1 = getNum;
        while(num1!=0)
        {
            reversed = reversed *10 + num1 %10;
            num1/=10;
            
        }
        JOptionPane.showMessageDialog(null,"Number in reversed: "+reversed);
        reversed = 0;
    }
    
    public static void numOfDigits()
    {
        int counter = 0;
        int num1 = getNum;
        for(int i = 1; i <= num1;i++)
        {
            while(num1!=0)
            {
                num1/=10;
                counter++;
            }            
            JOptionPane.showMessageDialog(null,"Number of Digits: "+counter);
            counter = 0; 
        }
    }
}
