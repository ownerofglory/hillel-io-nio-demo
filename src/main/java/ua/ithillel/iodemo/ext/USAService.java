package ua.ithillel.iodemo.ext;

import ua.ithillel.iodemo.adapter.Information;

public class USAService {
    public Information getInformation(String fistname, String lastname) {
        return new Information("Info for: " + fistname + " " + lastname);
    }
}
