function reverseArray(number){
for(let row = 0; row < number.length; row++){
  for(let count = 0; count < number[row].length; count++){
    for(let index = count + 1; index < number[row].length; index++){
      if(number[row][count] < number[row][index]){
        let temp = number[row][count];
        number[row][count] = number[row][index];
        number[row][index] = temp;
      }
    }
  }
  
}
return number;
}

let number = [ 
                 [1, 2, 3,],
                 [4, 5, 6,],
                 [7, 8, 9]
                 
                 ];
  let result = reverseArray(number);

        console.log(result);
    
       
  



