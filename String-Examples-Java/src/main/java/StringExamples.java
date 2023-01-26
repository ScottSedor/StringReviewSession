public class StringExamples {
    public static void main(String[] args) {

        System.out.println("#1");
// #1
// Print each number in a string separated by a comma and space.  (FOR LOOP), (STRING LENGTH), (CONCATINATION)

        String myString = "13456789";

        for(int i = 0; i < myString.length(); i++){

            if(i == myString.length()-1){
                System.out.print(myString.charAt(i));
            }
            else {
                System.out.print(myString.charAt(i) + ", ");
            }
        }


//--------------------------------------------------------------------------------------------------------------------------------\\

        System.out.println();
        System.out.println();
        System.out.println("#1A");


// #1A
// Print each number in a string separated by a comma and space.  (FOR EACH LOOP), (SPLIT METHOD)

        String tenThroughTwenty = "10 11 12 13 14 15 16 17 18 19 20";

        String[] myArray = tenThroughTwenty.split(" ");

        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + ", ");
        }




//--------------------------------------------------------------------------------------------------------------------------------\\

        System.out.println();
        System.out.println();
        System.out.println("#2");

// #2
// Does this letter appear more than once in this string? (INDEX OF METHOD), (LAST INDEX OF METHOD)

        String name = "Ada Lovelace";

        int first = name.indexOf('d');
        int last = name.lastIndexOf('d');

        if (first != last) {
            System.out.print("\"d\" appears more than once.");
        } else {
            System.out.print("\"d\" does not appear more than once.");
        }


//--------------------------------------------------------------------------------------------------------------------------------\\

        System.out.println();
        System.out.println();
        System.out.println("#2A");

//#2A
//If the string name contains the letter "c" print "This string contains "c". " (CONTAINS METHOD) (IF STATEMENT)

        if(name.contains("c")){
            System.out.println("This string contains \"c\". ");
        } else {
            System.out.println("This string does not contain \"c\". ");
        }

//--------------------------------------------------------------------------------------------------------------------------------\\

        System.out.println();
        System.out.println();
        System.out.println("#3");

// #3
// Print the first 3 letters of a string 3 times IN UPPERCASE. (SUBTRING METHOD) (TO CASE METHOD)

        String threeTimes = "Boom!";

        System.out.println(threeTimes.substring(0, 3).toUpperCase() + threeTimes.substring(0, 3).toUpperCase() + threeTimes.substring(0, 3).toUpperCase());


//--------------------------------------------------------------------------------------------------------------------------------\\

        System.out.println();
        System.out.println();
        System.out.println("#4");

//#4
//Assign a value to each word in the sentence. (SPLIT METHOD)

        String sentence = "So you want to know what .split does?";

        String[] wordsArray = sentence.split(" ");

        for(int i = 0; i < wordsArray.length; i++){
            System.out.print(wordsArray[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for(int i = 0; i < wordsArray.length; i++){
            System.out.print(wordsArray[i] + " ");
        }


//--------------------------------------------------------------------------------------------------------------------------------\\



    }
}
