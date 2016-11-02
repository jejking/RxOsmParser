/* 
 *  Hamburg-Nord Geocoder, by John King.
 *  Copyright (C) 2014,  John King
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 *    
 */
package com.jejking.osm;

import java.time.ZonedDateTime;
import java.util.Optional;

/**
 * <p>OsmMetadata interface.</p>
 *
 * @author jejking
 * @version $Id: $Id
 */
public interface OsmMetadata {

    /**
     * <p>getId.</p>
     *
     * @return the id
     */
    Long getId();

    /**
     * <p>getTimestamp.</p>
     *
     * @return the timestamp
     */
    Optional<ZonedDateTime> getTimestamp();

    /**
     * <p>getChangeset.</p>
     *
     * @return the changeset
     */
    Optional<Long> getChangeset();

    /**
     * <p>getUid.</p>
     *
     * @return the uid
     */
    Optional<Long> getUid();

    /**
     * <p>getUser.</p>
     *
     * @return the user
     */
    Optional<String> getUser();
    
    /**
     * <p>getVersion.</p>
     *
     * @return the version
     */
    Optional<Long> getVersion();

}
