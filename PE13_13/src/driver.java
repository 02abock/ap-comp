public class driver{
public static void main(String args[]) 
    { 
        int n = 4; // Number of disks 
        towerOfHanoi tester=new towerOfHanoi();
        tester.towerOfHanoiSolver(n, 'A', 'C', 'B');  // A, B and C are names of rods 
    }
}


