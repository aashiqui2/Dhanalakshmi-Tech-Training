``` java
public class Demo {
    public static void main(String[] args) {
        String s = "aabbii";
        String vowels = "aeiou";
        char[] consonantSequence = "bcdfghjklmnpqrstvwxyz".toCharArray();
        System.out.println(consonantSequence.length);
        int consonantIndex = 0;
        char[] result = s.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (vowels.contains(String.valueOf(result[i]))) {
                result[i] = consonantSequence[consonantIndex % consonantSequence.length];
                consonantIndex++;
            }
        }
        System.out.println(new String(result));
    }
}```

```java 
public class Demo {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isrepeted = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isrepeted = true;
                    break;
                }
            }

            if (!isrepeted) {
                boolean repeatedLater = false;
                for (int k = i + 1; k < a.length; k++) {
                    if (a[i] == a[k]) {
                        repeatedLater = true;
                        break;
                    }
                }
                if (!repeatedLater) {
                    sum += a[i];
                }
            }

        }
        System.out.println(sum);
    }
}```