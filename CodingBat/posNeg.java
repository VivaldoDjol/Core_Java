public boolean posNeg(int a, int b, boolean negative) {
  if(a<0 && b<0 && negative == true)return true;
   else if((a<0 && b>0 || a>0 && b<0) && negative == false)return true;
   return false;
}
/**
* CodingBat's Solution
* public boolean posNeg(int a, int b, boolean negative) {
*   if (negative) {
*     return (a < 0 && b < 0);
*   }
*   else {
*     return ((a < 0 && b > 0) || (a > 0 && b < 0));
*   }
* }
**/
