public String frontBack(String str) {
    int len = str.length();

    if (len == 0) return "";
    if (len == 1) return str;

    return str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0);
}
