package javaIntro.greedy;

import java.util.Arrays;

/*https://www.hackerrank.com/challenges/angry-children/problem*/
public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {100,200,300,350,400,401,402};
        int k = 3;
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-k;i++){
            int temp=0;
            for(int j=0;j<k-1;j++){//As begin with i+j+1,so j<k-1
                temp+=(arr[i+j+1]-arr[i+j]);
            }
            if(temp<result)
                result = temp;

        }
        System.out.println(result);
    }

}
