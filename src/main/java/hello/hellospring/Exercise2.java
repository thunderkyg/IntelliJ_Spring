package hello.hellospring;

public class Exercise2 {

    //Programmers 10진수 N진수 변화
    public int solution(int n) {
        int answer;
        //10진법 -> 2진법
        String decimalNumber2 = Integer.toString(n, 2);
        String decimalToBinary2 = Integer.toBinaryString(n);
        //10진법 -> 3진법
        String decimalNumber3 = Integer.toString(n, 3);
        //10진법 -> 4진법
        String decimalNumber4 = Integer.toString(n, 4);
        //10진법 -> 5진법
        String decimalNumber5 = Integer.toString(n, 5);
        //10진법 -> 6진법
        String decimalNumber6 = Integer.toString(n, 6);
        //10진법 -> 7진법
        String decimalNumber7 = Integer.toString(n, 7);
        //10진법 -> 8진법
        String decimalNumber8 = Integer.toString(n, 8);
        String decimalToOctal2 = Integer.toOctalString(n);
        //10진법 -> 9진법
        String decimalNumber9 = Integer.toString(n, 9);

        //10진법 -> 16진법
        String decimalNumber16 = Integer.toString(n, 16);
        String decimalToHex2 = Integer.toHexString(n);

        answer = Integer.parseInt(decimalToBinary2);
        return answer;
    }

}
