package com.coldenergia.springcontextsharedamongwars.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 10:48 AM
 */
public class SimpleNothingRepository implements NothingRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleNothingRepository.class);

    private static final Map<Integer, Nothing> NOTHINGS;

    static {
        Map<Integer, Nothing> nothings = new HashMap<Integer, Nothing>();
        nothings.put(1, new Nothing(1, "nothing-1"));
        nothings.put(2, new Nothing(2, "nothing-2"));
        NOTHINGS = Collections.unmodifiableMap(nothings);
    }

    public SimpleNothingRepository() {
        LOGGER.info(SimpleNothingRepository.class.getName() + " has been instantiated");
    }

    @Override
    public Nothing find(Integer id) {
        return NOTHINGS.get(id);
    }

    @Override
    public Set<Nothing> findAll() {
        Set<Nothing> nothings = new HashSet<Nothing>();
        for (Map.Entry<Integer, Nothing> entry : NOTHINGS.entrySet()) {
            nothings.add(entry.getValue());
        }
        return nothings;
    }
}
