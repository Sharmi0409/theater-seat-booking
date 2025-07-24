package project;

import java.util.Scanner;

public class TheaterBookingSeat {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		TheaterService service = new TheaterServiceImp();
		int choice;
		 do {
	            System.out.println("\n--- Online Ticket Booking ---");
	            System.out.println("1. View All Shows");
	            System.out.println("2. Book a Seat");
	            System.out.println("3. View Seat Availability");
	            System.out.println("4. Cancel a Ticket");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch(choice)
	            {
	                case 1:
	                {
	                    service.viewallshows();
	                    break;
	                }
	                case 2:
	                {
	                    System.out.print("Enter Show ID: ");
	                    int bookId=sc.nextInt();
	                    System.out.print("How many seats do you want to book? ");
	                    int count = sc.nextInt();
	                    int[] seatNumbers = new int[count];
	                    for (int i = 0; i < count; i++) {
	                        System.out.print("Enter Seat Number: ");
	                        seatNumbers[i] = sc.nextInt();
	                    }

	                    service.bookaseat(bookId, seatNumbers);
	                    break;
	                }
	                    
	                case 3:
	                {
	                    System.out.print("Enter Show ID: ");
	                    int viewId=sc.nextInt();
	                    service.seats(viewId);
	                    break;
	                }
	                case 4:
	                {
	                    System.out.print("Enter Show ID: ");
	                    int cancelId = sc.nextInt();
	                    System.out.print("Enter Seat No to Cancel: ");
	                    int cancelSeat=sc.nextInt();
	                    service.cancelaseat(cancelId,cancelSeat);
	                    break;
	                }
	                case 5:
	                {
	                    System.out.println("Thank you for using the system!");
	                    break;
	                }
	                default:
	                {
	                    System.out.println("Invalid choice! Try again.");
	                }
	            }
	        } while (choice != 5);
		}
	 
	}


