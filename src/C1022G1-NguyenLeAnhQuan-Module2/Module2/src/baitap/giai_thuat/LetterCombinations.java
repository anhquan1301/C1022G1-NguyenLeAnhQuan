package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
//    public List<String> letterCombinations(String digits) {
//        List<String> combinations = new ArrayList<>();
//        if (digits == null || digits.length() == 0) {
//            return combinations;
//        }
//
//        // Ánh xạ chữ số sang các chữ cái tương ứng
//        Map<Character, String> digitToLetters = new HashMap<>();
//        digitToLetters.put('2', "abc");
//        digitToLetters.put('3', "def");
//        digitToLetters.put('4', "ghi");
//        digitToLetters.put('5', "jkl");
//        digitToLetters.put('6', "mno");
//        digitToLetters.put('7', "pqrs");
//        digitToLetters.put('8', "tuv");
//        digitToLetters.put('9', "wxyz");
//
//        // Hàm đệ quy tạo tất cả các kết hợp chữ cái
//        backtrack(digits, 0, new StringBuilder(), combinations, digitToLetters);
//        return combinations;
//    }
//
//    private void backtrack(String digits, int index, StringBuilder path, List<String> combinations, Map<Character, String> digitToLetters) {
//        if (path.length() == digits.length()) {
//            combinations.add(path.toString());
//            return;
//        }
//
//        char currentDigit = digits.charAt(index);
//        String letters = digitToLetters.get(currentDigit);
//
//        for (char letter : letters.toCharArray()) {
//            path.append(letter);
//            backtrack(digits, index + 1, path, combinations, digitToLetters);
//            path.deleteCharAt(path.length() - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        LetterCombinations lc = new LetterCombinations();
//        String inputDigits = "23";
//        List<String> outputCombinations = lc.letterCombinations(inputDigits);
//        System.out.println(outputCombinations);
//    }
public List<String> letterCombinations(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return combinations;
    }

    // Ánh xạ chữ số sang các chữ cái tương ứng
    String[] digitToLetters = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    combinations.add("");

    for (char digit : digits.toCharArray()) {
        String letters = digitToLetters[digit - '0'];
        List<String> newCombinations = new ArrayList<>();
        for (String combination : combinations) {
            for (char letter : letters.toCharArray()) {
                newCombinations.add(combination + letter);
            }
        }
        combinations = newCombinations;
    }

    return combinations;
}

    public static void main(String[] args) {
        LetterCombinations lc = new LetterCombinations();
        String inputDigits = "23";
        List<String> outputCombinations = lc.letterCombinations(inputDigits);
        System.out.println(outputCombinations);
    }
}