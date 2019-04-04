public class runner {
  public static void main(String[] args) {
    // runner for robot
		// to do :
		Maze myMaze=new Maze();
RemberRobot tester=new RemberRobot(myMaze);
	tester.run();

		myMaze.printMaze();
		
  }
}