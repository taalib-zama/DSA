package PowerProgrammerQuestions.problemthird;

public class Solution {
    public static int smallestY(int x, int c){
        int y = 0;
        if(x==c && x>=1){
            y = x+1;
            return y;

        }
        if(c==1){
            y = x;
            return y;
        }
        for(y = 2; y <= 2000000000 ; y++)     //y strats from 2 and goes till 2*10^9.
            if(calculatCXY(x,y) ==c){
                return y;}
            else {
                continue;
        }
        return -1;
    }


    public static int calculatCXY(int x, int y){
        int cxy = 0;
        if(x<y){
            cxy = x;
        }
        else{
            cxy = calculatCXY(x/y, y) + x%y;
        }
        return cxy;
    }

}
