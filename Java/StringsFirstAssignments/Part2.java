
/**
 * Interacting with Strings
 * 
 * @author Supun
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
        String result = "";
        
        String toUp = dna.toUpperCase();
 
        int startIndex = toUp.indexOf(startCodon);  
        if(startIndex == -1){
            return "";
        }
        int stopIndex = toUp.indexOf(stopCodon, startIndex + 3);
        if(stopIndex == -1){
            return "";
        }
        if((stopIndex-startIndex) % 3 == 0){
            result = toUp.substring(startIndex, stopIndex + 3);
        }else{
            return "";
        }
        
        if(toUp.equals(dna)){
            return result;
        }else{
            return result.toLowerCase();
        }
    }
    
    public void testSimpleGene(){
        String startCodon = "ATG";
        String stopCodon = "TAA";
        String dna = "AAATGCCCTAACTAGATTAAGAAACC";
        System.out.println("DNA is " + dna);
        String gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        
        dna = "AGATGTTGGCATGCGTATA";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        
        dna = "TACGCTGACGCTAGCC";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        
        dna = "TACATGAGGCTGCATGTACGTTAAGCTAG";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        
        dna = "AGCATGTGTCAGTCCATGATTAATGCATC";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        System.out.println("");
    }
}

