package baitap.giai_thuat;

import java.util.*;

public class GiaiMaThongDiep {
    public static void main(String[] args) {
        List<List<String>> dictionary = new ArrayList<>();
        String arr [] = {"homang","daita","bo","di","vao","tham","rung","chientruong","ho","daiuy","mang","vacsung","bova","ve","orung","nha","xanu","choi"};
        for (int i = 0; i < arr.length-1; i+=2) {
            List<String> list = new ArrayList<>();
            list.add(arr[i]);
            list.add(arr[i+1]);
            dictionary.add(list);
        }
        String s = "homangbovaorung";
        List<String> result = new ArrayList<>();
        Map<String,String> stringMap = new LinkedHashMap<>();
        List<String> stringList = new ArrayList<>();
        for (int k = 0; k <dictionary.size(); k++) {
            StringBuilder stringBuilder1 = new StringBuilder();
                if(s.contains(dictionary.get(k).get(0))){
                    stringMap.put(dictionary.get(k).get(0),dictionary.get(k).get(1));
                    stringBuilder1.append(dictionary.get(k).get(0));
                }
            stringList.add(String.valueOf(stringBuilder1));
        }
        List<String> list = new ArrayList<>();
        List<String> indexs = new ArrayList<>();
        indexs.add(stringList.get(0));
        String str2 = "";
        for (int i = 1; i <stringList.size(); i++) {
            if(stringList.get(0).contains(stringList.get(i))){
                str2 += stringList.get(i)+" ";
            }
        }
        indexs.add(str2.trim());
        StringBuilder stringBuilder;
        for (int i = 0; i <indexs.size(); i++) {
                stringBuilder= new StringBuilder(indexs.get(i)+" ");
                StringBuilder stringBuilder2 = new StringBuilder();
            for (int j = 0; j < indexs.get(i).length(); j++) {
                if(indexs.get(i).charAt(j)!=' '){
                    stringBuilder2 = stringBuilder2.append(indexs.get(i).charAt(j));
                }
            }
                    for (int k = 0; k <stringList.size() ; k++) {
                        if(stringBuilder2.indexOf(stringList.get(k))==-1){
                            stringBuilder2.append(stringList.get(k));
                            stringBuilder.append(stringList.get(k)+" ");
                        }
                        if(stringBuilder2.toString().equals(s)){
                            list.add(String.valueOf(stringBuilder).trim());
                            stringBuilder = new StringBuilder(indexs.get(i)+" ");
                            String newString = "";
                            for (int j = 0; j < indexs.get(i).length(); j++) {
                                if(indexs.get(i).charAt(j)!=' '){
                                     newString += indexs.get(i).charAt(j);
                                    stringBuilder2 = new StringBuilder(newString);
                                }
                            }
                }
            }
        }
        for (int i = 0; i <list.size(); i++) {
            String s1 = list.get(i);
            String s2 = "";
            String s3 = "";
            for (int j = 0; j < s1.length(); j++) {
                if(s1.charAt(j)!=' '){
                    s2 += s1.charAt(j);
                }else {
                    s3 += stringMap.get(s2)+ " ";
                    s2="";
                }
                if(j==s1.length()-1){
                    s3 += stringMap.get(s2) + " ";
                    s2="";
                }
            }
            result.add(s3.trim());
        }
        if (result.size()==0){
            result.add("Toto bo tay");
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
