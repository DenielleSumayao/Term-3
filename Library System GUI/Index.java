package BookRentalSystem;

public class Index {
	int _book1;
	int _book2;
	int _book3;
	int _book4;
	int _book5;

	public Index(int _book1, int _book2, int _book3, int _book4, int _book5)
  {
        this._book1 = _book1;
        this._book2 = _book2;
        this._book3 = _book3;
        this._book4 = _book4;
        this._book5 = _book5;

	}
	public int get_copy1() {
		return _book1;
	}
	public void set_copy1(int _copy) {
		this._book1 = _copy;
	}
	public int get_copy2() {
		return _book2;
	}
	public void set_copy2(int _copy) {
		this._book2 = _copy;
	}
	public int get_copy3() {
		return _book3;
	}
	public void set_copy3(int _copy) {
		this._book3 = _copy;
	}
	public int get_copy4() {
		return _book4;
	}
	public void set_copy4(int _copy) {
		this._book4 = _copy;
	}
	public int get_copy5() {
		return _book5;
	}
	public void set_copy5(int _copy) {
		this._book5 = _copy;
	}
}
