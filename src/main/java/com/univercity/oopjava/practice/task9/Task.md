Обрати 1 вид серіалізації вручну ( тобто або 2 варіант або 3).
public static void main(String []args) throws Exception {
ObjectOutputStream objectOutputStream =
new ObjectOutputStream(new FileOutputStream(new File("line.data")));
Line l = new Line(new Point(0,0), new Point(1,1), "L1");
objectOutputStream.writeObject(l);
objectOutputStream.close();

ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("line.data")));
Line l1 = (Line)objectInputStream.readObject();
System.out.println(l1);


}