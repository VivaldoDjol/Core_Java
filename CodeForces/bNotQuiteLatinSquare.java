import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tests = sc.nextInt();
//        sc.nextLine();
//
//        while (tests-- > 0) {
//            String[] grid = new String[3];
//            for (int i = 0; i < 3; i++) {
//                grid[i] = sc.nextLine();
//            }
//
//            for (int col = 0; col < 3; col++) {
//                boolean hasA = false, hasB = false, hasC = false;
//                int questionRow = -1;
//
//                for (int row = 0; row < 3; row++) {
//                    char ch = grid[row].charAt(col);
//                    if (ch == '?') {
//                        questionRow = row;
//                    } else if (ch == 'A') {
//                        hasA = true;
//                    } else if (ch == 'B') {
//                        hasB = true;
//                    } else if (ch == 'C') {
//                        hasC = true;
//                    }
//                }
//
//                if (questionRow != -1) {
//                    if (!hasA) System.out.println("A");
//                    else if (!hasB) System.out.println("B");
//                    else if (!hasC) System.out.println("C");
//                }
//            }
//        }
//        sc.close();
//    }
//}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String[] grid = new String[3];
            for (int i = 0; i < 3; i++) {
                grid[i] = sc.nextLine();
            }

            for (int col = 0; col < 3; col++) {
                Set<Character> all = new HashSet<>(Arrays.asList('A','B','C'));
                Set<Character> seen = new HashSet<>();
                boolean hasQuestion = false;

                for (int row = 0; row < 3; row++) {
                    char ch = grid[col].charAt(row);
                    if (ch == '?') {
                        hasQuestion = true;
                    } else {
                        seen.add(ch);
                    }
                }

                if (hasQuestion) {
                    all.stream()
                            .filter(ch -> !seen.contains(ch))
                            .forEach(System.out::println);
                }
            }
        }
        sc.close();
    }
}
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//
//        while (t-- > 0) {
//            String[] grid = new String[3];
//            for (int i = 0; i < 3; i++) {
//                grid[i] = sc.nextLine();
//            }
//
//            for (int col = 0; col < 3; col++) {
//                Set<Character> letters = new HashSet<>(Arrays.asList('A','B','C'));
//                for (int row = 0; row < 3; row++) {
//                    char ch = grid[row].charAt(col);
//                    if (ch != '?') {
//                        letters.remove(ch);
//                    }
//                }
//                if (letters.size() == 1) {
//                    System.out.println(letters.iterator().next());
//                }
//            }
//        }
//        sc.close();
//    }
//}
//
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//
//        while (t-- > 0) {
//            String[] grid = new String[3];
//            for (int i = 0; i < 3; i++) {
//                grid[i] = sc.nextLine();
//            }
//
//            for (int col = 0; col < 3; col++) {
//                int sum = 'A' + 'B' + 'C'; // 198
//                for (int row = 0; row < 3; row++) {
//                    char ch = grid[row].charAt(col);
//                    if (ch != '?') {
//                        sum -= ch;
//                    }
//                }
//                if (sum != ('A' + 'B' + 'C')) {
//                    System.out.println((char) sum);
//                }
//            }
//        }
//        sc.close();
//    }
//}
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//
//        while (t-- > 0) {
//            String[] grid = new String[3];
//            for (int i = 0; i < 3; i++) {
//                grid[i] = sc.nextLine();
//            }
//
//            for (int col = 0; col < 3; col++) {
//                int[] freq = new int[3]; // A=0, B=1, C=2
//                boolean hasQuestion = false;
//
//                for (int row = 0; row < 3; row++) {
//                    char ch = grid[row].charAt(col);
//                    if (ch == '?') {
//                        hasQuestion = true;
//                    } else {
//                        freq[ch - 'A']++;
//                    }
//                }
//
//                if (hasQuestion) {
//                    for (int i = 0; i < 3; i++) {
//                        if (freq[i] == 0) {
//                            System.out.println((char)('A' + i));
//                        }
//                    }
//                }
//            }
//        }
//        sc.close();
//    }
//}
