public String front22(String str) {
  String strUpdated;
  if (str == "") return "";
  if(str.length() < 2)return str.charAt(0) + str + str.charAt(0);
   else{
    return str.substring(0,2) + str + str.substring(0,2);
  }
}
