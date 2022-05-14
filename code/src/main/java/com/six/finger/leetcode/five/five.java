package com.six.finger.leetcode.five;

import java.util.ArrayList;
import java.util.List;

public class five {

    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();

        StringBuffer stringBuffer = new StringBuffer();

        tracinsg(res,stringBuffer,0,0,n);

        return  res;


    }

    private void tracinsg(List<String> res, StringBuffer stringBuffer, int open, int close, int n) {
        if (stringBuffer.length()==n*2){
            res.add(stringBuffer.toString());
        }

        if (close>open){
            return;
        }

        if (open<n){
            stringBuffer.append("(");
            tracinsg(res,stringBuffer,open+1,close,n);
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }


        if (close<open){
            stringBuffer.append(")");
            tracinsg(res,stringBuffer,open,close+1,n);

        }


    }
}
