package com.codemelodies.codemelodies.mappers;

import com.codemelodies.codemelodies.models.EventTag;
import com.codemelodies.codemelodies.models.EventTagDT;
import com.codemelodies.codemelodies.models.Wydarzenie;
import com.codemelodies.codemelodies.models.WydarzenieDT;

import java.util.stream.Collectors;

public class WydarzenieMapper {
    private static EventTagDT map(EventTag eventTag){
        EventTagDT eventTagDT = new EventTagDT();

        eventTagDT.setName(eventTag.getName());
        eventTagDT.setColor(eventTag.getColor());

        return eventTagDT;
    }

    public static WydarzenieDT map(Wydarzenie wydarzenie){
        WydarzenieDT wydarzenieDT = new WydarzenieDT();

        wydarzenieDT.setId(wydarzenie.getId());
        wydarzenieDT.setLokalizacja(wydarzenie.getLokalizacja());
        wydarzenieDT.setNazwa(wydarzenie.getNazwa());
        wydarzenieDT.setDataRozpoczecia(wydarzenie.getDataRozpoczecia());
        wydarzenieDT.setTagi(wydarzenie.getTags().stream().map(WydarzenieMapper::map).collect(Collectors.toList()));

        return wydarzenieDT;
    }
}
