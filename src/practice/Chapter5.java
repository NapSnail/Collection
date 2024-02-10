package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {

		// 日付データの様式パターンを設定
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Taskインスタンスを入れる空のリストを作成。名前は行動(acts)から取った。
		List<Task> acts = new ArrayList<Task>();

		// Taskインスタンス生成しつつ、日付と予定をリストに格納。
		acts.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
		// （この部分は、問題文【面談】と表示例【面接】で異なっています。今回は問題文に合わせました。）
		acts.add(new Task(LocalDate.of(2021, 9, 15), "〇〇社面談"));
		acts.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
		acts.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
		acts.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));

		// TaskクラスのオブジェクトはComparableインターフェースを実装しているので、
		// Collections.sortで自然順序的な並びかえが可能となっている。今回は昇順なのでComparatorは省略。
		Collections.sort(acts);

		// Task内のLocalDate型をゲッターで取り出し、String型にフォーマット。
		for (Task act : acts) {
			String s;
			s = act.getD().format(f);

			// String型にフォーマットした日付と、ゲッターで取り出した予定をくっつけてコンソールに出力。
			System.out.println(s + ":" + act.getMove());
		}

	}

}
