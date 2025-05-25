public boolean parrotTrouble(boolean talking, int hour) {
  while (hour < 7 || hour > 20){
    if(talking == true)return true;
    return false;
}
  return false;
}

/* 
* CodingBat's Solution
* public boolean parrotTrouble(boolean talking, int hour) {
* return (talking && (hour < 7 || hour > 20));
* }
*/
