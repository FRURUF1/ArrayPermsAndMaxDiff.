import java.util.Scanner;
public class Maxfark {

    public static int maxFark(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        //farklar inceleniyor hangi fark en buyukse o maxFark olur
        int maxFark = 0;
        for (int i = 1; i < nums.length; i++) {
            int fark = nums[i] - nums[i - 1];
            if (fark > maxFark) {
                maxFark = fark;
            }
        }
        return maxFark;
    }

    //Scanner ile input aldim nextInt ile int tipinde tuttum
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi uzunlugunu giriniz: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Dizi elemanlarini giriniz: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int maxFark = maxFark(nums);
        System.out.println("Max fark: " + maxFark);
    }
}
