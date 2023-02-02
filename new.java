import java.util.*;

class Newest {

int s;
public int sum(int a, int b){
	s = a+b;
	System.out.println("sum is" + s);
	return s;
}

public static void main(String args[]){
	Newest p = new Newest();
	p.sum(2,3);
}
}
