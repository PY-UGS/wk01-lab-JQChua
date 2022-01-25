public class Main
{   public static void main(String[] args) 
    {
        //2a
        System.out.println("Hello, I am Jiaqi!");

        //2b
        String currency ="CSC1009";
        switch(currency)
        {
            case "CSC1010":
            System.out.println("Computer Networks");
            break;

            case "CSC1009":
            System.out.println("Object-Oriented Programming");
            break;
            
            case "CSC1008":
            System.out.println("Data Structures and Algorithms");
            break;

            case "CSC1007":
            System.out.println("Operating Systems");
            break;

            case "CSC1006":
            System.out.println("Mathematics 2");
            break;
        }

        //2c
        for (int i = 102; i > 66; i--) 
        {
            if (i%2 != 0)
            {
                System.out.print(i);
                System.out.print("\n");
            }
        }
    }
}
        
    

        
        


