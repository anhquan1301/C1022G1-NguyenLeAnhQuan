package ss10.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i)+"");
            queue.offer(str.charAt(i)+"");
        }
        Stack<String>stack1 = new Stack<>();
        for (int j = 0; j <str.length() ; j++) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1.equals(queue) ? "Chuỗi Palindrome" : "Không phải chuỗi Palindrome");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập chuỗi bất kỳ: ");
//        String str = sc.nextLine();
//        Stack<String> stack = new Stack<>();
//        Queue<String> queue = new LinkedList<>();
//        String strStrack = null;
//        String strQueue = null;
//        for (int i = 0; i <str.length() ; i++) {
//            stack.push(str.charAt(i)+"");
//            queue.offer(str.charAt(i)+"");
//        }
//        for (int j = 0; j <str.length() ; j++) {
//            strStrack = stack.pop();
//            strQueue = queue.poll();
//        }
//        System.out.println(strQueue.equals(strStrack) ? "Chuỗi Palindrome"  : "Không phải chuỗi Palindrome");
//
    }
}
