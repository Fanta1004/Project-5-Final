import java.util.Scanner;
class Main {
  public static void main(String[] args) {


  Scanner scan = new Scanner(System.in);
  System.out.println("Hello and welcome to the Jareds Cinema. What is your name?"); // this is a print staement telling me what their name is
  String name = scan.next();

  System.out.println("Welcome to the cinema " + name + " please answer the questions down below."); // this repeats their name and lets them know what to do with the rest of the survey 

  System.out.println("The movies playing are 1 or 2, which one are you watching?"); // this statement allows me to know what movie they will be watching to then search for its reviews 
  int answer = scan.nextInt();
 
 System.out.println("We will now check the reviews on the movie you chose."); 

 System.out.println("The review of the movie you chose is " + movieReview(answer) + "% positive."); // this shows the percentage of the movies positive rating 
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
