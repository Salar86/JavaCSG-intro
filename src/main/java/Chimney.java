import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Chimney {
    JavaCSG csg = JavaCSGFactory.createDefault();

    public Geometry3D createChimney(double x,double y,double z) {
        return csg.box3D(x,y,z,false);
    }

}
