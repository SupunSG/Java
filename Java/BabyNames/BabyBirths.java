
/**
 * Analyzing and manipulate data from multiple CSV Data Files using open-source
 * software package: Apache Commons CSV.
 * 
 * @author Supun Gamage 
 */
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class BabyBirths {
    public void testTotalBirths(){
        FileResource fr = new FileResource();
        totalBirths(fr);
    }
    
    public void totalBirths(FileResource fr){
        int totalBirths = 0;
        int totalBoys = 0;
        int totalGirls = 0;
        int BoyNames = 0;
        int GirlNames = 0;
        for(CSVRecord rec : fr.getCSVParser(false)){
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirths += numBorn;
            if(rec.get(1).equals("M")){
                totalBoys += numBorn;
                BoyNames += 1;
            }else{
                totalGirls += numBorn;
                GirlNames += 1;
            }
        }
        System.out.println("Total names = " + totalBirths);
        System.out.println("Total girls names = " + totalGirls);
        System.out.println("Total boys names = " + totalBoys);
        System.out.println("Total num of girls names = " + GirlNames);
        System.out.println("Total num of boys names = " + BoyNames);
        System.out.println("");
    }
    
    public int getRank(int year, String name, String gender){
        FileResource fr = new FileResource("us_babynames_by_year/yob" + year + ".csv");
        int rank = 0;
        int result = 0;
        for(CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender)){
                rank += 1;
                if(rec.get(0).equals(name)){
                    result = rank;
                }   
            }
        }
        if(result == 0){
            result = -1;
        }
        return result;
    }
    
    public void testGetRank(){
        String name = "Mich";
        String gender = "M";
        int year = 1880;
        int rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1881;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1882;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1883;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1884;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1885;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1886;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1887;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1888;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1891;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1890;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1891;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1892;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1893;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1894;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1895;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1896;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1897;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1898;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1899;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
        name = "Mich";
        gender = "M";
        year = 1900;
        rank = getRank(year, name, gender);
        System.out.println("Rank of the name: "+name+" and gender: "+gender+" is " + rank);
        
    }
        
    public String getName(int year, int rank, String gender){
        FileResource fr = new FileResource("us_babynames_by_year/yob" + year + ".csv");
        int count = 0;
        String name = "";
        String result = "";
        for(CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender)){
                count += 1;
                if(count == rank){
                    name = rec.get(0);
                    result = name;
                }else{
                    name = "NO NAME";
                }     
            }
        }
        if(result.equals("")){
            result = "NO NAME";
        }
        return result;
    }
    
    public void testGetName(){
        int year = 1980;
        int rank = 350;
        String gender = "F";
        String name = getName(year, rank, gender);
        System.out.println("Rank: "+rank+" and gender: "+gender+" is " + name);
        
        year = 1982;
        rank = 450;
        gender = "M";
        name = getName(year, rank, gender);
        System.out.println("Rank: "+rank+" and gender: "+gender+" is " + name);
    }
        
    public String whatIsNameInYear(String name, int year,int newYear, String gender){
        int rank = getRank(year, name, gender);
        String newName = getName(newYear, rank, gender);
        
        return newName;
    }
    
    public void testwhatIsNameInYear(){
        String name = "Susan";
        int year = 1972;
        int newYear = 2014;
        String gender = "F";
        String newName = whatIsNameInYear(name, year, newYear, gender);
        if(newName.equals("NO NAME")){
            System.out.println("There is no name in the year of "+newYear+ " corresponds to " + name);
        }else{
            System.out.println(name + " born in " + year+ " would be " + newName+" if she was born in " + newYear);
        }
        
        name = "Owen";
        year = 1974;
        newYear = 2014;
        gender = "M";
        newName = whatIsNameInYear(name, year, newYear, gender);
        if(newName.equals("NO NAME")){
            System.out.println("There is no name in the year of "+newYear+ " corresponds to " + name);
        }else{
            System.out.println(name + " born in " + year+ " would be " + newName+" if she was born in " + newYear);
        }
    }
    
    public int yearOfHighestRank(String name, String gender){
        DirectoryResource dr = new DirectoryResource();
        int maxYear = 0;
        int maxRank = 0;
        for(File f: dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            String fileName = f.getName();
            int year = Integer.parseInt((f.getName()).substring(3,7));
            int rank = getRank(year, name, gender);
            if(rank != -1){
                if(maxRank == 0){
                    maxRank = rank;
                    maxYear = year;
                }else{
                    if(rank<maxRank){
                        maxRank = rank;
                        maxYear = year;
                    }
                }
            }
        }
        return maxYear;
    }
    
    public void testYearOfHighestRank(){
        String name = "Genevieve";
        String gender = "F";
        int yearOfMaxRank = yearOfHighestRank(name, gender);
        System.out.println("Year of highest rank of name: "+name+" is " + yearOfMaxRank);
        
        name = "Mich";
        gender = "M";
        yearOfMaxRank = yearOfHighestRank(name, gender);
        System.out.println("Year of highest rank of name: "+name+" is " + yearOfMaxRank);
    }
    
    public double getAverageRank(String name, String gender){
        DirectoryResource dr = new DirectoryResource();
        int count = 0;
        double totalRank = 0.0;
        double result = 0.0;
        for(File f: dr.selectedFiles()){
            String fileName = f.getName();
            int year = Integer.parseInt((f.getName()).substring(3,7));
            int rank = getRank(year, name, gender);
            if(rank == -1){
                count += 1;
            }else{
                count += 1;
                totalRank += rank;
            }
        }
        double avgRank = totalRank/count;
        if(avgRank == 0.0){
            result = -1.0;
        }else{
            result = avgRank;
        }
        return result;
    }
    
    public void testGetAverageRank(){
        String name = "Susan";
        String gender = "F";
        double avg = getAverageRank(name, gender);
        System.out.println("Average rank of name: "+name+" is " + avg);
        
        name = "Robert";
        gender = "M";
        avg = getAverageRank(name, gender);
        System.out.println("Average rank of name: "+name+" is " + avg);
    }
    
    public int getTotalBirthsRankedHigher(int year, String name, String gender){
        FileResource fr = new FileResource("us_babynames_by_year/yob" + year + ".csv");
        int rank = getRank(year, name, gender);
        int totBirths = 0;
        int count = 0;
        for(CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender)){
                count += 1;
                if(count < rank){
                    totBirths += Integer.parseInt(rec.get(2));
                }   
            }
        }
        
        return totBirths;
    }
    
    public void testGetTotalBirthsRankedHigher(){
        int year = 1990;
        String name = "Emily";
        String gender = "F";
        int totalBirths = getTotalBirthsRankedHigher(year, name, gender);
        System.out.println("Total births that ranked higher: " + totalBirths);
    
        year = 1990;
        name = "Drew";
        gender = "M";
        totalBirths = getTotalBirthsRankedHigher(year, name, gender);
        System.out.println("Total births that ranked higher: " + totalBirths);
    }
}
