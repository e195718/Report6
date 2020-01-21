package jp.ac.uryukyu.ie.e195718;

public class Main extends Numeron2  {
    /*3桁の数を当てる数当てゲーム（ヌメロン）
     *3桁ずつ入力し、eat,biteを頼りにランダムに設定された数字を当てる
     * 1人プレイか2人プレイか選択できる
     * 1人プレイの場合、自動生成された数字を当てる
     * 2人プレイの場合、交互に3桁の数字を入力し正解を目指す*/
    public static void main(String[] args) {
        RuleDirection();
        int[] right_answer;
        int chosenumber;
        chosenumber = Chose();
        if (chosenumber == 1) {
            right_answer = MakeAnswer();

            while (true) {
                int[] user_answer;
                user_answer = ScannedAnswer();
                judge(right_answer, user_answer);
                challengetime++;
                if (eat == 3) {
                    System.out.println("正解です。ゲームを終了します。");
                    break;
                }
            }
        }
        if (chosenumber == 2){
            int[] player1Answer;
            int[] player2Answer;
            player1Answer = MakeAnswer();
            player2Answer = MakeAnswer();

            while(true) {
                Numeron2 numeron = new Numeron2();
                int[] player1Expect;
                int[] player2Expect;
                player1Expect = ScannedAnswer();
                player2Expect = ScannedAnswer();
                numeron.judge2(player1Answer, player1Expect, player2Answer, player2Expect);
                challengetime++;
                if ((Numeron2.eat1==3) || (eat2 == 3)) {
                    System.out.println("正解です。ゲームを終了します。");
                    break;
                }
            }
        }
    }
}

