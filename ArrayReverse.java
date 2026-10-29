public class ArrayInArray{
public static void main(String[] args){

int [][]number = { 
                 {1, 2, 3,},
                 {4, 5, 6,},
                 {7, 8, 9,}
                 
                 };
  int[][]result = reverseArray(number);
  for(int count = 0; count < result.length; count++){
    for(int index = 0; index < result[count].length; index++){
     System.out.print(result[count][index]);
        }
      System.out.println();
     } 
  }
}


public static int[][] reverseArray(int[][]number){
for(int row = 0; row < number.length; row++){
  for(int count = 0; count < number[row].length; count++){
    for(int index = count + 1; index < number[row].length; index++){
      if(number[row][count] < number[row][index]){
        int temp = number[row][count];
        number[row][count] = number[row][index];
        number[row][index] = temp;
      }
    }
  }
  
}
return number;
}




