import java.util.Scanner;

class TestAlpha {
    public static int isIsomorphic(String s, String t) {
        int a=11;
        int b=22;
        int c=33;
        int d=44;
        int l= s.length();
        if (s.length()==1 && s.charAt(0) == t.charAt(0)) {              //for single digit value
            return 1;

            
        }
   for (int i = 0; i < l; i++) {
    for (int j = i + 1; j < l; j++) {
        if (s.charAt(i) == s.charAt(j) ){                              //checks repetition and saves them on a and b
            a=i;
            b=j;
        }
        if (t.charAt(i) == t.charAt(j)) {
            c=i;
            d=j;                                                       //checks repetition and save them on c and d
        
    }
    if(a==11 && c!=33){
        return 01;
        
    }
    if(a!=11 && c==33){
        return 02;
    }
    }

}
if (a==c && b==d) {
           for (int i = 0; i < l; i++) {
    for (int j = i + 1; j < l; j++) {
        if (s.charAt(i) == s.charAt(j) ){                               // it checks if the repeated strings are on same indexes
            a=i;
            b=j;
        }
        if (t.charAt(i) == t.charAt(j)) {
            c=i;
            d=j;
        
    }
        
    }
        if (a!=c && b!=d){                                              //it tells if both char are not on same indexes
            return 2;
        }
        if (i==l-1){                                                    //it tells that the loop has completed
            return 3;
        }
} 
     }
    


  // for (int i = 0; i < l; i++) {
  //       if (t.charAt(i) != s.charAt(i)&& i == l) {              //it checks if all of the char are different in both strings
  //               return 4;
  //   }
    
     // if(i==l-1)
     // {return 5;
     // }
// }
    for (int i = 0; i < l; i++) {
    for (int j = i + 1; j < l; j++) {                            //
        if (s.charAt(i) != s.charAt(j) && s.length() == t.length() )
        {
            return 35;                                             //it checks if all of the char are different in both strings
        }
    }
}



     
     return 6;
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter string : ");
	
    System.out.println(isIsomorphic(sc.nextLine(),sc.nextLine()));
}
}
