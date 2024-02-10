package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {

	// 日付(LocalDate)とタスク内容(String)を持つクラス作成
	protected LocalDate d;
	protected String move;

	// Taskクラスのコンストラクタ
	public Task(LocalDate d, String move) {
		this.d = d;
		this.move = move;

	}

	// ゲッター。予定を書き直さないなら、セッターはいらない…かなぁ。
	public LocalDate getD() {
		return d;
	}

	public String getMove() {
		return move;
	}

	// Comparableインターフェースのオーバーライド。
	// Task型の、日付の部分だけを取り出してCompareToと同じ動きをするようにした。
	@Override
	public int compareTo(Task t) {
		if (this.d.compareTo(t.getD()) < 0) {
			return -1;
		} else if (this.d.compareTo(t.getD()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
