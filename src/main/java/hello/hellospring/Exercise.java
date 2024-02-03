package hello.hellospring;

public class Exercise{
    public int solution(int n) {
        int answer = 0;
        int tempNo = 0;
        String number = String.valueOf(n);
        char[] numberString = number.toCharArray();

        for (int i = 0; i < numberString.length; i++) {
            tempNo = Character.getNumericValue(numberString[i]);
            answer = answer + tempNo;
        }
        return answer;
    }
}
