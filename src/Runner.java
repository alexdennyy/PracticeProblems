import java.util.ArrayList;

public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {
        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(makes10(3,6));
        System.out.println(makes10(5,5));
        System.out.println(makes10(10,15));
        System.out.println(firstHalf("tester"));
        System.out.println(firstHalf("test"));
        System.out.println(firstHalf("sadder"));
        System.out.println(countHi("highhi"));
        System.out.println(doubleX("tyxxcc"));
        System.out.println(loneSum(3, 4, 4));
        System.out.println(withoutString("green", "e"));
        System.out.println(withoutString("gray", "t"));

    }

    //your codingbat method here - must match
    // the method name from codingbat
    public static String helloName(String name) {
        return "hi " + name;
    }

    public static boolean makes10(int a, int b) {
        if(a ==  10){
            return true;
        }
        if(b ==  10){
            return true;
        }
        if(a + b == 10){
            return true;
        } else{
            return false;
        }
    }
    public static String firstHalf(String str) {
        int length = str.length();
        length = length / 2;
        String newString = str.substring(0, length);
        return(newString);
    }
    public static int redTicket(int a, int b, int c) {
        if(a == b){
            if(b == c){
                if(a == 2){
                    return 10;
                } else {
                    return 5;
                }
            }
        }
        if(a == b || a == c){
            return 0;
        } else{
            return 1;
        }

    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] newArray = {a[0], a[1], b[0], b[1]};
        return newArray;
    }

    public static int countHi(String str) {
        int hiCount = 0;
        for(int i = 0; i < str.length() - 1; i++){
            String subStr = str.substring(i, i + 2);
            if(i + 2 > str.length()){
                return hiCount;
            }
            if(subStr.equals("hi")){
                hiCount++;
                System.out.println(hiCount);

            }


        }
        return hiCount;
    }
    public static int countEvens(int[] nums) {
        int evenCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
    public static boolean doubleX(String str) {
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i+1).equals("x")){
                if(str.substring(i+1,i+2).equals("x")){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public static int loneSum(int a, int b, int c) {
           if(a == b){
                if(a == c){
                    return 0;
                } else {
                    return c;
                }
            }
            if(b == c){
                return a;
            }
        if(c == a){
            if (c == b) {
                return 0;
            } else{
                return b;
            }
            }
        return a + b + c;
        }


//ITS NOT POSSIBLE TO MEET THEIR STANDARDS ABOUT CASE SENSITIVITY
    public static String withoutString(String base, String remove) {
        remove = remove.toLowerCase();
        if(base.contains(remove)){
            base = base.replace(remove, "");
            return base;
        } else {
            return base;
        }
    }

    }

