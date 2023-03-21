import javax.swing.JOptionPane;
public class HandsOnQuiz
{
    public static boolean isActive = false;
   
    public static void main(String[] args)
    {
        HandsOnQuiz sys = new HandsOnQuiz();
        sys.getUser(user);
        sys.getPass(pass);
        sys.verify();

    } 
    static String user,pass;
    public String getUser(String user)
    {
        String getUser = JOptionPane.showInputDialog("Enter username: ");
        return user;     
    }
   
    public String getPass(String pass)
    {
        String getUser = JOptionPane.showInputDialog("Enter password: ");
        return pass;     
    }
    
    public static void verify() 
    {
              
        if(user.equals("user") && pass.equals("p@55w0rd"))
        { 
            isActive = true;
            do
            {
                int input = Integer.parseInt(JOptionPane.showInputDialog("[F]Factorial of number"
                 +"\n[R]Number in reverse"
                 +"\n[C]Count Number of Digits"
                 +"\n[E] Exit"));
            }
            while(isActive == true);    
        }
        
        else{
            System.exit(0);
        }
    }
    
    
    
    
    public static void factorial()
    {
    }
    
    public static void reverseNum()
    {
    }
    

    
}