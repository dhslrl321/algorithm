package stage.stage07_String;

import java.util.Scanner;

public class Prob08_Dial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next().toUpperCase();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {

                case 65:
                case 66:
                case 67: {
                    sum += 3;
                    break;
                }

                case 68:
                case 69:
                case 70:{
                    sum += 4;
                    break;
                }

                case 71:
                case 72:
                case 73:{
                    sum += 5;
                    break;
                }

                case 74:
                case 75:
                case 76:{
                    sum += 6;
                    break;
                }

                case 77:
                case 78:
                case 79:{
                    sum += 7;
                    break;
                }

                case 80:
                case 81:
                case 82:
                case 83:{
                    sum += 8;
                    break;
                }

                case 84:
                case 85:
                case 86: {
                    sum += 9;
                    break;
                }

                case 87:
                case 88:
                case 89:
                case 90: {
                    sum += 10;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
