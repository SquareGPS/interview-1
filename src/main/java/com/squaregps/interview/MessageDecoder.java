package com.squaregps.interview;

import jakarta.annotation.Nonnull;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Geolocation message decoder
 */
public interface MessageDecoder {

    /**
     * Parses data packet received from the device
     *
     * @param buf incoming raw data packet
     * @return list of received messages (typically one)
     */
    @Nonnull
    List<LocationMessage> decode(@Nonnull ByteBuffer buf);

}
