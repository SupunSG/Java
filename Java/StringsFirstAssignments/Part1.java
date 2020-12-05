
/**
 * Interacting with Strings
 * 
 * @author Supun
 */
public class Part1 {
    public String findSimpleGene(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");  
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if(stopIndex == -1){
            return "";
        }
        if((stopIndex-startIndex) % 3 == 0){
            result = dna.substring(startIndex, stopIndex + 3);
        }else{
            return "";
        }
        return result;
    }
    
    public void testSimpleGene(){
        String dna = "CTTGGCTGAAGTAATCGT";
        System.out.println("DNA is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AGATGTTGGCATGCGTATA";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "TACGCTGACGCTAGCC";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "TACATGAGGCTGCATGTACGTTAAGCTAG";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AGCATGTGTCAGTCCATGATTAATGCATC";
        System.out.println("DNA is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }
}
