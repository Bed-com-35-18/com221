import java.util.Scanner; 

public class studentManagmentapp{
	public static void main(String[] args){

//creating Scanner input
Scanner input = new Scanner(System.in);
//pront to enter name
System.out.println("Enter your name");
String name = input.nextLine();
//declare an array
double [] G=new double[3];

String[] scores={"first G: ","second G: ","third G: "};

for(int K = 0; K<G.length;K++){

    System.out.println("enter "+ scores[K]);

    G[K]=input.nextDouble();
}
student info = new student(name,G);

info.getNumberOfStudents();

System.out.println(info.getPrintStudentsDetails());

    }

}