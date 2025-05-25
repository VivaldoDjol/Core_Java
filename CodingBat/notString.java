public String notString(String str) {
  if(str.contains("not") && str.indexOf("not") == 0)return str;
    return ("not " + str);
}
