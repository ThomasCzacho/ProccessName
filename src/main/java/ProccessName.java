import java.util.Scanner;


class ProcessName {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); //.useDelimiter(" ");
        int spaceIdx;
        String firstName;
        String lastName;

        System.out.print("Enter your name: ");

        String name = console.nextLine();
        //System.out.print(name.indexOf("a"));

        spaceIdx = name.indexOf(" ");
        //System.out.print(spaceIdx);
        //System.out.println("code breaks after this point");
        firstName = name.substring(0,spaceIdx);


        lastName = name.substring(spaceIdx, name.length());


        System.out.println("Your Name: "+firstName+" "+lastName);

        String initial = name.substring(0, 1);

        System.out.println("Your Name is : "+lastName+", "+initial+". ");
        // your code goes here
console.close();
    }
}