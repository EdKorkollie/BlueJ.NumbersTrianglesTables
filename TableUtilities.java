 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for(int row = 1; row<6; row++)
        {
            //table += " " + row * 1 +"| \n";
            for(int col =1; col<6; col++)
            {
                
                
                //table += " " + row * col + " | ";
                table += String.format("%3d |",row * col);
                if (col == 5)
                {
                    table += "\n";
                }
            
            }
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for(int row = 1; row<=10; row++)
        {
            //table += " " + row * 1 +"| \n";
            for(int col =1; col<=10; col++)
            {
                
                
                //table += " " + row * col + " | ";
                table += String.format("%3d |",row * col);
                if (col == 10)
                {
                    table += "\n";
                }
            
            }
            
        }
        System.out.println(table);
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int row = 1; row<=tableSize; row++)
        {
            //table += " " + row * 1 +"| \n";
            for(int col =1; col<=tableSize; col++)
            {
                
                
                //table += " " + row * col + " | ";
                table += String.format("%3d |",row * col);
                if (col == tableSize)
                {
                    table += "\n";
                }
            
            }
            
        }
        System.out.println(table);
        return table;
        
    }
}
