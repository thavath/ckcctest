package OOP;

import java.util.Scanner;

public class ClassObject {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	Room[] newRoom = new Room[3];
	
		for(int i=0; i<3 ; i++) {
			// room[i] = new Room();
			Room newRooml = new Room();
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Room Type : ");
			newRooml.roomType = input.next();
			System.out.println("Enter Room Number : ");
			newRooml.roomNumber= input.next();
			System.out.println("Enter Room Status : ");
			newRooml.Status = input.nextBoolean();
			System.out.println("Enter Room Price : ");
			newRooml.Price = input.nextDouble();
			
			newRoom[i] = newRooml;
		}		
		for(int i = 0; i< 3; i++) {
			System.out.println("Room "+ (i+1) + " Type is: " + newRoom[i].roomType);
			System.out.println("Room "+ (i+1) + " Number  is: " + newRoom[i].roomNumber);
			System.out.println("Room "+ (i+1) + " Status  is: " + newRoom[i].Status);
			System.out.println("Room "+ (i+1) + " Price  is: " + newRoom[i].Price);
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Status of Room"+(i+1));
			newRoom[i].CheckIn();
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Total Bed of Room"+(i+1));
			newRoom[i].GetNumberOfBed();
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Price of Room"+(i+1));
			newRoom[i].GetPrice();
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Update  room "+(i+1)+" type : ");
			Scanner in = new Scanner(System.in);
			String roomTypes = in.next();
			newRoom[i].setRoomType(roomTypes);
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Room "+ (i+1) + " Type is: " + newRoom[i].roomType);
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Total Bed of Room"+(i+1));
			newRoom[i].GetNumberOfBed();
		}
		
		for(int i = 0; i< 3; i++) {
			System.out.println("Price of Room"+(i+1));
			newRoom[i].GetPrice();
		}
		
	}

}
