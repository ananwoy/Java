public class Tree {
	Oxygen treeFunc() {
		System.out.println("Tree gives oxygen");
		Oxygen o = new Oxygen();
		return o;
	}

	public static void main(String[] args) {
		Tree t = new Tree();
		System.out.println("start");
		t.treeFunc();
		System.out.println("stop");
	}
}





