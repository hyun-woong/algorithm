import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] condition = br.readLine().split(" ");
      int n = converterInt(condition[0]);
      int m = converterInt(condition[1]);

      String[] cardNums = br.readLine().split(" ");
      int find = 0;
      for (int i = 0; i < n -2; i++) {
        int num = converterInt(cardNums[i]);

        for (int j = i+1; j < n -1; j++) {
          int secNum = converterInt(cardNums[j]);

          for (int k = j +1; k < n; k++) {
            int lastNum = converterInt(cardNums[k]);
            int sum = num + secNum + lastNum;

            if (sum <= m && sum > find) find = sum;
            if (find == m) break;
          }

          if (find == m) break;
        }
        if (find == m) break;
      }
      System.out.print(find);
    }

  public static int converterInt(String str) {
    return Integer.parseInt(str);
  }
}