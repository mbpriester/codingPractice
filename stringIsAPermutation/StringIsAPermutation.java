import java.util.Arrays;

class StringIsAPermutation {
  public static void main(String[] args) {
    System.out.println("Test 1:");
    System.out.println("String 1: fresh String 2: refsh");
    System.out.println(isStringAPermutation("fresh", "refsh"));
    System.out.println("Test 2:");
    System.out.println("String 1: freshy String 2: refsh");
    System.out.println(isStringAPermutation("freshy", "refsh"));
  }

  static Boolean isStringAPermutation(String original, String testString){
    String[] originalStringArray = original.split("");
    String[] testStringArray = testString.split("");
    Arrays.sort(originalStringArray);
    Arrays.sort(testStringArray);

    return Arrays.equals(originalStringArray, testStringArray);
  }
}
