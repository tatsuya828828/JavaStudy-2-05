// ジェネリクスは自分で定義したクラスで使うこともできる
// Eの部分は仮型引数と呼ばれる
// Eが実際にどのような型になるのかは、利用する際に実型引数で指定することできまる
public class Pocket<E> {
	private E data;// 格納用の変数

	public void put(E d) {
		this.data = d;
	}

	public E get() {
		return this.data;
	}
}
