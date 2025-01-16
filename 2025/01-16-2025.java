public class coins1 {
  public static void main(String[] args) {
    int[] amtcoins = {1,5,10,25,100};
    int[] coins = new int[101];

    for (int i=0; i<coins.length; i++) {
      int amt=0;
      for (int j=amtcoins.length-1; j>=0; j--) {
        if (amt==i) {break;}
        coins[i] += (i-amt)/amtcoins[j];
        amt += ((i-amt)/amtcoins[j])*amtcoins[j];
      }
      System.out.println(i+" is "+coins[i]+" coins");
    }
  }
}
