public String front3(String str) {
  String concat;
  
  if (str.length() >= 3) {
    concat = str.substring(0, 3);
  }
  else {
    concat = str;
  }
  return concat + concat + concat;
}
