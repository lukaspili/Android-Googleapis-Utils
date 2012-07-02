import android.location.Location;
import com.siu.android.andgapisutils.util.LocationUtils;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public class Foo {

    public static void main(String... args) {
        System.out.println((int) 48.856614 * 1e6);
        System.out.println((int) 2.352222 * 1e6);

        System.out.println(LocationUtils.getGeoPoint(48.856614, 2.352222).getLatitudeE6());

    }
}
