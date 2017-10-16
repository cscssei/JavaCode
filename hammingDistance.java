public class hammingDistance {
    public static void main(String[] args) {
        int x = 1, y = 4;
        // convert x into binary string
        String xStr = Integer.toBinaryString(x);
        // convert string to array
        int[] xArray = new int[xStr.length()];
        for (int i = 0; i < xStr.length(); i++){
            xArray[i] = Character.digit(xStr.charAt(i), 10);
        }

        String yStr = Integer.toBinaryString(y);
        int[] yArray = new int[yStr.length()];
        for (int i = 0; i < yStr.length(); i++){
            yArray[i] = Character.digit(yStr.charAt(i), 10);
        }

        int count = 0;
        int i = xArray.length-1, j = yArray.length-1;
        for (; i> -1 && j > -1; i--, j--){
            if (xArray[i] != yArray[j]){
                count++;
            }
        }
        while (i > -1){
            if (xArray[i]==1) {
                count++;
            }
            i--;
        }
        while(j > -1){
            if (yArray[j]==1){
                count++;
            }
            j--;
        }
        System.out.print(count);
    }
}
