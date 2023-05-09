package ua.ithillel.iodemo.adapter;

import ua.ithillel.iodemo.ext.USAService;

public class USAInfoServiceAdapter implements InfoService {
    private USAService usaService;

    public USAInfoServiceAdapter(USAService usaService) {
        this.usaService = usaService;
    }

    @Override
    public Information getInfo(String name) {
        String[] s = name.split(" ");
        return usaService.getInformation(s[0], s[1]);
    }
}
