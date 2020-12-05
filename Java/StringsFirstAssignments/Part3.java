
/**
 * Interacting with Strings
 * 
 * @author Supun
 */

public class Part3 {
    public boolean twoOccurrences(String a, String b){
        boolean result;
        int startIndex = b.indexOf(a);
        int len = a.length();
        int x = b.length()-len;
        int count = 0;
        for(int i=startIndex; i<=x; i++){
            String j = b.substring(i,i+len);
            if(a.equals(j)){
                count += 1;
                i = i+len-1;
            }
        }
        if(count>=2){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    public void testing(){
        String a = "by";
        String b = "A story by Abby Long";
        boolean twoOcc = twoOccurrences(a,b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("Two occurrences " + twoOcc);
        System.out.println("");
        
        a = "a";
        b = "banana";
        twoOcc = twoOccurrences(a,b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("Two occurrences " + twoOcc);
        System.out.println("");

        a = "atg";
        b = "ctgtatgta";
        twoOcc = twoOccurrences(a,b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("Two occurrences " + twoOcc);
        System.out.println("");
        System.out.println("");
        
        a = "an";
        b = "banana";
        String subStri = lastPart(a,b);
        System.out.println("The part of the string after " + a + " in " + b + " is " + subStri);
        System.out.println("");
        
        a = "zoo";
        b = "forest";
        String sub = lastPart(a,b);
        System.out.println("The part of the string after " + a + " in " + b + " is " + sub);
        System.out.println("");
        System.out.println("");
    }
    
    public String lastPart(String a, String b){
        String result;
        int startIndex = b.indexOf(a);
        if(startIndex != -1){
            result = b.substring(startIndex);
        }else{
            result = b;
        }
        return result;
    }
}
