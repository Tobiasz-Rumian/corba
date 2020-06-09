import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

import static org.omg.CORBA.ORB.init;

public class Server {
    static final java.lang.Object sync = new java.lang.Object();

    public static void main(String[] args) throws org.omg.CORBA.UserException, InterruptedException {
        ORB orb = init(args, null);
        ArytmetykaServant as = new ArytmetykaServant();
        orb.connect(as);

        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
        NamingContext ncRef = NamingContextHelper.narrow(objRef);
        NameComponent nc = new NameComponent("Arytmetyka", "");
        NameComponent[] path = {nc};
        ncRef.rebind(path, as);

        synchronized (sync) {
            sync.wait();
        }
    }
}
