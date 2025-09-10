public class labWork2 {

    public static void main(String[] args) {
        Task1.run();
        Task2.run();
        Task3.run();
        Task4.run();
        Task5.run();
        Task6.run();
        Task7.run();
        Task8.run();
        Task9.run();
        Task10.run();
        Task11.run();
        Task12.run();
        Task13.run();
        Task14.run();
        Task15.run();
        Task16.run();
        Task17.run();
        Task18.run();
        Task19.run();
        Task20.run();
    }

    static class Task1 {
        static void run() {
            String sentence = "Java is great and Java is powerful";
            sentence = sentence.toLowerCase();
            String[] words = sentence.split(" ");
            System.out.print("task1 output: ");
            for (int i = 0; i < words.length; i++) {
                boolean unique = true;
                for (int j = 0; j < words.length; j++) {
                    if (i != j && words[i].equals(words[j])) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    System.out.print(words[i] + " ");
                }
            }
            System.out.println("\n");
        }
    }

    static class Task2 {
        static void run() {
            String sentence1 = "Java is great, Java is powerful";
            String[] words1 = sentence1.split(" ");
            String longest = "";
            for (String word : words1) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
            System.out.print("task2 output: " + longest);
            System.out.println("\n");
        }
    }

    static class Task3 {
        static void run() {
            String sentence2 = "Hello World";
            sentence2 = sentence2.toLowerCase();
            int vowels = 0, consonants = 0;
            for (int i = 0; i < sentence2.length(); i++) {
                char ch = sentence2.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    if ("aeiou".indexOf(ch) != -1) vowels++;
                    else consonants++;
                }
            }
            System.out.print("task3 output: Vowels: " + vowels + ", Consonants: " + consonants);
            System.out.println("\n");
        }
    }

    static class Task4 {
        static void run() {
            String word = "level";
            word = word.replaceAll("\\s+", "").toLowerCase();
            int i = 0, j = word.length() - 1;
            boolean isPalindrome = true;
            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }
            System.out.print("task4 output: " + isPalindrome);
            System.out.println("\n");
        }
    }

    static class Task5 {
        static void run() {
            String text = "hello world";
            String pattern = "world";
            int index = -1;
            for (int q = 0; q <= text.length() - pattern.length(); q++) {
                int w = 0;
                while (w < pattern.length() && text.charAt(q + w) == pattern.charAt(w)) {
                    w++;
                }
                if (w == pattern.length()) {
                    index = q;
                    break;
                }
            }
            System.out.print("task5 output: " + index);
            System.out.println("\n");
        }
    }

    static class Task6 {
        static void run() {
            int[] arr = {5, 3, 8, 1, 2};
            for (int k = 0; k < arr.length - 1; k++) {
                for (int h = 0; h < arr.length - 1 - k; h++) {
                    if (arr[h] > arr[h + 1]) {
                        int tmp = arr[h];
                        arr[h] = arr[h + 1];
                        arr[h + 1] = tmp;
                    }
                }
            }
            System.out.print("task6 output: ");
            for (int x : arr) System.out.print(x + " ");
            System.out.println("\n");
        }
    }

    static class Task7 {
        static void run() {
            String s = "a12bc34d5";
            int sum = 0, num = 0;
            for (int e = 0; e < s.length(); e++) {
                char ch = s.charAt(e);
                if (ch >= '0' && ch <= '9') {
                    num = num * 10 + (ch - '0');
                } else {
                    sum += num;
                    num = 0;
                }
            }
            sum += num;
            System.out.print("task7 output: " + sum);
            System.out.println("\n");
        }
    }

    static class Task8 {
        static void run() {
            int[] array = {1, 2, 3, 2, 4, 5, 1};
            System.out.print("task8 output: ");
            for (int r = 0; r < array.length; r++) {
                boolean printed = false;
                for (int t = r + 1; t < array.length; t++) {
                    if (array[r] == array[t]) {
                        if (!printed) {
                            System.out.print(array[r] + " ");
                            printed = true;
                        }
                    }
                }
            }
            System.out.println("\n");
        }
    }

    static class Task9 {
        static void run() {
            String s1 = "listen";
            String s2 = "silent";
            int[] count = new int[26];
            for (int y = 0; y < s1.length(); y++) {
                count[s1.charAt(y) - 'a']++;
                count[s2.charAt(y) - 'a']--;
            }
            boolean isAnagram = true;
            for (int c : count) {
                if (c != 0) {
                    isAnagram = false;
                    break;
                }
            }
            System.out.print("task9 output: " + isAnagram);
            System.out.println("\n");
        }
    }

    static class Task10 {
        static void run() {
            String a = " a b\tc\n";
            StringBuilder result = new StringBuilder();
            for (int d = 0; d < a.length(); d++) {
                if (!Character.isWhitespace(a.charAt(d))) {
                    result.append(a.charAt(d));
                }
            }
            System.out.print("task10 output: " + result);
            System.out.println("\n");
        }
    }

    static class Task11 {
        static void run() {
            String str11 = "abracadabra";
            char[] chars11 = str11.toCharArray();
            boolean[] counted = new boolean[chars11.length];
            System.out.print("task11 output: ");
            for (int u = 0; u < chars11.length; u++) {
                if (!counted[u]) {
                    int counting = 1;
                    for (int j0 = u + 1; j0 < chars11.length; j0++) {
                        if (chars11[u] == chars11[j0]) {
                            counting++;
                            counted[j0] = true;
                        }
                    }
                    System.out.print(chars11[u] + ": " + counting + ", ");
                }
            }
            System.out.println("\n");
        }
    }

    static class Task12 {
        static void run() {
            int n12 = 10;
            if (n12 <= 0) {
                System.out.println("task12 output: There are no numbers to output");
                System.out.println(" ");
            } else {
                int[] fib = new int[n12];
                fib[0] = 0;
                if (n12 > 1) fib[1] = 1;
                for (int we = 2; we < n12; we++) {
                    fib[we] = fib[we - 1] + fib[we - 2];
                }
                System.out.print("task12 output: ");
                for (int re = 0; re < n12; re++) {
                    System.out.print(fib[re] + " ");
                }
                System.out.println("\n");
            }
        }
    }

    static class Task13 {
        static void run() {
            int n13 = 50;
            System.out.print("task13 output: ");
            for (int p = 2; p <= n13; p++) {
                boolean prime = true;
                for (int f = 2; f * f <= p; f++) {
                    if (p % f == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) System.out.print(p + " ");
            }
            System.out.println("\n");
        }
    }

    static class Task14 {
        static void run() {
            int[] arr14 = {5, 2, 7, 3, 9, 4};
            int sum14 = 0;
            for (int g = 0; g < arr14.length; g += 2) {
                sum14 += arr14[g];
            }
            System.out.println("task14 output: " + sum14);
            System.out.println(" ");
        }
    }

    static class Task15 {
        static void run() {
            int[] arr15 = {4, 7, 1, 9, 3};
            int minIdx = 0, maxIdx = 0;
            for (int h = 1; h < arr15.length; h++) {
                if (arr15[h] < arr15[minIdx]) minIdx = h;
                if (arr15[h] > arr15[maxIdx]) maxIdx = h;
            }
            int temp = arr15[minIdx];
            arr15[minIdx] = arr15[maxIdx];
            arr15[maxIdx] = temp;
            System.out.print("task15 output: ");
            for (int k : arr15) System.out.print(k + " ");
            System.out.println("\n");
        }
    }

    static class Task16 {
        static void run() {
            String str16 = "hello";
            char[] chars16 = str16.toCharArray();
            int l = 0, r = chars16.length - 1;
            while (l < r) {
                char t = chars16[l];
                chars16[l] = chars16[r];
                chars16[r] = t;
                l++;
                r--;
            }
            System.out.println("task16 output: " + new String(chars16));
            System.out.println(" ");
        }
    }

    static class Task17 {
        static void run() {
            int[] arr17 = {4, 2, 4, 5, 2, 3, 1};
            int[] res17 = new int[arr17.length];
            int size17 = 0;
            for (int z = 0; z < arr17.length; z++) {
                boolean exists = false;
                for (int x = 0; x < size17; x++) {
                    if (res17[x] == arr17[z]) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) res17[size17++] = arr17[z];
            }
            System.out.print("task17 output: ");
            for (int v = 0; v < size17; v++) System.out.print(res17[v] + " ");
            System.out.println("\n");
        }
    }

    static class Task18 {
        static void run() {
            int[] arr18 = {7, 2, 10, 4, 8};
            int max18 = Integer.MIN_VALUE, second18 = Integer.MIN_VALUE;
            for (int b = 0; b < arr18.length; b++) {
                if (arr18[b] > max18) {
                    second18 = max18;
                    max18 = arr18[b];
                } else if (arr18[b] > second18 && arr18[b] != max18) {
                    second18 = arr18[b];
                }
            }
            System.out.println("task18 output: " + second18);
            System.out.println(" ");
        }
    }

    static class Task19 {
        static void run() {
            int[] arr19a = {1, 3, 5, 7};
            int[] arr19b = {3, 5, 6, 7, 8};
            int[] merged = new int[arr19a.length + arr19b.length];
            int size19 = 0;
            for (int n = 0; n < arr19a.length; n++) {
                boolean exists = false;
                for (int m = 0; m < size19; m++) {
                    if (merged[m] == arr19a[n]) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) merged[size19++] = arr19a[n];
            }
            for (int vb = 0; vb < arr19b.length; vb++) {
                boolean exists = false;
                for (int vr = 0; vr < size19; vr++) {
                    if (merged[vr] == arr19b[vb]) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) merged[size19++] = arr19b[vb];
            }
            System.out.print("task19 output: ");
            for (int va = 0; va < size19; va++) System.out.print(merged[va] + " ");
            System.out.println("\n");
        }
    }

    static class Task20 {
        static void run() {
            String str20 = "apple,banana,orange";
            char delimiter = ',';
            String[] parts = new String[10];
            int size20 = 0;
            StringBuilder current = new StringBuilder();
            for (int vi = 0; vi < str20.length(); vi++) {
                char c = str20.charAt(vi);
                if (c == delimiter) {
                    parts[size20++] = current.toString();
                    current = new StringBuilder();
                } else {
                    current.append(c);
                }
            }
            parts[size20++] = current.toString();
            System.out.print("task20 output: ");
            for (int ve = 0; ve < size20; ve++) System.out.print(parts[ve] + " ");
            System.out.println("\n");
        }
    }
}
