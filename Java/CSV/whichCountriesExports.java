
/**
 * Analyzing and manipulate data from multiple CSV Data Files using open-source
 * software package: Apache Commons CSV.
 * 
 * @author Supun Gamage 
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class whichCountriesExports {
    public void tester(){
        FileResource fr = new FileResource();
        
        CSVParser parser1 = fr.getCSVParser();
        String re2 = countryInfo(parser1,"Nauru");
        System.out.println(re2);
        System.out.println("");
        
        CSVParser parser2 = fr.getCSVParser();
        listExpoetersTwoProducts(parser2, "cotton", "flowers");
        System.out.println("");
        
        CSVParser parser3 = fr.getCSVParser();
        int noOfExp = numberOfExporters(parser3, "cocoa");
        System.out.println("No. of Exporters = " + noOfExp);
        System.out.println("");
        
        CSVParser parser4 = fr.getCSVParser();
        bigExporters(parser4, "$999,999,999,999");
        System.out.println("");
    }
    
    public String countryInfo(CSVParser parser, String country){
        String result = "";
        for(CSVRecord record: parser){
            String co = record.get("Country");
            if(co.contains(country)){
                String exports = record.get("Exports");
                String value = record.get("Value (dollars)");
                result = (co + ": " + exports + ": " + value);
            }
        }
        return result;
    }
    
    public void listExpoetersTwoProducts(CSVParser parser, 
                           String exportItem1, String exportItem2){
        for(CSVRecord record: parser){
            String exps = record.get("Exports");
            if(exps.contains(exportItem1) && exps.contains(exportItem2)){
                String country = record.get("Country");
                System.out.println(country);
            }
        }
    }
    
    public int numberOfExporters(CSVParser parser, String exportItem){
        int count = 0;
        for(CSVRecord record: parser){
            String exps = record.get("Exports");
            if(exps.contains(exportItem)){
                count += 1;
            }
        }
        return count;
    }
    
    public void bigExporters(CSVParser parser, String amount){
        for(CSVRecord record: parser){
            String val = record.get("Value (dollars)");
            int len = val.length();
            if(len>(amount.length())){
                String co = record.get("Country");
                String va = record.get("Value (dollars)");
                System.out.println(co + " " + va);
            }
        }
    }
}
