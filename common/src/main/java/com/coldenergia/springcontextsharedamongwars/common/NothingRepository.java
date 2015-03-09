package com.coldenergia.springcontextsharedamongwars.common;

import java.util.Set;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 10:48 AM
 */
public interface NothingRepository {

    Nothing find(Integer id);

    Set<Nothing> findAll();
}
