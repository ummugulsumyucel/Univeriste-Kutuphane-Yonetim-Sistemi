
/**
 *
 * @author EXCALIBUR
 */
public class KitapFactory {
     public static KitapIslemleri createKitapIslemleri() {
        return new KitapIslemleri(DatabaseConnection.getInstance().getConnection());   
     
    }
}
