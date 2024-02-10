package excercise;

public class Exercise {

    //Programmers Starter 123 = 1+2+3 = 6
    public int solution(int n) {
        int answer = 0;
        int tempNo = 0;
        String number = String.valueOf(n);
        char[] numberString = number.toCharArray();

        for (char c : numberString) {
            tempNo = Character.getNumericValue(c);
            answer = answer + tempNo;
        }
        return answer;
    }

    public int solutionnum(int n) {
        int answer = 0;
        String test = conversion(n, 3);

        String reverse = "";
        for (int i = test.length() - 1; i >= 0; i--) {
            reverse = reverse + test.charAt(i);
        }

        int test1 = converse_ten(reverse, 3);
        return test1;
    }

    public static String conversion(int number, int N) {
        StringBuilder sb = new StringBuilder();
        int current = number;

        while (current > 0) {
            if (current % N < 10) {
                sb.append(current % N);
            } else {
                sb.append((char) (current % N - 10 + 'A'));
            }
            current /= N;
        }
        return sb.reverse().toString();
    }

    public int converse_ten(String number, int N) {
        char[] nums = number.toCharArray();
        int ans = 0;

        for (char num : nums) {
            if (num >= 'A') {
                ans = ans * N + (num - 'A' + 10);
            } else {
                ans = ans * N + (num - '0');
            }
        }
        System.out.println(ans);
        return ans;
    }


}
