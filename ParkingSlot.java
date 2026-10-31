import java.util.Scanner;
public class ParkingSlot{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int [] slot = new int[20];

String parkslot = """

=============================================
      WELCOME TO YABA PARKING SLOT
      
      Select an option:
      1.Park at a slot.
      2.Leave Slot.
      3.Display parking slot.
""";
System.out.print(parkslot);
//System.out.print("Pick an option:");
int parkslotChoice = input.nextInt();

switch(parkslotChoice){
  case 1:
          System.out.println("Park Slot:");
           
          for(int count = 0; count < slot.length; count++){
          
          slot[count] = 0;
          }
          
          for(int count = 0; count < slot.length; count++){
          
          
          System.out.print(slot[count] + " ");
          }
          }
          
//System.out.print();

boolean Park = true;
while(Park){

System.out.println("Enter a parking slot number between 1 and 20:");

int Parkslot = input.nextInt();

int indexOfParkslot = Parkslot -1;

if(Parkslot >= 0 && Parkslot < 20){
  if(slot[indexOfParkslot] == 0){
    slot[indexOfParkslot] = 1;
    
    System.out.println("Current parking slot");
    for(int count = 0; count < slot.length; count++){
     System.out.print(slot[count] + "  ");
     }
     System.out.println();
     
  }
  
  else{
      System.out.println("This parking slot is full.");
  }
  }
  else{
  System.out.println("Invalid parking slot number");
  }
  
  if(Parkslot == -1){
      break;
      }
      }
      }
      }
      
    






