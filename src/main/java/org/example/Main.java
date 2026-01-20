package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Palindrom Testleri----");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("----Mükemmel Sayı Testleri----");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("----Sayıları kelimeler dök Testleri----");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = Math.abs(number);

        int reversedNumber = 0;
        int temp = originalNumber;

        while (temp > 0) {

            int lastDigit = temp % 10;

            reversedNumber = (reversedNumber * 10) + lastDigit;

            temp = temp / 10;
        }

        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

       public static String numberToWords(int number) {
         if(number<0) {
             return "Invalid Value";
         }
         String[] w = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
           String s = "" + number;
           String r = "";

           for (int i = 0; i < s.length(); i++)
               r += w[s.charAt(i) - '0'] + " ";

           return r.trim();
       }

       }


