package jp.ac.uryukyu.ie.e195718;

import java.util.Scanner;
import java.io.*;

public class Numeron {

    static int eat = 0;
    static int bite = 0;
    static int ANSWERSIZE = 3;
    static int challengetime = 1;

    //説明を出力するメソッド
    public static void RuleDirection(){
        System.out.println("これからゲームを開始します"+
                "\n0~9までの3桁の数当てゲームです"+
                "\n同じ数字は2回以上使えません"+
                "\n１人、または２人で遊ぶことができます"+
                "\n数字と場所が同じ場合eat"+
                "\n数字は同じで場所が違う場合biteと表示されます");
    }
    //1人プレイか2人プレイか選択するメソッド
    public static int Chose(){
        String Output;
        System.out.println("何人でプレイしますか？");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1){
            Output = "１人プレイで開始します";
            System.out.println(Output);
        }
        if (num == 2){
            Output = "2人プレイで開始します";

            System.out.println(Output);
        }
        return num;
    }

    //ランダムに正解を作成するメソッド
    public static int[] MakeAnswer(){
        int answer[] = new int[ANSWERSIZE];
        for (int i=0; i<ANSWERSIZE; i++){
            answer[i] = (int)(Math.random()*10);
            for (int j=i-1; j>=ANSWERSIZE; j--){
                if(answer[i] == answer[j]){
                    while(answer[i] != answer[j]){
                        answer[i] = (int)(Math.random()*10);
                    }
                }
            }
        }
        return answer;
    }

    //入力された数字を読み込むメソッド
    public static int[] ScannedAnswer(){
        eat = 0;
        bite = 0;
        int[] answer = new int[ANSWERSIZE];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n"+challengetime+"回目のチャレンジ");
        for(int i = 0; i < answer.length; i++) {
            try {
                System.out.print((i+1)+"つ目の数字:");
                String a = reader.readLine();
                int b = Integer.parseInt(a);
                answer[i] = b;
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
                i--;
            }catch (IOException e) {
                System.out.println("形式が間違っています。");
                i--;
            }
        }
        return answer;

    }

    //解答と照らし合わせるメソッド
    public static void judge(int[] answer, int[] exeption){
        for(int i=0; i<ANSWERSIZE; i++){
            for(int j=0; j<ANSWERSIZE; j++){
                if(answer[i] == exeption[j]){
                    if(j==i){
                        eat++;
                    }else {
                        bite++;
                    }
                }
            }
        }
        String result = eat + "eat" + bite + "bite";
        System.out.println(result);
    }

}

