public String backAround(String str) {
  String lastPos = str.substring(str.length()-1);
  return lastPos + str + lastPos;
}
