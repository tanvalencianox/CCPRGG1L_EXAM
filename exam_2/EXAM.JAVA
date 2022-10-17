import java.util.Scanner;

public class Exam {

    private static final String BSCS = null;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("1. Last six digits: ");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        System.out.println("Student Number:"+studentNumber);
        System.out.print(String.valueOf(studentNumber).substring(4));
        // ==============================================================================

        // 2. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("2. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        if ( lastTwoDigits % 28 == 0 )

        System.out.println(lastTwoDigits+" is an even number.");

        else

        System.out.println(lastTwoDigits+" is an odd number.");

        // ==============================================================================

        // 3. Create a method that will return the total character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surname = scan.next();
        String name = "christine";  
       int firstNamelength = name.length(); 
       int surnamelength = surname.length();  
       System.out.println(firstNamelength + surnamelength + " total length of your Firstname and Surname"); 

       // ==============================================================================

        // 4. Create a method to that will return true if your firstname in BOTH
        // UPPERCASE and lowercase are EQUAL.
        // Otherwise, return false.
        System.out.println("4. Check your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNameInLowerCase = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameInUpperCase = scan.next();
        if (firstNameInLowerCase.toLowerCase().equals ("christine") && firstNameInUpperCase.toUpperCase().equals("CHRISTINE")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        // ==============================================================================

        // 5. Create a method that will return true if your name starts with
        // a vowel 'A','E','I','O','U'.
        // Otherwise, return false.
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);
        

        {

            char ch = 'i';
            if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u' )
                System.out.println(firstChar + " is vowel");
            else
                System.out.println(firstChar + " is consonant");

        }

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        if ( studentNumber == 2022109128){

                System.out.println ("valid");
            
             } else {
            
                System.out.println ("invalid");
            
            }
         
        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surname = scan.next();
            if(firstName == firstName. toUpperCase() && surname == surname. toLowerCase()){
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }

         // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");

        System.out.print("Enter your enrolled course (BSIT or BSCS): ");

        String course = scan.next();



        // If BSIT

        switch (course){

            case "BSIT":

            System.out.print("Enter your specialization (MWAA or MAA): ");

            String specialization1 = scan.next();

            System.out.println("Valid! You are in " + course  + " " + specialization1);

            break;



        // If BSCS

        case "BSCS":

        System.out.print("Enter your specialization (DF or ML): ");

        String specialization2 = scan.next();

        System.out.println("Valid! You are in " + course + " " + specialization2);

        break;



        }

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch(strand){

            case "STEM","ICT","ABM","HUMSS","HOME ECONOMICS","ARTS AND DESIGN","TVL MARITIME":

            System.out.println("valid");

            break;  

        }   System.out.println("invalid");

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains your
        // surname. (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        if(studentEmailAddress.contains("valenciano")) {
            System.out.println("valid");
        } else{
            System.out.println("invalid");
        }

        // Close scanner
        scan.close();


    }
}
