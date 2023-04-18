import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Test
{
	public static void main(String[] args)
	{
		JavaCSG csg = JavaCSGFactory.createDefault();
		House house = new House();
		Chimney chimney = new Chimney();
		Door door = new Door();
		Geometry3D myHouse = house.createHouse(5,5,10);
		myHouse = csg.translate3D(-3,0,0).transform(myHouse);
		Geometry3D myRoof = house.createRoof(6.5,10);
		myRoof = csg.translate3D(0.9,0,0).transform(myRoof);
		Geometry3D myChimney = chimney.createChimney(8,0.5,1);
		myChimney = csg.translate3D(0,1,0).transform(myChimney);
		Geometry3D myDoor = door.createDoor(3,2,0.5);
		myDoor = csg.translate3D(-4,0,9.8).transform(myDoor);
		Geometry3D myHome = csg.union3D(myRoof, myHouse, myChimney, myDoor);
		csg.view(myHome);
		//cross
		/*Geometry3D box = csg.box3D(30, 10, 10, true);
		Geometry3D box2 = csg.box3D(10, 30, 10, true);
		Geometry3D cross = csg.union3D(box, box2);
		csg.view(cross);

		//ring
		JavaCSG csg = JavaCSGFactory.createDefault();
		Geometry3D ring = csg.torus3D(10, 20,60, 60, true);

		csg.view(ring);*/
	}
}
