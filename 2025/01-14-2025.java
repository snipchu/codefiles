import java.math.*;

public class fibon {
  private static BigInteger[] nums;
  public static BigInteger fib(int x) {
    nums = new BigInteger[x+1];
    nums[0] = BigInteger.ZERO; nums[1] = BigInteger.ONE; nums[2]=BigInteger.ONE;
    return fibrun(BigInteger.valueOf(x));
  }
  private static BigInteger fibrun(BigInteger x) {
    if (nums[x.intValue()] == null)
      nums[x.intValue()] = fibrun(x.subtract(BigInteger.ONE)).add(fibrun(x.subtract(BigInteger.valueOf(2))));
    return nums[x.intValue()];
  }
  public static void main(String[] args) {
    int startTime = (int) System.currentTimeMillis();
    System.out.println(fib(10));
    int endTime = (int) System.currentTimeMillis();
    System.out.println("Time elapsed: "+((endTime-startTime)/1000.00)+" seconds");
  }
}
