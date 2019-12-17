import java.util.Array;

class Main {
  public static void main(String[] args) {
    System.out.println("Test 1:");
    System.out.println("String 1: fresh String 2: refsh");
    System.out.println(isStringAPermutation("fresh", "refsh"));
  }

  static Boolean isStringAPermutation(String original, String testString){
    String[] sortedOriginal = Arrays.sort(original.split(""));
    String[] sortedTestString = Arrays.sort(original.split(""));

    return Arrays.equal(sortedOriginal, sortedTestSTrin;
  }
}