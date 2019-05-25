


public class NumberUtilities {

    public static String getRange(int stop) {
        String numstring = "";
        for (int i = 0; i < stop; i++)
        {
            
            numstring += String.valueOf(i);
           
        }
        return numstring;
    }

    public static String getRange(int start, int stop) {
        for (int i = start; i < stop; i++)
        {
            numstring += String.valueOf(i);
        }
        return numstring;
    }
    


    public static String getRange(int start, int stop, int step) {
        String numString = "";
        for (int i = start; i < stop; i+=step)
        {
            numString += String.valueOf(i);
        }
        return numString;
    }

    public static String getEvenNumbers(int start, int stop) {
        String numstring = "";
        for (int i = start; i < stop; i++ )
        {
            if (i % 2 == 0)
            {
               numstring += String.valueOf(i); 
            }
        }
        return numstring; 
    }


    public static String getOddNumbers(int start, int stop) {
        String numstring = "";
        for (int i = start; i < stop; i++ )
        {
            if (i % 2 != 0)
            {
               numstring += String.valueOf(i); 
            }
        }
        return numstring; 
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String numstring = "";
        for (int i = start; i <= stop; i++)
        {
            numstring += (int)Math.pow(i, exponent);
        }
        return numstring;
    }
}
