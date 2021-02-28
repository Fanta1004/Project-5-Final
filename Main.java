import java.util.Scanner;
class Main {
  public static void main(String[] args) {


  Scanner scan = new Scanner(System.in);
  System.out.println("Hello and welcome to the Jareds Cinema. What is your name?");
  String name = scan.next();

  System.out.println("Welcome to the cinema " + name + " please answer the questions down below.");

  System.out.println("The movies playing are 1 or 2, which one are you watching?");
  int answer = scan.nextInt();
 
 System.out.println("We will now check the reviews on the movie you chose.");

 System.out.println("The review of the movie you chose is " + movieReview(answer) + "% positive.");
  }

static int movieReview(int review){
    if (review <= 75) { 
      return 75;
    }else{
      int other = 5; 
      return 1 + movieReview(review / other); 
    }
  }
}
