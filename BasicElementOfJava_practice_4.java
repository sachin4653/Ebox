/*String Methods


Write a program to implement the String methods like substring, charAt, equalsIgnoreCase, and contact.


[ Hint: The substring begins with the character at the 3rd index and extends to the end of the first string. ]
 

Input format:
 

The Input consists of two strings. String length should be greater than 5.

 

Output format:
 

The output consists of the result of all String methods.

 

Note: 

Refer to the sample input and output for specifications.

All text in bold corresponds to the input and the remaining corresponds to the output.

 

Sample Input and Output 1

Enter the first string : 
Amphisoft
Enter the second string : 
TECHNOLOGIES
Substring : hisoft
The character at 3rd position in the second string is : H
Are string 1 and string 2 equal? : false
Concatenated string : AmphisoftTECHNOLOGIES

Sample Input and Output 2

Enter the first string :
Programming
Enter the second string :
PROGRAMMING
Substring : gramming
The character at 3rd position in the second string is : G
Are string 1 and string 2 equal? : true
Concatenated string : ProgrammingPROGRAMMING

 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String a = sc.nextLine();
        System.out.println("Enter the second string : ");
        String b= sc.nextLine();
        if (a.length() > 5 && b.length() >5) {
            System.out.println("Substring : "+a.substring(3,a.length()));
            System.out.println("The character at 3rd position in the second string is : "+ b.charAt(3));
            System.out.println("Are string 1 and string 2 equal? : "+ a.equalsIgnoreCase(b));
            System.out.println("Concatenated string : "+ a.concat(b));
           
           

        }
        
    }
}
