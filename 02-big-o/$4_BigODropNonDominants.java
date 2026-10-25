public class $4_BigODropNonDominants {
    public static void main(String[] args) {
        printItems(10);
    }

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        for(int k=0;k<n;k++){
            System.out.println(k);
        }
    }
}


// O(n^2)+O(n)
// so we drop non dominants
// O(n^2)