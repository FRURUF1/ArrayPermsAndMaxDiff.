import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {

    //integer tipinde listemizi tutariz
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        permuteHelper(nums, new ArrayList<>(), perms);
        return perms;
    }

    //permuteHelper ile dizinin tum olasi permutasyonlarini olustururuz
    private static void permuteHelper(int[] nums, List<Integer> currentPermutation, List<List<Integer>> permutations) {
        if (currentPermutation.size() == nums.length) {
            permutations.add(new ArrayList<>(currentPermutation));
        } else {
            for (int num : nums) {
                if (currentPermutation.contains(num)) {
                    continue;
                }
                currentPermutation.add(num);
                permuteHelper(nums, currentPermutation, permutations);
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }
//scanner ile dizi icin input aliyoruz
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi uzunlugunu giriniz: ");

        // nextInt() metodu ile tam sayi turunde deger okumasi yapilir.

        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Dizi elemanlarini giriniz: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        List<List<Integer>> perms = permute(nums);
        System.out.println("Tum permutasyonlar: " + perms);
    }
}
