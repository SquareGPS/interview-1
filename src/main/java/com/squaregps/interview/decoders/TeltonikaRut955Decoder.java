package com.squaregps.interview.decoders;

import com.squaregps.interview.LocationMessage;
import com.squaregps.interview.MessageDecoder;
import jakarta.annotation.Nonnull;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/**
 * Message decoder for the <a href="https://wiki.teltonika-networks.com/view/RUT955_GPS_Protocols">
 * Teltonika RUT955 protocol (codec 8).</a>
 */
public class TeltonikaRut955Decoder implements MessageDecoder {

    /**
     * {@inheritDoc}
     */
    @Nonnull
    @Override
    public List<LocationMessage> decode(@Nonnull ByteBuffer buf) {

        // TODO implement me

        return Collections.emptyList();
    }

}
