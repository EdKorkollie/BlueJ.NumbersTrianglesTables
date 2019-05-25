 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        
        String asterick = "";
        for(int i = 0; i < numberOfStars; i++)
        {
            asterick += "*";
        }
        return asterick;
    }
    
    public static String getTriangle(int numberOfRows) {
        String asterick = "";
        for(int i = 1; i <= numberOfRows; i++)
        {
            asterick += getRow(i) + "\n";
        }
        return asterick;
    }


    public static String getSmallTriangle() {
        String asterick = "";
        for(int i = 1; i <= 4; i++)
        {
            asterick += getRow(i) + "\n";
        }
        return asterick;
    }

    public static String getLargeTriangle() {
        String asterick = "";
        for(int i = 1; i <= 9; i++)
        {
            asterick += getRow(i) + "\n";
        }
        return asterick;
    }
}
