
package PYQ2019;

/*
TTATGTTTTAAGGATGGGGCGTTAGTT
GGTATGATGGGTTGA
ATGGTA
ATGTTTGTAA
TGGATGTATATA
*/

import java.util.Scanner;

public class Q3_2019 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter genome string [quit to stop] : ");
            String genome = sc.nextLine();
            
            if(genome.equals("quit")) {
                break;
            }
            
            if(!genome.contains("ATG") || !(genome.contains("TAG")|| genome.contains("TAA")|| genome.contains("TGA"))) {
                System.out.println("No gene.");
                continue; // skip the remaining code in the loop
            }
            
            int start = genome.indexOf("ATG");
            int tagIndex = genome.indexOf("TAG", start + 3);
            int taaIndex = genome.indexOf("TAA", start + 3);
            int tgaIndex = genome.indexOf("TGA", start + 3);
            int minIndex = findMin(tagIndex, taaIndex, tgaIndex);
            
            if(minIndex == -1 || (minIndex - (start+3)) % 3 != 0) {
                System.out.println("No gene.");
                continue;
            }
            
            
            int l = genome.length();
            String totalGene = "";
            while(start+3 <= l - 6) {
                String genes = "";
                start = genome.indexOf("ATG",start);
                if(start == -1) {
                    break;
                }
                for(int i = 3; start+i+3 < l; i+=3 ) {
                    String gene = genome.substring(start+i, start+i+3);
                    if(!checkEnding(gene)) {
                        genes += gene;
                        totalGene += gene;
                    } else {
                        break;
                    }
                }
                System.out.print(genes);
                if(!genes.isEmpty()) {
                    System.out.println();
                }
                start+=3;
            }
            if(totalGene.isEmpty()) {
                System.out.println("No gene.");
            }
        }
    }
    
    public static boolean checkEnding(String e) {
        return e.equals("TAG") || e.equals("TAA") || e.equals("TGA") || e.equals("ATG");
    }
    
    public static int findMin(int tagIndex,int taaIndex,int tgaIndex) {
        int[] indices = { tagIndex, taaIndex, tgaIndex };
        
        int minIndex = Integer.MAX_VALUE;
        
        for (int i : indices) {
            if (i != -1 && i < minIndex) {
                minIndex = i;
            }
        }
        
        if(minIndex != Integer.MAX_VALUE) {
            return minIndex;
        } else {
            return -1;
        }
    }
}
