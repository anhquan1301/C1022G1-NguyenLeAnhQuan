package baitap.giai_thuat;


import java.util.*;

public class b {
    public static void main(String[] args) {
        int count =0;
        String s1 = "baaacnd";
        String arr[] = s1.split("");
        String s2 = "aabbcd";
        String arr2[] = s2.split("");
        List<String> stringSet = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        Collections.addAll(stringSet,arr);
        Collections.addAll(strings,arr2);
        for (int i = 0; i <stringSet.size() ; i++) {
            for (int j = 0; j <strings.size() ; j++) {
                if(i>=0 && j>=0) {
                    if (stringSet.get(i).equals(strings.get(j))) {
                        count++;
                        stringSet.remove(stringSet.get(i));
                        i--;
                        strings.remove(strings.get(j));
                        j--;
                    }
                }
            }
        }
        System.out.println(count);
//        String s2 = "aabbcd";
//        String s1 = "baaacnd";
//        StringBuilder s3 = new StringBuilder();
//        for(int i=0;i<s1.length();i++){
//            for (int j=0; j <s2.length();j++) {
//                if(s1.charAt(i)==s2.charAt(j)) {
//                    s3.append(s1.charAt(i));
//                    s2 = s2.substring(0,j) + s2.substring(j+1);
//                    break;
//                }
//            }
//        }
//        System.out.println(s3);
//        String s1 = "2323231111234";
//        String arr1[] = s1.split("");
//        List<String> set = new ArrayList<>();
//        int count=0;
//        for(int i=0;i<arr1.length;i++){
//            set.add(i,arr1[i]);
//            Collections.sort(set);
//        }
//        System.out.println(set);
//        for (int i=0;i<set.size();i++){
//            if(i!=set.size()-1){
//            if(!set.get(i).equals(set.get(i+1))){
//                count++;
//            }
//            }
//        }
//        System.out.println(count+1);
//        Set<String> stringSet = new TreeSet<>();
//        Collections.addAll(stringSet,arr1);
//        System.out.println(stringSet.size());
//        System.out.println(stringSet);
    }
}
