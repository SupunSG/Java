
/**
 * Interacting with Strings 
 * 
 * @author Supun Gamage 
 * 
 */
public class Part3 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int currIndex = dna.indexOf(stopCodon, startIndex+3);
        while(currIndex!=-1){
            int diff = currIndex - startIndex;
            if(diff % 3 == 0){
                return currIndex;
            }else{
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }
        return dna.length(); 
    }
     
    public void testFindStopCodon(){
        String dna = "ATGAAGTAAGTAGAT";
        int dex = findStopCodon(dna,0,"TAA");
        if(dex!=6){
            System.out.println("Error on 6");
        }else{
            System.out.println("Test finished");
        }
         
        dna = "ATGAAGAAGTAGAT";
        dex = findStopCodon(dna,0,"TAA");
        if(dex!=dna.length()){
            System.out.println("Error");
        }else{
            System.out.println("Test finished");
        }
    }
     
    public String findGene(String dna, int where){
        int startIndex = dna.indexOf("ATG", where);
        if(startIndex == -1){
            return "";
        }
        int taaIndex = findStopCodon(dna,startIndex,"TAA");
        int tagIndex = findStopCodon(dna,startIndex,"TAG");
        int tgaIndex = findStopCodon(dna,startIndex,"TGA");
        int minIndex = 0;
        if(taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)){
            minIndex = tgaIndex;
        }else{
            minIndex = taaIndex;
        }
        if(minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)){
            minIndex = tagIndex;
        }
        if(minIndex == -1){
            return "";
        }
        return dna.substring(startIndex, minIndex +3);
    }
    
    public void printAllGenes(String dna){
        int startIndex = 0;
        while(true){
            String currentGene = findGene(dna, startIndex);
            if(currentGene.isEmpty()){
                break;
            }
            System.out.println(currentGene);
            startIndex = dna.indexOf(currentGene, startIndex) + 
                         currentGene.length();
        }
    }
         
    public int countGenes(String dna){
        int count = 0;
        for(int i=0;i<=(dna.length());i++){
            String gene = findGene(dna,i);
            int startIndex = dna.indexOf(gene,i);
            if(gene.equals("") ){
                return count;
            }else{
                count += 1;
                i = startIndex + gene.length() -1;
            }
        }
        return count;
    } 
    
    public void testCountGenes(){
        String dna = "ATGTAAGATGCCCTAGT";
        int count = countGenes(dna);
        System.out.println("Number of genes in " + dna + " is " + 
        count);
    }
}
