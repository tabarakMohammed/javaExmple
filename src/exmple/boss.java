package exmple;

public class boss {

	public int here(int x) {
		System.out.println(x);
		return x;
   }
	public int here(int x,int y) {
		System.out.println(x+",,,,"+y);
		return (x*y);
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("iraq");
        System.out.println("---");
        boss x = new boss();
        
        System.out.println( x.here(1) );
        System.out.println( x.here(1, 2) );

        
        animal animal = new animal();
        animal inhirtedAnimal = new inhirtedAnimal();
        animal.sund();
        animal.slep();
        inhirtedAnimal.sund();
        inhirtedAnimal.slep();
        inhirtedAnimal.walkeOn();
        
	}

}
