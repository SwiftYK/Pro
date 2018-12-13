package com.mobile.Example;

/**
 * Hello world!
 *
 */
public class App 
{
	static int BITSPERWORD = 32;
	static int SHIFT = 5;
	static int MASK= 0x1F;
	static int N = 10000000;
	static int a[] = new int[1 + N / BITSPERWORD];
    public static void main( String[] args )
    {
    	
    	System.out.println("-------------");
	    int i;
	    for (i = 0; i < 10; i++) {
	    	//System.out.println("-----"+i+"--------");
	        clr(i);
	        //System.out.println("-------------");
	    }
	    for (i = 0; i < 10; i++) {
	    	System.out.println("-----"+i+"--------");
	        set(i);
	        System.out.println("-------------");
	    }
    }
    	 
    static void set(int i) { 
    		a[i >> SHIFT] |= (1 << (i & MASK)); 
    		System.out.println(i >> SHIFT);
    		System.out.println(i & MASK);
    		System.out.println(1 << (i & MASK));
    		System.out.println(a[i >> SHIFT]);
    		
    	}
    	 
    static void clr(int i) {
    		a[i >> SHIFT] &= ~(1 << (i & MASK)); 
//    		System.out.println(i >> SHIFT);
//    		System.out.println(i & MASK);
//    		System.out.println(1 << (i & MASK));
//    		System.out.println(a[i >> SHIFT]);
    	}
    	 
    static	int test(int i) { 
    		return a[i >> SHIFT] & (1 << (i & MASK)); 
    	}
    	 
    	int main() {
    		System.out.println("-------------");
    	    int i;
    	    for (i = 0; i < N; i++)
    	        clr(i);
//    	    for (i = 0; i < N; i++)
////    	        if (test(i))
////    	            printf("%d\n", i);
    	    
    	    /* Replace above 2 lines with below 3 for word-parallel init
    	    int top = 1 + N/BITSPERWORD;
    	    for (i = 0; i < top; i++)
    	    a[i] = 0;
    	    */
//    	    while (scanf("%d", &i) != EOF)
//    	        set(i);
//    	    for (i = 0; i < N; i++)
//    	        if (test(i))
//    	            printf("%d\n", i);
    	    return 0;
    }
}
