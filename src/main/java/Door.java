import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Door {
    JavaCSG csg = JavaCSGFactory.createDefault();

    public Geometry3D createDoor(double x, double y, double z) {
        Geometry3D outDoor = csg.box3D(x,y,z, false);
        Geometry3D innerDoor = csg.box3D((x*0.7),(y*0.7),z, false);
        Geometry3D door = csg.difference3D(outDoor,innerDoor);
        return door;
    }
}
