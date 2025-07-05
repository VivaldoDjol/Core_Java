import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nSoldiers = Integer.parseInt(br.readLine());
        int[] sHeight = new int[nSoldiers];
        String[] heightStrings = br.readLine().split(" ");

        int currMax = 0, currMin = 101;
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < nSoldiers; i++) {
            sHeight[i] = Integer.parseInt(heightStrings[i]);
            if(sHeight[i] > currMax){
                currMax = sHeight[i];
                maxIndex = i;
            }
            if (sHeight[i] <= currMin){
                currMin = sHeight[i];
                minIndex = i;
            }
        }

        int swaps = 0;

        while (maxIndex != 0) {
            int temp = sHeight[maxIndex];
            sHeight[maxIndex] = sHeight[maxIndex - 1];
            sHeight[maxIndex - 1] = temp;

            if (maxIndex - 1 == minIndex) {
                minIndex++;
            }

            maxIndex--;
            swaps++;
        }

        while (minIndex != nSoldiers - 1) {
            int temp = sHeight[minIndex];
            sHeight[minIndex] = sHeight[minIndex + 1];
            sHeight[minIndex + 1] = temp;

            minIndex++;
            swaps++;
        }
        System.out.println(swaps);
    }
}
