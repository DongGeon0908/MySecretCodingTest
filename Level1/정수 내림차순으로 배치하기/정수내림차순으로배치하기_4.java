import java.util.Arrays;

public class ReverseInt {
    public int reverseInt(int n){
            String arr[]=String.valueOf(n).split("");

        Arrays.sort(arr);
        String str = "";

        for(int i=arr.length-1; i>=0; i--){
             str+= arr[i];
        }

        return Integer.parseInt(str);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}