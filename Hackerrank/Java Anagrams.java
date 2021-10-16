import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {
        
        char aArr[] = a.toLowerCase().toCharArray();
        char bArr[] = b.toLowerCase().toCharArray();
        
        if (a.length() !=b.length() )
        {  return false;    
        } 
        else
        { 
        java.util.Arrays.sort(aArr);
        java.util.Arrays.sort(bArr);
        return (java.util.Arrays.equals(aArr,bArr)); 
        }
    }

  public static void main(String[] args) {
