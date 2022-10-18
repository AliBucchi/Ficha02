public class Exercicio1 {

    public static void main(String[] args) {
        int i;
        int n = 5;
        int media = 0;

        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 8;
        nums[2] = 7;
        nums[3] = 3;
        nums[4] = 1;

        for( i = 0; i < nums.length; i++)
            media += nums[i];

        float total = (float)media / nums.length;

        System.out.println("A média dos valores: " + total);

    }
}

