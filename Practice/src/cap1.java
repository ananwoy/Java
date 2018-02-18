class cap1 {
cap1() { }
cap1(cap1 m) { m1 = m; }
cap1 m1;
public static void main(String[] args) {
cap1 m2 = new cap1();
cap1 m3 = new cap1(m2); m3.go();
cap1 m4 = m3.m1; m4.go();
cap1 m5 = m2.m1; m5.go();
}
void go() { System.out.println("hi "); }
}