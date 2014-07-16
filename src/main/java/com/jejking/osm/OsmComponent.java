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

import org.joda.time.DateTime;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * <p>Abstract OsmComponent class.</p>
 *
 * @author jejking
 * @version $Id: $Id
 */
public abstract class OsmComponent implements OsmMetadata, OsmProperties {

    private final OsmMetadata metadata;
    private final ImmutableMap<String, String> properties;
    
    /**
     * <p>Constructor for OsmComponent.</p>
     *
     * @param metadata a {@link com.jejking.osm.OsmMetadata} object.
     * @param properties a {@link com.google.common.collect.ImmutableMap} object.
     */
    public OsmComponent(OsmMetadata metadata, ImmutableMap<String, String> properties) {
        this.metadata = checkNotNull(metadata);
        this.properties = checkNotNull(properties);
    }
    
    /** {@inheritDoc} */
    @Override
    public final ImmutableMap<String, String> getProperties() {
        return this.properties;
    }

    /**
     * <p>getId.</p>
     *
     * @see com.jejking.osm.OsmMetadata#getId()
     * @return a {@link java.lang.Long} object.
     */
    public final Long getId() {
        return metadata.getId();
    }

    /**
     * <p>getTimestamp.</p>
     *
     * @see com.jejking.osm.OsmMetadata#getTimestamp()
     * @return a {@link com.google.common.base.Optional} object.
     */
    public final Optional<DateTime> getTimestamp() {
        return metadata.getTimestamp();
    }

    /**
     * <p>getChangeset.</p>
     *
     * @see com.jejking.osm.OsmMetadata#getChangeset()
     * @return a {@link com.google.common.base.Optional} object.
     */
    public final Optional<Long> getChangeset() {
        return metadata.getChangeset();
    }

    /**
     * <p>getUid.</p>
     *
     * @see com.jejking.osm.OsmMetadata#getUid()
     * @return a {@link com.google.common.base.Optional} object.
     */
    public final Optional<Long> getUid() {
        return metadata.getUid();
    }

    /**
     * <p>getUser.</p>
     *
     * @see com.jejking.osm.OsmMetadata#getUser()
     * @return a {@link com.google.common.base.Optional} object.
     */
    public final Optional<String> getUser() {
        return metadata.getUser();
    }

    /** {@inheritDoc} */
    @Override
    public final Optional<Long> getVersion() {
        return metadata.getVersion();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "OsmComponent [metadata=" + metadata + ", properties=" + properties + "]";
    }
    
    
    
}
