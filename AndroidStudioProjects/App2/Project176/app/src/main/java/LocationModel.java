/**
 * Created by Mothupii_ on 2017-10-07.
 */

public class LocationModel
{
    private long id;
    private String full_names;

    public LocationModel(long id, String full_names, int autoLocation)
    {
        this.id = id;
        this.full_names = full_names;
        this.autoLocation = autoLocation;
    }

    private int autoLocation;
}
