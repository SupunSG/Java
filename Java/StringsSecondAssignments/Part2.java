
/**
 * Interacting with Strings
 * 
 * @author Supun
 * 
 */
public class Part2 {
    public int howMany(String stringa, String stringb){
        int count = 0;
        int startIndex = stringb.indexOf(stringa);
        if(startIndex == -1){
            return 0;
        }else{
            for(int i=0;i<=(stringb.length()-stringa.length());i++){
                
                int currIndex = stringb.indexOf(stringa,i);
                System.out.println("current index = " + currIndex);
                if(currIndex != -1){
                   count += 1;
                   i = currIndex + stringa.length()-1;
                }else{
                    return 0;
                }
            }
        }
        return count;
    }
    
    public void testHowMany(){
        String a = "GAA";
        String b = "ATGAACGAATTGAATC";
        int number = howMany(a,b);
        System.out.println(number);
        System.out.println("");        
        
        a = "AA";
        b = "ATAAAA";
        number = howMany(a,b);
        System.out.println(number);
        System.out.println("");
        System.out.println(""); 
    }
}
