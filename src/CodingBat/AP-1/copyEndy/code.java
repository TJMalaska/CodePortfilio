public int[] copyEndy(int[] nums, int count) {
  int[] arr = new int[count];
  int place = 0;
  for(int i = 0; i < nums.length; i++){
    int number = nums[i];
    if(number>=0&&number<=10){
      arr[place] = number;
      place++;
      if (place==count){
        return arr;
      }
    }
     if(number>=90&&number<=100){
      arr[place] = number;
      place++;
      if (place==count){
        return arr;
      }
    }
  }
  return arr;
}
