package Week2Homework;
public class Loops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Loop to print all even numbers from 0 to 100 using WHILE
		System.out.println("Even numbers 0 to 100");
		int x = 0;
		while (x <= 100) {
			if ((x % 2) == 0)
			{
				System.out.println(x);
			} 
						x++;
		}
		
		//Loop to print every 3rd number from 100 to 0 using WHILE
		System.out.println();
		System.out.println("Every 3rd number from 100 to 0");
		int y = 100;
		while (y >= 0) {
			System.out.println(y);
			y -= 3;
		}
		
		//Loop to print every other number from 1 to 100 using FOR
		System.out.println();
		System.out.println("Every other number 1 to 100");
		for (int z = 1; z <= 100; z+=2) {
			System.out.println(z);
		}
		
		//Loop to print numbers 0 to 100, but #s div by 3 print Hello, #s div by 5 print World, 
		// #s div by both 3 and 5 print Hello World using FOR
		System.out.println();
		System.out.println("Hello World routine for #s div by 3 and 5");
		for (int index = 0; index <= 100; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println("Hello World");
			}
				else if (index % 5 == 0) {
					System.out.println("World");
				}
					else if (index % 3 == 0) {
						System.out.println("Hello");
					}
						else System.out.println(index);
					}
				}
	}
