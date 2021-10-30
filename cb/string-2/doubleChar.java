/* Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree" */

public String doubleChar(String str) {
  int slength = str.length();
  String answer = "";
  for (int i = 1; answer.length() < slength * 2; i++) { 
    answer += (str.substring(i - 1, i) + str.substring(i - 1, i));
  }
  return answer;
}