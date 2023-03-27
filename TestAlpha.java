import java.util.Scanner;


class Solution {
    public static int isSubsequence(String s, String t) {
        char[] sn= s.toCharArray();
        char[] tn= t.toCharArray();
        int sl = sn.length;
        int tl = tn.length;
        int p = 0;
        int j = 0;
        if( tl<1 && sl<1 ){
            return 1;
        }

        if(tl<1){
            return 2;
        }
        while (j<sl){
            if (sn[p]==tn[j])
            {

                p++;
                }
                j++;

                }
                if((p)==sl){
                return 3;
                }


                return 4;
            }
    



public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter string : ");

	
    System.out.println(isSubsequence(sc.nextLine(),sc.nextLine()));
}
}

//yet to be completed