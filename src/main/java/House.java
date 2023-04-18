import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class House {
    JavaCSG csg = JavaCSGFactory.createDefault();


    public House() {
    }

    public Geometry3D createRoof(double diameter, double height) {
        return csg.cylinder3D(diameter,height,3, false);
    }

    public Geometry3D createHouse(double x, double y, double z) {
        return csg.box3D(x,y,z,false);
    }



}
