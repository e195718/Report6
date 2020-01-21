package jp.ac.uryukyu.ie.e195718;

public class Numeron2 extends Numeron{
    static int eat1 = 0;
    static int eat2 = 0;
    static int bite1 = 0;
    static int bite2 = 0;

    //*2人プレイ用のコード
    public void judge2(int[] answer1, int[] exeption1, int[] answer2, int[] exeption2){
        this.eat1 = eat1;
        this.eat2 = 0;
        this.bite1 = 0;
        this.bite2 = 0;
        for(int i=0; i<ANSWERSIZE; i++) {
            //1人目の入力した数字と相手の数字を比較するコード
            for (int j = 0; j < ANSWERSIZE; j++) {
                if (answer2[i] == exeption1[j]) {
                    if (j == i) {
                        eat1++;
                    } else {
                        bite1++;
                    }
                }
            }
        }
        System.out.println(eat1 + "eat" + bite1 + "bite");
        for(int k=0; k<ANSWERSIZE; k++){
            //2人目の入力した数字と相手の数字を比較するコード
            for(int l=0; l<ANSWERSIZE; l++ ){
                if(answer1[k] == exeption2[l]){
                    if(k==l){
                        eat2++;
                    }else {
                        bite2++;
                    }
                }
            }
        }
        System.out.println(eat2 + "eat" + bite2 + "bite");
    }
}

