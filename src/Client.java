import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

import static org.omg.CORBA.ORB.init;

public class Client {
    public static void main(String[] args) throws org.omg.CORBA.UserException {
        ORB orb = init(args, null);
        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
        NamingContext ncRef = NamingContextHelper.narrow(objRef);
        NameComponent nc = new NameComponent("Arytmetyka", "");
        NameComponent[] path = {nc};
        arytmetyka proxy = arytmetykaHelper.narrow(ncRef.resolve(path));

        proxy.s1(1);
        proxy.s2(2);
        proxy.Suma();
        System.out.println(proxy.wynik());
    }
}
