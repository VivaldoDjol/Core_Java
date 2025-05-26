public String missingChar(String str, int n) {
    return str.substring(0, n) + str.substring(n + 1);
}

/**
* Another Solution
*public String missingChar(String str, int n) {
*    StringBuilder result = new StringBuilder();
*
*    for (int i = 0; i < str.length(); i++) {
*        if (i != n) {
*           result.append(str.charAt(i));
*        }
*    }
*
*    return result.toString();
*}
**/
