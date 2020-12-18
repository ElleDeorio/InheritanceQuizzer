import java.util.Scanner;

public class Quizzer {

	public static void main(String[] args) {
	Scanner userInput= new Scanner (System.in);
	int points;
	points = 0;
	System.out.println("What will the following line print?");
	System.out.println (" Food x = new Food()");
	System.out.println (" x.choice();\n ");
	displayAnswers();
	String answer = userInput.nextLine();
		if (answer.equals("A"))
	{
		System.out.println("\nCorrect\n");
		points++;
	}
	else 
	{
		System.out.println("Incorrect");
	}
	
// Q2	
		System.out.println("What will the following line print?");
		System.out.println (" Food x = new Meat()");
		System.out.println (" x.choice(); ");
		displayAnswers();
		String answer2 = userInput.nextLine();
			if (answer2.equals("C"))
		{
			System.out.println("\nCorrect\n");
			points++;
		}
		else 
		{
		System.out.println("Incorrect");
		}
		
//Q3		
			System.out.println("What will the following line print?");
			System.out.println (" Food x = new Food()");
			System.out.println (" x.calories();\n ");
			displayAnswers();
			String answer3 = userInput.nextLine();
				if (answer3.equals ("B"))
			{
				System.out.println("\nCorrect\n");
				points++;
			}
			else 
			{
				System.out.println("Incorrect");
			}
			
//Q4				
				System.out.println("What will the following line print?");
				System.out.println (" Meat x = new Food()");
				System.out.println (" x.howIsCooked();\n ");
				displayAnswers();
				String answer4 = userInput.nextLine();
					if (answer4.equals("E"))
				{
					System.out.println("\nCorrect\n");
					points++;
				}
				else 
				{
					System.out.println("Incorrect");
				}
				
//Q5
					System.out.println("What will the following line print?");
					System.out.println (" Food x = new Meat()");
					System.out.println (" ((Meat)x).choice();\n ");
					displayAnswers();
					String answer5 = userInput.nextLine();
						if (answer5.equals("D"))
					{
						System.out.println("\nCorrect\n");
						points++;
					}
					else 
					{
						System.out.println("Incorrect");
					}
//Q6
						System.out.println("What will the following line print?");
						System.out.println (" Food x = new Meat()");
						System.out.println (" x.calories();\n ");
						displayAnswers();
						String answer6 = userInput.nextLine();
							if (answer6.equals("B"))
						{
							System.out.println("\nCorrect\n");
							points++;
						}
						else 
						{
							System.out.println("Incorrect");
						}
//Q7
							System.out.println("What will the following line print?");
							System.out.println (" Meat x = new Food()");
							System.out.println (" ((Food)x).choice(); \n");
							displayAnswers();
							String answer7 = userInput.nextLine();
								if (answer7.equals("E"))
							{
								System.out.println("\nCorrect\n");
								points++;
							}
							else 
							{
								System.out.println("Incorrect");
							}
//Q8							
								System.out.println("What will the following line print?");
								System.out.println (" Meat x = new Meat()");
								System.out.println (" ((Food)x).choice();\n ");
								displayAnswers();
								String answer8 = userInput.nextLine();
									if (answer8.equals("C"))
								{
									System.out.println("\nCorrect\n");
									points++;
								}
								else 
								{
									System.out.println("Incorrect");
								}
//Q9
									System.out.println("What will the following line print?");
									System.out.println (" Food x = new Meat()");
									System.out.println (" ((Meat)x).howItsCooked();\n ");
									displayAnswers();
									String answer9 = userInput.nextLine();
										if (answer9.equals("E"))
									{
										System.out.println("\nCorrect\n");
										points++;
									}
									else 
									{
										System.out.println("Incorrect");
									}
//Q10									
										System.out.println("What will the following line print?");
										System.out.println (" Meat x = new Meat()");
										System.out.println (" x.howItsCooked(); \n");
										displayAnswers();
										String answer10 = userInput.nextLine();
											if (answer10.equals("D"))
										{
											System.out.println("\nCorrect\n");
											points++;
										}
										else 
										{
											System.out.println("Incorrect");
										}
//Q11											
											System.out.println("What will the following line print?");
											System.out.println (" Meat x = new Meat()");
											System.out.println (" x.choice(); \n");
											displayAnswers();
											String answer11 = userInput.nextLine();
												if (answer11.equals("C"))
											{
												System.out.println("\nCorrect\n");
												points++;
											}
											else 
											{
												System.out.println("Incorrect");
											}
	//Q12								
												System.out.println("What will the following line print?");
												System.out.println (" Meat x = new Food()");
												System.out.println (" ((Food)x).choice();\n ");
												displayAnswers();
												String answer12 = userInput.nextLine();
													if (answer12.equals("E"))
												{
													System.out.println("\nCorrect\n");
													points++;
												}
												else 
												{
													System.out.println("Incorrect");
												}
													
								System.out.println ("You got " + points + "out of 12");
	}
	public static void displayAnswers()
	{
		System.out.println ("A. There are lots of types of foods. ");
		System.out.println ("B. The average recommended number of calories is 2000");
		System.out.println ("C. Great choice of meat! ");
		System.out.println ("D. Medium Rare ");
		System.out.println ("E. error ");
	}

}
