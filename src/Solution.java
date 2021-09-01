import groovy.transform.ToString;

public class Solution {
    public static String largestOddNumber(String num) {
        int maxnumber=0;
        char[] array1 = new char[num.length()];
        int[] array2 =  new int[num.length()];
        for(int i=0;i<num.length();i++) {
            array1[i] = num.charAt(i);

        }
        for (int i=0;i<array1.length;i++) {
            array2[i]=Character.getNumericValue(array1[i]);
            if((maxnumber<array2[i])&&(array2[i]%2!=0)) {
                maxnumber=array2[i];
            }
        }
        num= String.valueOf(maxnumber);
        if(maxnumber==0){
            num="";
        }else {
            num= String.valueOf(maxnumber);
        }
        return num;

    }
    public static void main(String[] args) {
        String num= "4376";
        System.out.println(largestOddNumber(num));
    }
}